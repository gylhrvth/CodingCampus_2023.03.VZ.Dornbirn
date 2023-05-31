package mert.week13;

import java.sql.*;

public class mysql {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial?useUnicode=true&characterEncoding=utf8", "Mert", "sanane");

            PreparedStatement ps = conn.prepareStatement("Select * from city where name like ?");
            ps.setString(1, "A%");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData meta = rs.getMetaData();


            int[] colWidth = getColWtih(rs);

            for (int i = 1; i <= meta.getColumnCount(); i++) {
                System.out.printf("|%-" + colWidth[i] + "s", meta.getColumnLabel(i));
            }
            System.out.println("|");
            for (int i = 1; i <= meta.getColumnCount(); i++) {
                System.out.printf("|%-" + colWidth[i] + "s", "-".repeat(colWidth[i]));
            }
            System.out.println("|");
            rs.first();
            while (rs.next()) {
                for (int i = 1; i <= meta.getColumnCount(); i++) {
                    String orientation = "-";
                    if (meta.getColumnTypeName(i).matches("INT|FLOAT")) {
                        orientation = "";
                    }
                    System.out.printf("|%" + orientation + colWidth[i] + "s", rs.getString(i));
                }
                System.out.println("|");
            }

            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static int[] getColWtih(ResultSet rs) throws SQLException {
        ResultSetMetaData meta = rs.getMetaData();
        int[] result = new int[1 + meta.getColumnCount()];
        for (int i = 1; i <= meta.getColumnCount(); i++) {
            result[i] = Math.max(result[i], meta.getColumnLabel(i).length());
        }
        while (rs.next()) {
            for (int j = 1; j <= meta.getColumnCount(); j++) {
                String s = rs.getString(j);
                result[j] = Math.max(result[j], (s== null?4:s.length()));
            }
        }
        return result;
    }
}