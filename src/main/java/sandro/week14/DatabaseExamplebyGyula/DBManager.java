package sandro.week14.DatabaseExamplebyGyula;

import sandro.week14.Model.Konto;
import sandro.week14.Model.Kunden;
import sandro.week14.Model.KundenKonto;
import sandro.week14.Model.Transaktion;

import java.math.BigDecimal;
import java.sql.*;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class DBManager {
    private static DBManager instance;
    private Connection conn;

    HashMap<Integer, Kunden> kundenCache;
    HashMap<Integer, Konto> kontoCache;

    private DBManager() {
        kundenCache = new HashMap<>();
        kontoCache = new HashMap<>();
    }

    public static DBManager getInstance() {
        if (instance == null) {
            instance = new DBManager();
        }
        return instance;
    }

    private boolean connect() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankomat?useUnicode=true&characterEncoding=utf8", "sandro", "sandro");
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public boolean disconnect() {
        boolean result = false;
        if (conn != null) {
            try {
                conn.close();
                result = true;
            } catch (SQLException e) {
            } finally {
                conn = null;
            }
        }
        return result;
    }




    public Konto kontoErstellen() {
        connect();
        if (conn == null) {
            System.out.println("Error : \"kontoErstellen\" ist nicht möglich!");
            return null;
        }
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO konto () VALUES()", Statement.RETURN_GENERATED_KEYS);
            int countRows = ps.executeUpdate();
            if (countRows > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    return new Konto(id, 0);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public Transaktion transaktionErstellen(Konto quelleKonto, Konto zielKonto, BigDecimal betrag) {
        connect();
        if (conn == null) {
            System.out.println("Error : \"transaktionErstellen\" ist nicht möglich!");
            return null;
        }
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO transaktion (RechnungsNummer,Betrag,Datum,Konto_ZielkontoNummerFK,Konto_QuellkontoNummerFK)"
                    + " VALUES(default,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setBigDecimal(1, betrag);
            //ps.setDate(3, new java.sql.Date(new GregorianCalendar(2023, 05, 5).getTimeInMillis());
            long currentTime = System.currentTimeMillis();
            ps.setDate(2, new java.sql.Date(currentTime));
            ps.setInt(3, zielKonto.getKontoNummer());
            ps.setInt(4, quelleKonto.getKontoNummer());
            int countRows = ps.executeUpdate();
            if (countRows > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                while (rs.next()) {
                    int rechnungsNr = rs.getInt(1);
                    return new Transaktion(rechnungsNr, betrag, new java.util.Date(currentTime), zielKonto, quelleKonto);
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }


    public Kunden kundenErstellen(String name) {
        connect();
        if (conn == null) {
            System.out.println("Error : \"kundenErstellen\" ist nicht möglich!");
            return null;
        }
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO kunden (Kundennummer, Name) VALUES(default,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, name);
            int countRows = ps.executeUpdate();
            if (countRows > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    Kunden k = new Kunden(id, name);
                    kundenCache.put(id, k);
                    return k;
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public KundenKonto kundenkontoErstellen(Konto kontoNummer, Kunden kundenNummer, String rolle) {
        connect();
        if (conn == null) {
            System.out.println("Error : \"kundenkontoErstellen\" ist nicht möglich!");
            return null;
        }
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO kundenkonto (Konto_KontoNummerFK, Kunden_KundenNummerFK, Rolle) VALUES(?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, kontoNummer.getKontoNummer());
            ps.setInt(2, kundenNummer.getKundenNummer());
            ps.setString(3, rolle);
            int countRows = ps.executeUpdate();
            if (countRows > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                while (rs.next()) {
                    // TODO: 05.06.2023 Hier kommt 1 Wert zurück, der neu angelegte PK
//                    int dbKontonr = rs.getInt(1);
//                    int dbKundennr = rs.getInt(2);
//                    String dbrolle = rs.getString(3);
//                    return new KundenKonto(dbKontonr, dbKundennr, dbrolle);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }


    public Konto kontoNachID(int KontoNummer) {
        if (kontoCache.containsKey(KontoNummer)){
            return kontoCache.get(KontoNummer);
        }
        connect();
        if (conn == null) {
            System.out.println("Error: \"kontonachID\" ist nicht möglich");
            return null;
        }
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(
                    "SELECT KontoNummer,Kontostand FROM konto WHERE KontoNummer = ?");
            ps.setInt(1, KontoNummer);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int dbKontoNummer = rs.getInt(1);
                int kontostand = rs.getInt(2);

                Konto konto = new Konto(dbKontoNummer, kontostand);
                kontoCache.put(KontoNummer, konto);
                return konto;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public Kunden kundeNachID(int KundenNummer) {
        if (kundenCache.containsKey(KundenNummer)){
            return kundenCache.get(KundenNummer);
        }
        connect();
        if (conn == null) {
            System.out.println("Error: \"kundeNachID\" ist nicht möglich");
            return null;
        }
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(
                    "SELECT KundenNummer,Name FROM kunden WHERE KundenNummer = ?");
            ps.setInt(1, KundenNummer);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int dbKundenNummer = rs.getInt(1);
                String name = rs.getString(2);
                Kunden kunde =  new Kunden(dbKundenNummer, name);
                kundenCache.put(KundenNummer, kunde);

                kontoNachKunden(kunde);
                return kunde;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    private void kontoNachKunden(Kunden kunde){
        connect();
        if (conn == null) {
            System.out.println("Error: \"kontoNachKunden\" ist nicht möglich");
            return;
        }
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "select Konto_KontoNummerFK, Rolle from kundenkonto k \n" +
                            "where Kunden_KundenNummerFK = ?;");
            ps.setInt(1, kunde.getKundenNummer());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int kontoID = rs.getInt(1);
                String rolle = rs.getString(2);
                Konto konto = kontoNachID(kontoID);

                kunde.addKontoRolle(konto, rolle);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return;
    }


    public KundenKonto kukoNachKoID(int KontoNummer) {
        connect();
        if (conn == null) {
            System.out.println("Error: \"kukoNachKoID\" ist nicht möglich");
            return null;
        }
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(
                    "SELECT Konto_KontoNummerFK, Kunden_KundenNummerFK, Rolle FROM kundenkonto WHERE Konto_KontoNummerFK = ?");
            ps.setInt(1, KontoNummer);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
//                int dbKontoNummer = rs.getInt(1);
//                int dbkundenNummer = rs.getInt(2);
//                String dbrolle = rs.getString(3);
//                return new KundenKonto(dbKontoNummer, dbkundenNummer, dbrolle);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public List<KundenKonto> kukoNachKuID(int KundenNummer) {
        Vector<KundenKonto> result = new Vector<>();
        connect();
        if (conn == null) {
            System.out.println("Error: \"kukoNachKuID\" ist nicht möglich");
            return result;
        }
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(
                    "SELECT Konto_KontoNummerFK, Kunden_KundenNummerFK, Rolle FROM kundenkonto WHERE Kunden_KundenNummerFK = ?");
            ps.setInt(1, KundenNummer);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
//                int dbKontoNummer = rs.getInt(1);
//                int dbkundenNummer = rs.getInt(2);
//                String dbrolle = rs.getString(3);
//                result.add(new KundenKonto(dbKontoNummer, dbkundenNummer, dbrolle));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }


    public List<Kunden> kundeNachName(String name) {
        Vector<Kunden> result = new Vector<>();
        connect();
        if (conn == null) {
            System.out.println("Error: \"kundeNachName\" ist nicht möglich");
            return result;
        }
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(
                    "SELECT KundenNummer,Name FROM kunden WHERE Name = ?");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int dbKundenNummer = rs.getInt(1);
                String dbname = rs.getString(2);
                result.add(new Kunden(dbKundenNummer, dbname));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public List<Konto> kontoNachKontostand(int Kontostand) {
        Vector<Konto> result = new Vector<>();
        connect();
        if (conn == null) {
            System.out.println("Internal Error: \"kontoNachKontostand\" ist nicht möglich");
            return result;
        }
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT KontoNummer,Kontostand FROM konto WHERE Kontostand = ?");
            ps.setInt(1, Kontostand);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int dbKontoNummer = rs.getInt(1);
                int kontostand = rs.getInt(2);
                result.add(new Konto(dbKontoNummer, kontostand));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public boolean kontoAenderung(Konto konto, int betrag) {
        connect();
        if (conn == null) {
            System.out.println("Internal Error: \"kontoAenderung\" ist nicht möglich");
            return false;
        }
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "UPDATE konto set Kontostand = ? WHERE Kontonummer = ?");
            ps.setInt(1, konto.getKontostand() + betrag);
            ps.setInt(2, konto.getKontoNummer());
            int anzahlZeilen = ps.executeUpdate();
            if (anzahlZeilen > 0) {
                konto.setKontostand(konto.getKontostand() + betrag);
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public boolean kundenAenderung(Kunden kunde, String name) {
        connect();
        if (conn == null) {
            System.out.println("Internal Error: \"kundenAenderung\" ist nicht möglich");
            return false;
        }
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "UPDATE kunden set name = ? WHERE kundennummer = ?");
            ps.setString(1, name);
            ps.setInt(2, kunde.getKundenNummer());
            int anzahlZeilen = ps.executeUpdate();
            if (anzahlZeilen > 0) {
                // todo warum brauch ich den set.name für die klasse?
//                kunde.setName(name);
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public boolean kundenKontoAenderung(KundenKonto kuko, String rolle) {
        connect();
        if (conn == null) {
            System.out.println("Internal Error: \"kundenKontoAenderung\" ist nicht möglich");
            return false;
        }
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "UPDATE kundenkonto set rolle = ? WHERE Konto_KontoNummerFK = ?");
            ps.setString(1, rolle);
            //ps.setInt(2, kuko.getKonto_kontoNummerFK());
            int anzahlZeilen = ps.executeUpdate();
            if (anzahlZeilen > 0) {
                kuko.setRolle(rolle);
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public boolean kontoSchliessen(Konto konto) {
        connect();
        if (conn == null) {
            System.out.println("Internal Error: \"kontoSchliessen\" ist nicht möglich");
            return false;
        }
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "DELETE FROM konto WHERE Kontonummer = ?");
            ps.setInt(1, konto.getKontoNummer());
            int anzahlZeilen = ps.executeUpdate();
            if (anzahlZeilen > 0) {
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public boolean kundeLoeschen(Kunden kunde) {
        connect();
        if (conn == null) {
            System.out.println("Internal Error: \"kundeLoeschen\" ist nicht möglich");
            return false;
        }
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "DELETE FROM kunden WHERE KundenNummer = ?");
            ps.setInt(1, kunde.getKundenNummer());
            int anzahlZeilen = ps.executeUpdate();
            if (anzahlZeilen > 0) {
                System.out.println("Kunde: " + kunde.getName() + " wurde gelöscht.");
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public boolean kundenkontoSchliessen(KundenKonto kuko) {
        connect();
        if (conn == null) {
            System.out.println("Internal Error: \"kundenkontoSchliessen\" ist nicht möglich");
            return false;
        }
        try {
            PreparedStatement ps = conn.prepareStatement(
                    "DELETE FROM kundenkonto WHERE Konto_kontoNummerFK = ?");
//            ps.setInt(1, kuko.getKonto_kontoNummerFK());
            int anzahlZeilen = ps.executeUpdate();
            if (anzahlZeilen > 0) {
                System.out.println("Kundenkonto: " + kuko + " wurde gelöscht.");
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }


}