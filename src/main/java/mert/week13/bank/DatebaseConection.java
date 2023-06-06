package mert.week13.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatebaseConection {
    private Connection conn;

    public void connect() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial?useUnicode=true&characterEncoding=utf8", "Mert", "sanane");

    }
    public Connection getConn(){
        return conn;
    }
}
