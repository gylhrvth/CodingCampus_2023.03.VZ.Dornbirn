package joachim.Week13;

import java.sql.*;

public class DatabaseConn {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zoo?useUnicode=true&characterEncoding=utf8", "Joachim", "Joachim");

            PreparedStatement ps = conn.prepareStatement("select a.id, a.name, species, gender, h.Name, f.Name, f.Price  \n" +
                    "from animal a\n" +
                    "join habitat h on h.ID = a.Habitat_ID\n" +
                    "join food f on f.ID = a.Food_ID\n" +
                    "where f.Price < ?");
            // ps.setString(1, "A%");
            ps.setInt(1, 2000);
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
                String s = rs.getString(i);
                result[i] = Math.max(result[i], (s == null?4:s.length()));
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
        for (int i = 0; i <= meta.getColumnCount(); i++) {
            System.out.print("" + "-".repeat(optimalWitdh[i]) + "+");
        }
        System.out.println();
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
