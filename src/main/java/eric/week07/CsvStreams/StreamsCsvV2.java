package eric.week07.CsvStreams;

import gyula.week07.RessourceExample;

import java.io.InputStream;
import java.util.Objects;
import java.util.Scanner;

public class StreamsCsvV2 {
    public static void main(String[] args) {
        InputStream inputStream = Objects.requireNonNull(RessourceExample.class.getClassLoader().getResourceAsStream("csv/sales_100.csv"));
        Scanner sc = new Scanner(inputStream);

        while (sc.hasNextLine()){
            String text = sc.nextLine();
            System.out.println(text);
        }
    }

    public static void printCSV(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%-15s", data[i][j]);
            }
            System.out.println();
        }
    }
}
