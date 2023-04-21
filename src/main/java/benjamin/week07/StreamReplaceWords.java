package benjamin.week07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StreamReplaceWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie das Wort ein das ersetzt werden soll:");
        String firstWord = sc.nextLine();

        System.out.println("Geben sie das Wort ein das ersetzt:");
        String secondWord = sc.nextLine();

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Beni\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\resources\\txt\\simpleText.txt"));








        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    //noop
                }
            }
        }
    }
}
