package eric.week14.controller;

import eric.week14.model.Kunde;
import eric.week14.model.KundenKonto;

import java.sql.*;

public class BankDataManager {
    private static BankDataManager instance;
    private Connection con;

    public static BankDataManager getInstance(){
        if (instance == null){
            instance = new BankDataManager();
        }
        return instance;
    }

//    private boolean connect() {
//        if (con == null){
//            try {
//                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?useUnicode=true&characterEncoding=utf8", "eric", "eric");
//            } catch (SQLException e) {
//                e.printStackTrace();
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private boolean disconnect(){
//        if (con != null){
//            try {
//                con.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public Kunde neuerKunde(String name){
//        connect();
//        if (con == null){
//            System.out.println("Fehler: \"neuerKunde\"");
//            return null;
//        }
//        try {
//            PreparedStatement ps = con.prepareStatement("INSERT INTO kunde \n" +
//                    "VALUES (default, ?)", Statement.RETURN_GENERATED_KEYS);
//            ps.setString(1, name);
//            int countRows = ps.executeUpdate();
//            if (countRows > 0){
//                ResultSet rs = ps.getGeneratedKeys();
//                while (rs.next()){
//                    int id = rs.getInt(1);
//                    return new Kunde(id, name);
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        disconnect();
//        return null;
//    }
//
//    public KundenKonto openKonto(String rolle,int kontoNr, int kundenNr){
//        connect();
//        if (con == null){
//            System.out.println("Fehler: \"openKonto\"");
//            return null;
//        }
//        try {
//            PreparedStatement ps = con.prepareStatement("INSERT INTO kundenkonto \n" +
//                    "VALUES (?, ?, ?)");
//            ps.setInt(1, kontoNr);
//            ps.setInt(2, kundenNr);
//            ps.setString(3, rolle);
//            int countRows = ps.executeUpdate();
//            if (countRows > 0){
//                ResultSet rs = ps.getGeneratedKeys();
//                while (rs.next()){
//                    int id = rs.getInt(1);
//                    return new KundenKonto(id, kundenNr, rolle);
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        disconnect();
//        return null;
//    }
}
