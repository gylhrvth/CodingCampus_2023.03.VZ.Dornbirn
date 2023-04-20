package eric.week07.streams;

import lukas.week03.day4.Colors;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class StreamsCountUserWords {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        File file = new File("C:\\Users\\syn7e\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\resources\\txt\\Moby Dick.txt");
        int count = 0;

        System.out.println("Bitte gib ein Wort ein, wo die Gesamt Zahl wie oft es im Buch Moby Dick vorkommt," +
                " herausgefunden werden soll. ");
        String userInput = sc.nextLine();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String input;
            while ((input = reader.readLine()) != null) {
                String[] words = input.toLowerCase().split(userInput.toLowerCase());
                count += words.length - 1;
            }
            System.out.println("Count: " + count);
            System.out.println("Das File: " + file.getPath() + "\nenthält das Wort "
                    + Colors.COLORS[4] + userInput + Colors.RESET + " "
                    + Colors.COLORS[2] + count + Colors.RESET + " mal.");
            reader.close();
        } catch (IOException e) {
            System.out.println("Exception thrown");
            e.getStackTrace();
        }
    }
}
