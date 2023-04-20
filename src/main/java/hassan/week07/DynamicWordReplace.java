package hassan.week07;

import lukas.week03.day4.Colors;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DynamicWordReplace {
    public static void main(String[] args) {

        try {
            //text Lesen
            Scanner scanner = new Scanner(new File("/Users/zein/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/src/main/resources/txt/simpleText.txt"));
            StringBuilder text = new StringBuilder();
            while (scanner.hasNextLine()) {
                text.append(scanner.nextLine());
                text.append(System.lineSeparator());
            }

            scanner.close();

            //Benutzereingabe
            Scanner inputScanner = new Scanner(System.in);
            System.out.println(Colors.COLORS[2] + "Erstes Wort:  " + Colors.RESET);
            String firstWord = inputScanner.nextLine();

            System.out.println("Zweites Wort:  ");
            String secondWord = inputScanner.nextLine();
            inputScanner.close();


            //Replace
            String newtext = text.toString().replace(firstWord, secondWord);

            System.out.println(newtext);
        } catch (IOException e) {
            System.out.println("Fehler beim lesen des Datei!!");
        }
    }
}
