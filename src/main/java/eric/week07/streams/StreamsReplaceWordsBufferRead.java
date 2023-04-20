package eric.week07.streams;

import lukas.week03.day4.Colors;

import java.io.*;
import java.util.Scanner;

public class StreamsReplaceWordsBufferRead {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        File file = new File("C:\\Users\\syn7e\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\resources\\txt\\simpleText.txt");


        System.out.println("Welches Wort möchtest du ersetzen?");
        String wordToReplace = sc.nextLine();

        System.out.println("Mit welchem Wort soll " + Colors.COLORS[3] + wordToReplace + Colors.RESET + " ersetzt werden ?");
        String replaceWith = sc.nextLine();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String input;
            while ((input = reader.readLine()) != null){
                input = input.replaceAll(wordToReplace, replaceWith);
            }
            System.out.println();
            System.out.println("Das Wort " + wordToReplace + " wurde mit " + replaceWith + " im Dokument ersetzt!");
            reader.close();
        } catch (IOException e) {
            System.out.println("Exceptíon Thrown");
            e.printStackTrace();
        }
    }
}
