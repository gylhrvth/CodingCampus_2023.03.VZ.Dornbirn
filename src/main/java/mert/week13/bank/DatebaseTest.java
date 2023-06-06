package mert.week13.bank;

import java.sql.Connection;
import java.sql.SQLException;

public class DatebaseTest {
    public static void main(String[] args) throws SQLException {
        DatebaseConection datebaseConection = new DatebaseConection();
        datebaseConection.connect();

        Connection connection = datebaseConection.getConn();

        DatebaseManager manager = new DatebaseManager(connection);

        Konto konto = manager.createKonto();



    }
}
