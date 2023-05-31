package gyula.week13;

import java.sql.*;

public class DatabaseConn {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial?useUnicode=true&characterEncoding=utf8", "gyula", "gyula");

            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Country where name like ?");
            ps.setString(1, "A%");
            ResultSet rs = ps.executeQuery();

            int[] optimalWitdh = getColumnsOptimalWith(rs);
            printResultSet(rs, optimalWitdh);

            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static int[] getColumnsOptimalWith(ResultSet rs) throws SQLException{
        ResultSetMetaData meta = rs.getMetaData();
        int[] result = new int[1 + meta.getColumnCount()];
        for (int i = 1; i <= meta.getColumnCount(); i++) {
            result[i] = Math.max(result[i], meta.getColumnLabel(i).length());
        }
        rs.first();
        while (rs.next()){
            for (int i = 1; i <= meta.getColumnCount(); i++) {
                result[i] = Math.max(result[i], rs.getString(i).length());
            }
        }
        return result;
    }

    public static void printResultSet(ResultSet rs, int[] optimalWitdh) throws SQLException{
        ResultSetMetaData meta = rs.getMetaData();
        for (int i = 1; i <= meta.getColumnCount(); i++) {
            System.out.printf("|%-" + optimalWitdh[i] + "s", meta.getColumnLabel(i));
        }
        System.out.println("|");
        rs.first();
        while (rs.next()){
            for (int i = 1; i <= meta.getColumnCount(); i++) {
                System.out.printf("|%"
                                + (meta.getColumnType(i) == Types.VARCHAR?"-":"")
                                + optimalWitdh[i] + "s",
                        rs.getString(i));
            }
            System.out.println("|");
        }

    }
}
