package hassan.week07;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TabellarischDarstellen {
    public static void main(String[] args) {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};
        String[] header = {"Vorname", "Nachname", "Alter", "Ort", "Entfernung von der Hauptstadt"};
        String[][] data = new String[firstName.length][5];
        boolean[] isText = {true, true, false, true, false};
        for (int i = 0; i < firstName.length; i++) {
            data[i][0] = firstName[i];
            data[i][1] = lastName[i];
            data[i][2] = String.format("%d", age[i]);
            data[i][3] = place[i];
            data[i][4] = String.format("%.2f", distanceFromCapital[i]);
        }
        int[] columnWidths = getColumnWidths(header, data);
        String columnSep = " | ";
        int sumColumnWidths = 0;
        for (int width : columnWidths) {
            sumColumnWidths += width;
        }
        String rowSep = "-".repeat(sumColumnWidths + columnSep.length() * 4);
        try (PrintStream ps = new PrintStream(new FileOutputStream("assets/tmp/output.txt"))) {            /* Kopfzeile */
            ps.println(rowSep);
            for (int i = 0; i < header.length; i++) {
                if (i > 0) {
                    ps.print(columnSep);
                }
                ps.printf("%-" + columnWidths[i] + "s", header[i]);
            }
            ps.println();            /*            ps.printf("%-" + columnWidths[0] + "s%s%-" + columnWidths[1] + "s%s%-" + columnWidths[2] + "s%s%-" +                            columnWidths[3] + "s%s%-" + columnWidths[4] + "s%n", header[0], columnSep, header[1],                    columnSep, header[2], columnSep, header[3], columnSep, header[4]);             */
            ps.println(rowSep);            /* Datenzeilen */
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    if (j > 0) {
                        ps.print(columnSep);
                    }
                    ps.printf("%" + (isText[j] ? "-" : "") + columnWidths[j] + "s", data[i][j]);
                }
                ps.println();                /*                ps.printf("%-" + columnWidths[0] + "s%s%-" + columnWidths[1] + "s%s%" + columnWidths[2] + "d%s%-" +                                columnWidths[3] + "s%s%" + columnWidths[4] + ".2f%n", firstName[i], columnSep, lastName[i],                        columnSep, age[i], columnSep, place[i], columnSep, distanceFromCapital[i]);                 */
            }
            ps.println(rowSep);
        } catch (FileNotFoundException e) {
            System.out.println("Datei konnte nicht gefunden werden ");
        }
    }

    public static int[] getColumnWidths(String[] header, String[][] data) {
        int numColumns = header.length;
        int numRows = data.length;        /* initialize column widths with header lengths */
        int[] columnWidths = new int[numColumns];
        for (int i = 0; i < numColumns; i++) {
            columnWidths[i] = header[i].length();
        }        /* update column widths with maximum data length */
        for (int i = 0; i < numRows; i++) {
            String[] row = data[i];
            for (int j = 0; j < numColumns; j++) {
                String cell = row[j];
                columnWidths[j] = Math.max(columnWidths[j], cell.length());
            }
        }
        return columnWidths;
    }
}