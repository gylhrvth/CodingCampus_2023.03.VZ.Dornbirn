package eric.week13;

import java.sql.*;

public class DataBaseConnector {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial?useUnicode=true&characterEncoding=utf8", "eric", "eric");

            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Country where name like ? ");
            ps.setString(1, "A%");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData meta = rs.getMetaData();

            for (int i = 1; i <= meta.getColumnCount(); i++) {
                int columnType = meta.getColumnType(i);
                if (columnType == Types.VARCHAR || columnType == Types.CHAR){
                    System.out.printf("%s%-" + meta.getPrecision(i) + "s||", (i == 1?"||":""), meta.getColumnLabel(i));
                } else {
                    System.out.printf("%s%" + meta.getPrecision(i) + "s||", (i == 1?"||":""), meta.getColumnLabel(i));
                }
            }

            rs.beforeFirst();

            System.out.println();
            for (int i = 1; i <= meta.getColumnCount(); i++) {
                System.out.printf("%s%" + meta.getPrecision(i) + "s||", (i == 1?"||":""), "=".repeat(meta.getPrecision(i)));
            }
            System.out.println();
            while (rs.next()){
                for (int i = 1; i <= meta.getColumnCount(); i++) {
                    int columnType = meta.getColumnType(i);
                    if (columnType == Types.VARCHAR || columnType == Types.CHAR){
                        System.out.printf("%s%-" + meta.getPrecision(i) + "s||", (i == 1?"||":""), rs.getString(i));
                    } else {
                        System.out.printf("%s%" + meta.getPrecision(i) + "s||", (i == 1?"||":""), rs.getString(i));
                    }
                }
                System.out.println();
            }

            rs.close();
            ps.close();
            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
