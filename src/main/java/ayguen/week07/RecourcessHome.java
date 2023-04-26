package ayguen.week07;

import gyula.week07.RessourceExample;
import lukas.week03.day4.Colors;

import java.awt.*;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Objects;
import java.util.Scanner;

public class RecourcessHome {
    public static void main(String[] args) {
        String[][] data = readCSV("csv/sales_100.csv");


        for (int i = 0; i < data.length; i++) {
            if (i == 0){
                System.out.print(Colors.COLORS[1]);
            }
            for (int j = 0; j < data[i].length; j++) {
                if (j > 0) {
                    System.out.print(" | ");
                }
                System.out.printf("%-40s", data[i][j]);
            }
            System.out.println();
            System.out.print(Colors.RESET);
            if (i == 0) {
                for (int j = 0; j < data[i].length; j++) {
                    if (j > 0) {
                        System.out.print(" | ");
                    }
                    System.out.printf("%-40s", "-".repeat(40));
                }
                System.out.println();
            }
        }
        System.out.println();
    }


    public static String[][] readCSV(String fileName) {
        String[][] data = new String[countLines(fileName)][];
        Reader reader = new InputStreamReader(Objects.requireNonNull(RessourceExample.class.getClassLoader().getResourceAsStream(fileName)));
        Scanner sc = new Scanner(reader);


        int currentLine = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            data[currentLine] = line.split(",");
            /*
            String[] spalten = line.split(",");
            data[currentLine] = new String[spalten.length];
            for (int i = 0; i < spalten.length; i++) {
                data[currentLine][i] = spalten[i];
            }
             */
            ++currentLine;
        }
        return data;
    }

    public static int countLines(String fileName) {
        Reader reader = new InputStreamReader(Objects.requireNonNull(RessourceExample.class.getClassLoader().getResourceAsStream(fileName)));
        Scanner sc = new Scanner(reader);

        int countzeilen = 0;
        while (sc.hasNextLine()) {
            sc.nextLine();
            ++countzeilen;
        }
        return countzeilen;
    }

    public static int max(String[] text) {
        int result = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i].length() > result) {
                result = text[i].length();


            }

        }
        return result;
    }

    public static void printCsvData(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                String cell = data[i][j];
                System.out.printf("%-50s", cell);
            }
            System.out.println();
        }
    }

}