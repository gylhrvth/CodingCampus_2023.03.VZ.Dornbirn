package mert.week14;

import java.sql.*;

public class DbManager {
    private static DbManager instance;
    private Connection conn;

    private DbManager() {

    }

    public static DbManager getInstance() {
        if (instance == null) {
            instance = new DbManager();
        }
        return instance;
    }

    public boolean connect() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?useUnicode=true&characterEncoding=utf8", "Mert", "sanane");
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

    public Kunde kundeErstellen(String name) {
        connect();
        if (conn == null) {
            System.out.println("Internal Error:  \"kundeErstellen\" ist nicht möglich");
            return null;
        }
        try {
            PreparedStatement ps = conn.prepareStatement("insert into kunde  (Name)\n" +
                    "values (?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, name);
            int countRows = ps.executeUpdate();
            if (countRows > 0) {
                ResultSet rs = ps.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    return new Kunde(1, name);
                }
            }


        } catch (SQLException s) {
            throw new RuntimeException(s);
        }
        return null;
    }

    public Kunde kundeNachId(int id) {
        connect();
        if (conn == null) {
            System.out.println("Internal Error:  \"kundeErstellen\" ist nicht möglich");
            return null;
        }
        try {
            PreparedStatement ps = conn.prepareStatement("select KundenId, name from kunde\n" +
                    " where KundenId = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int dbId = rs.getInt(1);
                String name = rs.getString(2);
                return new Kunde(dbId, name);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    //    public boolean kundeBearbeiten(Kunde kunde, String name) {
//        connect();
//        if (conn == null) {
//            System.out.println("Internal Error:  \"kundeBearbeiten\" ist nicht möglich");
//            return false;
//        }
//        try {
//            PreparedStatement ps = conn.prepareStatement("update Kunde set name = ?\n" +
//                    " where name = ?");
//
//            ps.setString(1, name);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                int dbId = rs.getInt(1);
//                String name = rs.getString(2);
//                return true;
//            }
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return false;
//    }
    public boolean KundeLoeschen(Kunde kunde) {
        connect();
        if (conn == null) {
            System.out.println("Internal Error:  \"KundeLoeschen\" ist nicht möglich");
            return false;
        }
        try {
            PreparedStatement pss = conn.prepareStatement("delete from kundenkonto\n" +
                    " where KundenID_FK = ?");

            PreparedStatement ps = conn.prepareStatement("delete from kunde\n" +
                    " where KundenId = ?");
//            pss.setInt(1,);
            //todo
            ps.setInt(1, kunde.getKundeId());

            int anzahlZeilen = ps.executeUpdate();
        if (anzahlZeilen >0 ){
            return true;
        }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

}
