package eric.week07.streams;

import lukas.week03.day4.Colors;

import java.io.*;
import java.util.Scanner;

public class StreamsReplaceWords {
    private static Scanner inputSc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("C:\\Users\\syn7e\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\resources\\txt\\simpleText.txt"));
            StringBuilder text = new StringBuilder();
            while (sc.hasNextLine()) {
                text.append(sc.nextLine());
                text.append(System.lineSeparator());
            }
            sc.close();

            System.out.println("Das Wort das ersetzt werden soll:");
            String wordToReplace = inputSc.nextLine();

            System.out.println("Mit welchem Wort willst du " + wordToReplace + " ersetzen?");
            String replaceWith = inputSc.nextLine();

            String newText = text.toString().replace(wordToReplace, replaceWith);

            System.out.println(newText);
        } catch (IOException e){
            System.out.println("Exception Thrown!");
            e.getStackTrace();
        }
    }
}
