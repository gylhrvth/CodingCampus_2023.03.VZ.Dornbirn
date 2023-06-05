package mariechristine.week13;


import java.sql.*;
import java.util.Scanner;

public class DatabaseConnection {

    public static void main(String[] args) {
        System.out.println("Welche Stadt suchen Sie?");
        Scanner sc = new Scanner(System.in);
        String searchText = sc.nextLine();

        try { //Verbindung zur SQL-Datenbank
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mondial?useUnicode=true&characterEncoding=utf8", "marie", "marie");

            //Abfrage; gesuchter Parameter wird mit einem Fragezeichen definiert
            PreparedStatement ps = conn.prepareStatement("SELECT Name, Population FROM city where name like ?");
            ps.setString(1, searchText + "%"); //index in SQL beginnt bei 1
            ResultSet rs = ps.executeQuery();

            /* Kopfzeile Ausdrucken */
            ResultSetMetaData md = rs.getMetaData();
            for (int i = 1; i <= md.getColumnCount() ; i++) {
                if (i > 1){
                    System.out.print(", ");
                }
                System.out.print(md.getColumnLabel(i));
            }
            System.out.println();

            /* Daten ausdrucken */
            while (rs.next()){
                System.out.printf("%-20s %10d\n",
                        rs.getString(1),
                        rs.getInt(2)
                        );

                /*
                for (int i = 1; i <= md.getColumnCount() ; i++) {
                    if (i > 1){
                        System.out.print(", ");
                    }
                    System.out.print(rs.getString(i));
                }
                System.out.println();
                 */
            }


            rs.close();
            ps.close();
            conn.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
