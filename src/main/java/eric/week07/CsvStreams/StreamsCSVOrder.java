package eric.week07.CsvStreams;

import gyula.week07.RessourceExample;

import java.io.InputStream;
import java.util.Objects;
import java.util.Scanner;

public class StreamsCSVOrder {
    public static void main(String[] args) {
        String[][] data = readCSV("csv/sales_100.csv", ",");
        printCSV(data);

    }

    public static String[][] readCSV(String fileName, String cvsSplitBy) {
        InputStream inputStream = Objects.requireNonNull(RessourceExample.class.getClassLoader().getResourceAsStream(fileName));
        Scanner sc = new Scanner(inputStream);
        int numRows = 0;
        while (sc.hasNextLine()) {
            sc.nextLine();
            numRows++;
        }
        sc.close();
        String[][] tempData = new String[numRows][];

        inputStream = Objects.requireNonNull(RessourceExample.class.getClassLoader().getResourceAsStream(fileName));
        sc = new Scanner(inputStream);
        int currentLine = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            tempData[currentLine] = line.split(cvsSplitBy);
            ++currentLine;
        }
        return tempData;
    }

    public static void printCSV(String[][] data) {
        int[] maxLengths = new int[data[0].length];
        for (int i = 0; i < data[0].length; i++) {
            maxLengths[i] = maxLength(data[0][i], getColumn(data, i));
            maxLengths[i] = Math.min(maxLengths[i], 200);
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("| %-" + maxLengths[j] + "s", data[i][j]);
            }
            System.out.println();
        }
    }
    public static int maxLength(String header, String[] arr) {
        int maxLength = header.length();
        for (String s : arr) {
            if (s.length() > maxLength) {
                maxLength = s.length();
            }
        }
        return maxLength;
    }
    public static String[] getColumn(String[][] data, int columnIndex) {
        String[] column = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            column[i] = data[i][columnIndex];
        }
        return column;
    }
}
