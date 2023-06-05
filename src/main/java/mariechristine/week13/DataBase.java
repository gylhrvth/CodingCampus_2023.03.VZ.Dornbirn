package mariechristine.week13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    private Connection connection;

    public void connect() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?useUnicode=true&characterEncoding=utf8", "lukas", "lukas");
    }

    public Connection getConn() {
        return connection;
    }

    public void disconnect() {
        try {
            connection.close();
        } catch (SQLException exc) {
            //noop
        }
    }
}
