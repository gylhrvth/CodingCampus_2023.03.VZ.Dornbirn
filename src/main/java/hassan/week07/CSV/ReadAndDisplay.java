package hassan.week07.CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Scanner;

public class ReadAndDisplay {
    public static void main(String[] args) {
        String csvFile = "/Users/zein/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/build/resources/main/csv/sales_100.csv";

        InputStream inputStream = Objects.requireNonNull(ReadAndDisplay.class.getClassLoader().getResourceAsStream("csv/sales_100.csv"));
        Scanner sc = new Scanner(inputStream);

        BufferedReader br = null;
        String line = "";
        String delimiter = ",";

        try {
            // Zähle die Anzahl der Spalten in der CSV-Datei
            br = new BufferedReader(new FileReader(csvFile));
            line = br.readLine();
            String[] columns = line.split(delimiter);
            int columnCount = columns.length;
            br.close();

            // Erstelle das Array für die Spalten mit der richtigen Größe
            String[][] data = new String[30][columnCount]; // Anzahl der Zeilen anpassen

            // Lese die CSV-Datei ein
            br = new BufferedReader(new FileReader(csvFile));
            int rowCount = 0;
            while ((line = br.readLine()) != null) {
                String[] cols = line.split(delimiter);
                for (int j = 0; j < cols.length; j++) {
                    data[rowCount][j] = cols[j];
                }
                rowCount++;
            }

            // Bestimme die Länge der längsten Zeichenfolge in jeder Spalte
            int[] columnLengths = new int[columnCount];
            for (int i = 0; i < columnCount; i++) {
                int maxLength = 0;
                for (int j = 0; j < data.length; j++) {
                    if (data[j][i].length() > maxLength) {
                        maxLength = data[j][i].length();
                    }
                }
                columnLengths[i] = maxLength;
            }

            // Gib die Daten als Tabelle aus
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < columnCount; j++) {
                    String cell = data[i][j];
                    int numSpaces = columnLengths[j] - cell.length() + 1;
                    System.out.print(cell);
                    for (int k = 0; k < numSpaces; k++) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}





























