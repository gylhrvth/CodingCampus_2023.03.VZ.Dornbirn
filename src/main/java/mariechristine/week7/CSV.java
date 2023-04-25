package mariechristine.week7;

import java.io.InputStream;
import java.util.Objects;
import java.util.Scanner;

public class CSV {

    public static void main(String[] args) {
        InputStream inputStream = Objects.requireNonNull(CSV.class.getClassLoader().getResourceAsStream("csv/sales_100.csv"));
        Scanner sc = new Scanner(inputStream);

        int rows = 0;
        int col = 0;
        while (sc.hasNextLine()) {
            String text = sc.nextLine();
            System.out.println(text);
            ++rows;
            col = Math.max(col, text.split(",").length);
        }
        System.out.println("rows: " + rows);
        System.out.println("col : " + col);


        String[][] textArr = new String[rows][col];

        inputStream = Objects.requireNonNull(CSV.class.getClassLoader().getResourceAsStream("csv/sales_100.csv"));
        sc = new Scanner(inputStream);
        for (int i = 0; i < textArr.length; i++) {
            String text = sc.nextLine();
            String[] values = text.split(",");
            for (int j = 0; j < textArr[i].length; j++) {
                textArr[i][j] = values[j];
            }
        }
        System.out.println();
    }

    public static String printCSV(String grid) {

        String[][] textArr = new String[101][14];
        for (int i = 0; i < textArr.length; i++) {
            for (int j = 0; j < textArr.length; j++) {
                System.out.println("|-%20s " + textArr[i][j]);
            }
        }
        return grid;
    }
}
