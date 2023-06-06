package sandro.week13.SQL;

import lukas.week03.day4.Colors;

import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial?useUnicode=true&characterEncoding=utf8", "sandro", "sandro");

            PreparedStatement ps = conn.prepareStatement("Select * from Country where name like ? order by code");
            ps.setString(1, "a%");
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData meta = rs.getMetaData();

            //            for (int i = 1; i <= meta.getColumnCount() ; i++) {
//                System.out.println(meta.getColumnLabel(i) + " " + meta.getColumnType(i) + " " + meta.getColumnTypeName(i));
//            }

            for (int i = 1; i <= meta.getColumnCount(); i++) {
                System.out.printf(Colors.COLORS[1] + "]>" + Colors.COLORS[7] + Colors.BACKGROUND_COLORS[3] + " %-" + meta.getPrecision(i) + "s " + Colors.RESET + Colors.COLORS[1] + "<[" + Colors.RESET, meta.getColumnLabel(i));
            }
            System.out.println();

            for (int i = 1; i <= meta.getColumnCount(); i++) {
                System.out.printf(Colors.COLORS[1] + "]>" + Colors.COLORS[0] + Colors.BACKGROUND_COLORS[7] + "%s"+ Colors.RESET + Colors.COLORS[1] + "<["+ Colors.RESET, "=".repeat(meta.getPrecision(i) + 2));
            }
            System.out.println();
            int backcolor = 3;
            int fontcolor = 7;
            while (rs.next()) {
                for (int i = 1; i <= meta.getColumnCount(); i++) {
                    if (meta.getColumnTypeName(i).equals("INT")) {
                        System.out.printf(Colors.COLORS[1] + "]>" + Colors.RESET + Colors.COLORS[fontcolor] + Colors.BACKGROUND_COLORS[backcolor] + " %" + meta.getPrecision(i) + "d " + Colors.RESET + Colors.COLORS[1] + "<[" + Colors.RESET, rs.getInt(i));
                    } else if (meta.getColumnTypeName(i).equals("FLOAT")) {
                        System.out.printf(Colors.COLORS[1] + "]>" + Colors.RESET + Colors.COLORS[fontcolor] +Colors.BACKGROUND_COLORS[backcolor] + " %" + meta.getPrecision(i) + ".2f " + Colors.RESET + Colors.COLORS[1] + "<[" + Colors.RESET, rs.getFloat(i));
                    } else {
                        System.out.printf(Colors.COLORS[1] + "]>" + Colors.RESET + Colors.COLORS[fontcolor] +Colors.BACKGROUND_COLORS[backcolor] + " %-" + meta.getPrecision(i) + "s " + Colors.RESET + Colors.COLORS[1] + "<[" + Colors.RESET, rs.getString(i));
                    }

                }
                if (backcolor == 3) {
                    backcolor = 7;
                } else {
                    backcolor = 3;
                }

                if (fontcolor == 7) {
                    fontcolor = 0;
                } else {
                    fontcolor = 7;
                }

                System.out.println();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }
}
