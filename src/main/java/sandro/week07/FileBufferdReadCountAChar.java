package sandro.week07;

import java.io.*;

public class FileBufferdReadCountAChar {
    public static void main(String[] args) {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\ossdr\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\resources\\txt\\simpleText.txt"));

            String completeText = "";

            String text = reader.readLine();
            while (text != null) {
                completeText += text;
            //    completeText += System.lineSeparator();
                text = reader.readLine();
            }

            int totalChars = completeText.length();
            System.out.println("Sum of all Chars: " + totalChars);

            System.out.println("Char a : " + countChar(completeText, 'a'));

            char[] charsToCount = new char[]{'a', 'z', 'e'};
            int totalCount = charsCount(completeText, charsToCount);
            System.out.println("Chars : " + totalCount);
            System.out.println(completeText);
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

