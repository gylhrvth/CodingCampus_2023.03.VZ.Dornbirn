package hassan.week07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharCount {
    public static void main(String[] args) {
        File file = new File("/Users/zein/IdeaProjects/CodingCampus_2023.03.VZ.Dornbirn/src/main/resources/txt/simpleText.txt");

        String text = readTextFromFile(file);

        System.out.println("Anzahl der Buchstaben:  " + countChars(text));
        System.out.println("Anzahl der 'a'       :  " + countChar(text, 'a'));

        char[] charsToCount = new char[]{'a', 'z', 'e'};
        System.out.println();
        System.out.println("Anzahl der Buchstaben aus charsToCount: " + countCharArr(text, charsToCount));
    }

    public static String readTextFromFile(File file) {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    public static int countChars(String text) {
        return text.length();
    }
    public static int countChar(String text, char c) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
    public static int countCharArr(String text, char[] chars) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j < chars.length; j++) {
                if (text.charAt(i) == chars[j]) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
