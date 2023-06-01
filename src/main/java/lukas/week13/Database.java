package lukas.week13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private Connection conn;

    public void connect() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?useUnicode=true&characterEncoding=utf8", "lukas", "lukas");
    }

    public Connection getConn() {
        return conn;
    }

    public void disconnect() {
        try {
            conn.close();
        } catch(SQLException exc) {
            //noop
        }
    }
}
