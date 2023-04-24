package gyula.week08;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class CsvExample {
    public static void main(String[] args) {
        String[][] data = readCSV("csv/sales_100.csv", ",");

        sortDataByColumn(data, 2);
        printData(data);
        writeCSV(data, "assets/tmp/hello.csv");
    }


    public static void sortDataByColumn(String[][] data, int sortByColumn) {
        if (data.length == 0 || sortByColumn >= data[0].length) {
            return;
        }
        int dataType = getColumnTypeOfColumn(data, sortByColumn);
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length - i - 1; j++) {
                if (dataType < 2){ // Value Sort
                    try {
                        double valueJ = Double.parseDouble(data[j][sortByColumn]);
                        double valueJPO = Double.parseDouble(data[j + 1][sortByColumn]);
                        if (valueJ > valueJPO) {
                            String[] temp = data[j];
                            data[j] = data[j + 1];
                            data[j + 1] = temp;
                        }
                    } catch (NumberFormatException nfe){
                        nfe.printStackTrace();
                    }
                } else { // Lexicographical Sort
                    if (data[j][sortByColumn].compareTo(data[j + 1][sortByColumn]) > 0) {
                        String[] temp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = temp;
                    }
                }
            }
        }
    }

    public static String[][] readCSV(String filename, String separator) {
        InputStream inputStream = Objects.requireNonNull(CsvExample.class.getClassLoader().getResourceAsStream(filename));
        Scanner sc = new Scanner(inputStream);

        int countLines = countLinesInFile(filename);
        String[][] result = new String[countLines][];
        int currentLine = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            result[currentLine] = line.split(separator);
            ++currentLine;
        }
        sc.close();
        return result;
    }

    public static int countLinesInFile(String filename) {
        InputStream inputStream = Objects.requireNonNull(CsvExample.class.getClassLoader().getResourceAsStream(filename));
        Scanner sc = new Scanner(inputStream);

        int count = 0;
        while (sc.hasNextLine()) {
            sc.nextLine();
            ++count;
        }
        sc.close();
        return count;
    }

    public static int[] getMaxColumnWidth(String[][] data) {
        if (data.length == 0) {
            return new int[]{};
        }
        int[] columnWidth = new int[data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                columnWidth[j] = Math.max(columnWidth[j], data[i][j].length());
                /*
                if (data[i][j].length() > columnWidth[j]){
                    columnWidth[j] = data[i][j].length();
                }
                 */
            }
        }
        return columnWidth;
    }


    /**
     * @param data
     * @return 0 - for Intager
     * 1 - for Double
     * 2 - for String
     */
    public static int[] getColumnType(String[][] data) {
        if (data.length == 0) {
            return new int[]{};
        }
        int[] columnType = new int[data[0].length];
        for (int j = 0; j < data[0].length; j++) {
            columnType[j] = getColumnTypeOfColumn(data, j);
        }
        return columnType;
    }

    public static int getColumnTypeOfColumn(String[][] data, int column) {
        if (data.length == 0 || column >= data[0].length) {
            return 2;
        }
        int columnType = 0;
        for (int i = 1; i < data.length; i++) {
            try {
                Integer.parseInt(data[i][column]);
                columnType = Math.max(columnType, 0);
            } catch (NumberFormatException nfe) {
                try {
                    Double.parseDouble(data[i][column]);
                    columnType = Math.max(columnType, 1);
                } catch (NumberFormatException nfe2) {
                    columnType = Math.max(columnType, 2);
                }
            }
        }
        return columnType;
    }


    public static void printData(String[][] data) {
        int[] columnWidth = getMaxColumnWidth(data);
        int[] columnType = getColumnType(data);
        System.out.println(Arrays.toString(columnType));

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                String formatString = "";
                if (i > 0 && columnType[j] == 0) {
                    formatString = "| %" + columnWidth[j] + "s ";
                } else if (i > 0 && columnType[j] == 1) {
                    formatString = "| %" + columnWidth[j] + "s ";
                } else {
                    formatString = "| %-" + columnWidth[j] + "s ";
                }
                System.out.printf(formatString, data[i][j]);
            }
            System.out.println("|");
        }
    }

    public static void writeCSV(String[][] data, String filename){
        File f = new File(filename);
        f.getParentFile().mkdirs();
        try {
            PrintStream ps = new PrintStream(f);
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    if (j > 0) {
                        ps.print(";");
                    }
                    ps.print(data[i][j]);
                }
                ps.println();
            }
            ps.close();
        } catch (FileNotFoundException fnfe){
            System.out.println(filename + " is not reachable.");
        }
    }


}
