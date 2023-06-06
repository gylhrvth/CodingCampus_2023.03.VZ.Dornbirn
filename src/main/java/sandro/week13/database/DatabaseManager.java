package sandro.week13.database;


import sandro.week13.database.tables.Konto;
import sandro.week13.database.tables.Kunden;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {

    private Connection connection;

    public DatabaseManager() {
        Database database = new Database();
        this.connection = database.getConnection();
    }

    public Konto erstelleKonto() throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("INSERT INTO konto () VALUES()", Statement.RETURN_GENERATED_KEYS);
        stmt.executeUpdate();
        ResultSet set = stmt.getGeneratedKeys();
        set.first();
        long primaryKey = set.getLong(1);
        Konto k = new Konto();
        k.setKontoNummer(primaryKey);
        set.close();
        stmt.close();
        return k;
    }
//    public Konto kontoAuflassen () throws SQLException {
//        PreparedStatement stmt = connection.prepareStatement("DELETE FROM konto")
//    }

    public void verbindeKundeMitKonto(Kunden kunde, Konto konto, String rolle) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("INSERT INTO kundenkonto" +
                "(Kunden_KundenNummerFK, Konto_KontoNummerFK, Rolle)" +
                "VALUES(?, ?, ?)");
        stmt.setLong(1, kunde.getKundenNummer());
        stmt.setLong(2, konto.getKontoNummer());
        stmt.setString(3, rolle);
        stmt.executeUpdate();
        stmt.close();
    }

    public Kunden erstelleKunden(String name) throws SQLException {
        Kunden k = null;
        ResultSet set = null;
        PreparedStatement stmt = connection.prepareStatement("INSERT INTO kunden (name) VALUES(?)", Statement.RETURN_GENERATED_KEYS);
        try {
            stmt.setString(1, name);
            stmt.executeUpdate();
            set = stmt.getGeneratedKeys();

            set.first();
            long primarykey = set.getLong(1);
            k = new Kunden();
            k.setName(name);
            k.setKundenNummer(primarykey);
        } finally {
            if (set != null) {
                set.close();
            }
            stmt.close();
        }
        return k;
    }

    public List<Kunden> kundenListe() throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("SELECT KundenNummer, Name FROM Kunden");
        ResultSet set = stmt.executeQuery();

        List<Kunden> kundenlist = new ArrayList<>();

        while (set.next()) {
            Kunden k = new Kunden();

            k.setKundenNummer(set.getLong(1));
            k.setName(set.getString(2));

            kundenlist.add(k);
        }

        set.close();
        stmt.close();

        return kundenlist;
    }

    public void updateKunden(Kunden updatedkunde) throws SQLException {
        PreparedStatement stmt = connection.prepareStatement("UPDATE Kunden SET name = ? WHERE KundenNummer = ?");
        stmt.setString(1, updatedkunde.getName());
        stmt.setLong(2, updatedkunde.getKundenNummer());
        stmt.executeUpdate();
    }


}
