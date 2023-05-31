package hassan;

import lukas.week03.day4.Colors;

import java.sql.*;
import java.util.Scanner;

public class DatabaseConn {
    public static void main(String[] args) {
        System.out.println("Welche Stadt suchen Sie? ");
        Scanner sc = new Scanner(System.in);
        String search = sc.nextLine();

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial?useUnicode=true&characterEncoding=utf8", "Hassan", "Zayn1407");

            PreparedStatement ps = conn.prepareStatement("SELECT * FROM City WHERE name like ?");
            ps.setString(1,  search + "%" );
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData meta = rs.getMetaData();


            int columnCount = meta.getColumnCount();

            int[] columnWidths = new int[columnCount];


            for (int i = 1; i <= columnCount; i++) {
                int maxLength = meta.getColumnLabel(i).length();
                rs.first();
                while (rs.next()) {
                    String value = rs.getString(i);
                    if (value != null && value.length() > maxLength) {
                        maxLength = value.length();
                    }
                }
                columnWidths[i - 1] = maxLength;

            }

            for (int i = 1; i <= columnCount; i++) {
                if (i > 1) {
                    System.out.print(Colors.COLORS[1] + " | " + Colors.RESET);
                }
                System.out.printf(Colors.BACKGROUND_COLORS[7] + "%-" + columnWidths[i - 1] + "s" + Colors.RESET, meta.getColumnLabel(i));
            }
            System.out.println();


            for (int i = 1; i <= columnCount; i++) {
                if (i > 1) {
                    System.out.print(Colors.COLORS[1] + "-+-" + Colors.RESET);
                }
                System.out.print(Colors.COLORS[1] + "-".repeat(columnWidths[i - 1]) + Colors.RESET);
            }
            System.out.println();

            rs.first();
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    if (i > 1) {
                        System.out.print(Colors.COLORS[1] + " | " + Colors.RESET);
                    }

                    String value = rs.getString(i);
                    if (meta.getColumnType(i) == Types.INTEGER || meta.getColumnType(i) == 7) {
                        System.out.printf(Colors.COLORS[6] + "%" + columnWidths[i - 1] + "s" + Colors.RESET, value);
                    } else {
                        System.out.printf(Colors.COLORS[6] + "%-" + columnWidths[i - 1] + "s" + Colors.RESET, value);
                    }
                }
                System.out.println();
            }

            rs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
