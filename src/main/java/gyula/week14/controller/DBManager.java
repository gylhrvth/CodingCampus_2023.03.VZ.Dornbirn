package gyula.week14.controller;

import gyula.week14.model.Konto;

import java.sql.*;
import java.util.List;
import java.util.Vector;

public class DBManager {
    private static DBManager instance;

    private Connection conn;

    private DBManager() {
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
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?useUnicode=true&characterEncoding=utf8", "gyula", "gyula");
            } catch (SQLException se) {
                se.printStackTrace();
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


    public Konto kontoOeffnen(String inhaber) {
        connect();
        if (conn == null) {
            System.out.println("Internal Error: \"kontoOeffnen\" ist nicht möglich");
            return null;
        }
        try {
            PreparedStatement ps = conn.prepareStatement("INSERT into Konto (id, inhaber, kontostand)\n" +
                    "VALUES (default, ?, 0)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, inhaber);
            int countRows = ps.executeUpdate();
            if (countRows > 0){
                ResultSet rs = ps.getGeneratedKeys();
                while (rs.next()){
                    int id = rs.getInt(1);
                    return new Konto(id, inhaber,0);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }


    public Konto kontoNachID(int id){
        connect();
        if (conn == null) {
            System.out.println("Internal Error: \"kontoNachID\" ist nicht möglich");
            return null;
        }
        try {
            PreparedStatement ps = conn.prepareStatement("select id, Inhaber, kontostand from konto\n" +
                    "where id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int dbId = rs.getInt(1);
                String inhaber = rs.getString(2);
                long kontostand = rs.getLong(3);
                return new Konto(dbId, inhaber,kontostand);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public List<Konto> kontoNachInhaber(String inhaber){
        Vector<Konto> result = new Vector<>();
        connect();
        if (conn == null) {
            System.out.println("Internal Error: \"kontoNachInhaber\" ist nicht möglich");
            return result;
        }
        try {
            PreparedStatement ps = conn.prepareStatement("select id, Inhaber, kontostand from konto\n" +
                    "where inhaber = ?");
            ps.setString(1, inhaber);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt(1);
                String dbInhaber = rs.getString(2);
                long kontostand = rs.getLong(3);
                result.add(new Konto(id, dbInhaber,kontostand));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public boolean kontoAenderung(Konto konto, long betrag){
        connect();
        if (conn == null) {
            System.out.println("Internal Error: \"kontoAenderung\" ist nicht möglich");
            return false;
        }
        try {
            PreparedStatement ps = conn.prepareStatement("UPDATE Konto set kontostand = ?\n" +
                    "where id = ?");
            ps.setLong(1, konto.getKontostand() + betrag);
            ps.setInt(2, konto.getId());
            int anzahlZeilen = ps.executeUpdate();
            if (anzahlZeilen > 0){
                konto.setKontostand(konto.getKontostand() + betrag);
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }


    public boolean kontoSchliessen(Konto konto){
        connect();
        if (conn == null) {
            System.out.println("Internal Error: \"kontoSchliessen\" ist nicht möglich");
            return false;
        }
        try {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM Konto \n" +
                    "where id = ?");
            ps.setInt(1, konto.getId());
            int anzahlZeilen = ps.executeUpdate();
            if (anzahlZeilen > 0){
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}