package benjamin.week07;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ReadAndDisplayCSV {
    public static void main(String[] args) {
        InputStream inputStream = Objects.requireNonNull(ReadAndDisplayCSV.class.getClassLoader().getResourceAsStream("csv/sales_100.csv"));

        String limiter = ",";

        String[][] data = readCSV(inputStream, limiter);

        int[] columnWidth = calculateWidth(data);
        printFormatedCSV(data, columnWidth);

    }

    public static String[][] readCSV(InputStream inputstream, String limiter){

        Scanner sc = new Scanner(inputstream);
        String line = sc.nextLine();
        String[] headers = line.split(limiter);
        int numCols = headers.length;
        String[][] data = new String[1][numCols];
        data[0] = headers;
        int numRows = 1;

        while (sc.hasNextLine()) {
            line = sc.nextLine();
            String[] value = line.split(limiter);
            if (numRows == data.length) {
                data = Arrays.copyOf(data, numRows + 1);
            }
            data[numRows] = value;
            numRows++;
        }
        sc.close();

        return data;
    }

    public static void printFormatedCSV( String[][] data, int[] columnWidths) {
        int numRows = data.length;
        int numCols = data[0].length;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.printf("|%" + columnWidths[j] + "s", data[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] calculateWidth(String[][] data) {
        int numRows = data.length;
        int numCols = data[0].length;
        int[] columnWidths = new int[numCols];
        for (int i = 0; i < numCols; i++) {
            columnWidths[i] = data[0][i].length();
            for (int j = 0; j < numRows; j++) {
                int valueLength = data[j][i].length();
                if (valueLength > columnWidths[i]) {
                    columnWidths[i] = valueLength;
                }
            }
        }
        return columnWidths;
    }

}









