package gyula.week13;

import java.sql.*;
import java.util.Scanner;

public class DatabaseConn {

    public static void main(String[] args) {
        System.out.println("Welche Stadt suchen Sie?");
        Scanner sc = new Scanner(System.in);
        String searchText = sc.nextLine();

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial?useUnicode=true&characterEncoding=utf8", "gyula", "gyula");

            PreparedStatement ps = conn.prepareStatement("SELECT * FROM city where name like ?");
            ps.setString(1,  searchText + "%");
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
        rs.beforeFirst();
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
        rs.beforeFirst();
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
