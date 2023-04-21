package mariechristine.week7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        String text = data.Texts.getSimpleText();
        printText(text);

        String regex = "";

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if(c == 'a') {
               count++;
            }
        }


    }

    public static String printText(String text) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\resources\\txt\\simpleText.txt");
            Scanner sc = new Scanner(fis);
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return text;
    }

    public static void countChar(String text, char letter) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\DCV\\IdeaProjects\\CodingCampus_2023.03.VZ.Dornbirn\\src\\main\\resources\\txt\\simpleText.txt");
            Scanner sc = new Scanner(fis);


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
