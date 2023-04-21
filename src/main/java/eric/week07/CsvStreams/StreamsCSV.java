package eric.week07.CsvStreams;

import gyula.week07.RessourceExample;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class StreamsCSV {
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
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%-30s", data[i][j]);
            }
            System.out.println();
        }
    }
}
