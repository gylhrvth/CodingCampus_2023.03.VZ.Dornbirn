package mert.week13.bank;

import java.sql.*;

public class DatebaseManager {
    private Connection conn;

    public DatebaseManager (Connection conn){
        this.conn = conn;
    }
    public Konto createKonto() throws SQLException{
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO kunde () VALUES()", Statement.RETURN_GENERATED_KEYS);
        stmt.executeUpdate();
        ResultSet set = stmt.getGeneratedKeys();
        set.first();
        long primaryKey = set.getLong(1);
        Konto a = new Konto();
        a.setKontoID(primaryKey);
        set.close();
        stmt.close();
        return a;
    }
}
