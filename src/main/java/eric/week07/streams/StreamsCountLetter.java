package eric.week07.streams;

import lukas.week03.day4.Colors;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StreamsCountLetter {
    public static void main(String[] args) {
        File log = new File("assets/tmp/Logging.txt");
        File tab = new File("assets/tmp/Tabellarisch.txt");

        countLettersLogging(log);

        System.out.println("---");

        char count = 'A';
        countLetterA(tab, count);

        System.out.println("---");

        char[] letter = new char[]{'a', 'b', 'd'};
        countLetterArray(log, letter);

    }


    public static void countLettersLogging(File file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String input;
            int count = 0;
            while ((input = reader.readLine()) != null) {
                count += input.length();
            }
            System.out.println("Das File: " + file.getPath() + "\nenthält " + Colors.COLORS[2] + count + Colors.RESET + " Buchstaben.");
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Exception Thrown!");
            //noop
        }
    }

    public static void countLetterA(File file, char letter) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String input;
            int count = 0;
            while ((input = reader.readLine()) != null) {
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == 'A' || input.charAt(i) == 'a') {
                        count++;
                    }
                }
            }
            System.out.println("Das File: " + file.getPath() + "\nenthält den Buchstabe "
                    + Colors.COLORS[4] + letter + Colors.RESET + " "
                    + Colors.COLORS[2] + count + Colors.RESET + " mal.");
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Exception Thrown!");
            //noop
        }
    }

    public static void countLetterArray(File file, char[] letter) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String input;
            int count = 0;
            while ((input = reader.readLine()) != null) {
                for (int i = 0; i < input.length(); i++) {
                    for (int j = 0; j < letter.length; j++) {
                        if (letter[j] == input.charAt(i)){
                            count++;
                        }
                    }
                }
            }
            System.out.println("Das File: " + file.getPath() + "\nenthält die Buchstaben "
                    + Colors.COLORS[4] + new String(letter) + Colors.RESET + " "
                    + Colors.COLORS[2] + count + Colors.RESET + " mal.");
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Exception Thrown!");
            //noop
        }
    }
}
