package sandro.week13.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    private Connection conn;

    public Connection getConnection(){
        if (conn == null){
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankomat?useUnicode=true&characterEncoding=utf8", "sandro", "sandro");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return conn;
    }
    public void disconnect(){
        try {
            conn.close();
            conn = null;
        } catch (SQLException e) {
            //noop
        }
    }
}
