package benjamin.week07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StreamCountLetters {
    public static void main(String[] args) {

        BufferedReader reader = null;


        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Beni\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\resources\\txt\\simpleText.txt"));
            String completeText = "";
            String text = reader.readLine();
            while (text != null) {
                completeText += text;
                text = reader.readLine();
            }
            int totalChars = completeText.length();
            char[] charsToCount = new char[]{'a', 'z', 'e'};
            int totalCount = charsCount(completeText, charsToCount);

            System.out.println("Gesamtanzahl der Buchstaben: " + totalChars);
            System.out.println("Buchstabe kommt : " + countChar(completeText, 'a') + " mal vor");
            System.out.println("Buchstaben kommen: " + totalCount + " mal vor");

        } catch (IOException e) {
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

    public static int countChar(String text, int chartoCount) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == chartoCount) {
                count++;
            }
        }
        return count;
    }

    public static int charsCount(String text, char[] charsToCount) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            for (char c : charsToCount) {
                if (currentChar == c) {
                    count++;
                }
            }
        }
        return count;
    }
}



