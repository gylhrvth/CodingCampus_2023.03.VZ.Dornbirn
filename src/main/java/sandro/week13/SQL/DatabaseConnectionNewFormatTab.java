package sandro.week13.SQL;

import lukas.week03.day4.Colors;

import java.sql.*;
import java.util.Vector;

public class DatabaseConnectionNewFormatTab {
    static String myColors[] =
    {
        Colors.COLORS[0],
        Colors.COLORS[7]
    };

    static String myBgColors[] =
    {
        Colors.BACKGROUND_COLORS[7],
        Colors.BACKGROUND_COLORS[0]
    };

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial?useUnicode=true&characterEncoding=utf8", "sandro", "sandro");

            PreparedStatement ps = conn.prepareStatement("Select * from Country join city on country.code = city.country where country.name like ? order by code");
            ps.setString(1, "a%");
            ResultSet rs = ps.executeQuery();

            int[] optimalwidth = getColOptWith(rs);

            ResultSetMetaData meta = rs.getMetaData();

//            Vector<String[]> data = new Vector<>();
//            rs.first();
//            while (rs.next()) {
//                String[] line = new String[meta.getColumnCount()];
//                for (int i = 1; i <= meta.getColumnCount(); i++) {
//                    if (meta.getColumnType(i) == Types.INTEGER){
//                        line[i - 1] = String.format("%" + optimalwidth[i] + "d", rs.getInt(i));
//                    } else {
//                        line[i - 1] = rs.getString(i);
//                    }
//                }
//                data.add(line);
//            }
            System.out.println("Hello World!");



            for (int i = 1; i <= meta.getColumnCount(); i++) {
                System.out.printf(Colors.COLORS[0] + Colors.BACKGROUND_COLORS[7]+"| "+ "%-" + (optimalwidth[i]+2) + "s" , meta.getColumnLabel(i)+" ");
            }
            System.out.println(" |"+ Colors.RESET);
            rs.beforeFirst();

            for (int i = 1; i <= meta.getColumnCount(); i++) {
                System.out.printf(Colors.COLORS[7] + Colors.BACKGROUND_COLORS[0] +"+ "+"%s","-".repeat((optimalwidth[i]+1))+" ");
            }
            System.out.println(" |"+ Colors.RESET);
            rs.beforeFirst();

            int currentLine = 0;
            while (rs.next()) {
                for (int i = 1; i <= meta.getColumnCount(); i++) {
                    System.out.printf(myColors[currentLine % myColors.length] + myBgColors[currentLine % myBgColors.length]+"| %"
                            + (meta.getColumnType(i) == Types.VARCHAR ? "-" : "")
                            + (optimalwidth[i]+2) + "s", rs.getString(i)+" ");
                }
                System.out.println(" |"+ Colors.RESET);

                ++currentLine;
            }

            } catch(SQLException e){
                throw new RuntimeException(e);
            }


    }


    //            for (int i = 1; i <= meta.getColumnCount() ; i++) {
//                System.out.println(meta.getColumnLabel(i) + " " + meta.getColumnType(i) + " " + meta.getColumnTypeName(i));
//            }
//            String[] name = new String[meta.getColumnCount()];
//            String[] code = new String[meta.getColumnCount()];
//            String[] capital = new String[meta.getColumnCount()];
//            String[] province = new String[meta.getColumnCount()];
//            float[] area = new float[meta.getColumnCount()];
//            int[] pop = new int[meta.getColumnCount()];
//
//            while (rs.next()) {
//                for (int i = 1; i <= meta.getColumnCount(); i++) {
//
//                    String n = rs.getString(i);


    public static int[] getColOptWith(ResultSet rs) throws SQLException {
        ResultSetMetaData meta = rs.getMetaData();
        int[] result = new int[1 + meta.getColumnCount()];
        for (int i = 1; i <= meta.getColumnCount(); i++) {
            result[i] = Math.max(result[i], meta.getColumnLabel(i).length());
        }
        rs.first();
        while (rs.next()) {
            for (int i = 1; i <= meta.getColumnCount(); i++) {
                String s = rs.getString(i);
                result[i] = Math.max(result[i], (s == null?4:s.length()));
            }
        }
        return result;

    }
}