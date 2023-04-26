package mariechristine.week7;

import java.io.*;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        String text1 = data.Texts.getSimpleText();

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
            int totalCount = countAllChar(completeText, charsToCount);

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

    public static int countChar(String text, char abc) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == abc) {
                count++;
            }
        }
        return count;
    }

    public static int countAllChar(String text, char[] abc) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            for (char c : abc) {
                if (currentChar == c) {
                    count++;
                }
            }
        }
        return count;
    }
}
