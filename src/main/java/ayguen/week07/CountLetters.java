package ayguen.week07;

import java.io.*;
import java.util.Scanner;

public class CountLetters {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\resources\\txt\\simpleText.txt");
        String myText = "";



        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream(file));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                myText += line;
                myText += System.lineSeparator();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            close(scanner);
        }


        System.out.println(myText);

        System.out.println("Count chars: " + countChar(myText, 'a'));
        System.out.println("Count chars: " + countChar(myText, 'b'));
        System.out.println("Count chars: " + countChar(myText, 'c'));

        System.out.println(myText.length());

    }

    private static void close(Closeable reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {

            }
        }
    }

    public static int countChar(String text, char c) {


        return 0;
    }

    public static int countChars(String text, char[] test) {

        return 0;
    }
}
