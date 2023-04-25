package mariechristine.week4;

import data.Texts;

import java.util.Arrays;
import java.util.Scanner;

public class Hesse {
    public static void main(String[] args) {
        String text = Texts.HESSE;

        countString();
        withoutArraySplit();
        upperCase();

    }


    public static void countString() {
        String text = data.Texts.HESSE;
        String[] word = text.split("\\s");
        int count = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i].contains("Hesse")) {
                count++;
                System.out.println("Hesse " + count + " auf Index: " + i);
            }
        }
    }

    public static void withoutArraySplit() {
        String text = data.Texts.HESSE;
        int count = 0;
        int index = text.indexOf("Hesse");
        while (index != -1) {
            count++;
            System.out.println("At position: " + index);
            index = text.indexOf("Hesse", index + 1);
        }
        System.out.println("Numbers of Hesse " + count);
    }

    public static void upperCase() {
        String text = Texts.HESSE;
        String uppercase = text.replace("Hesse", "HESSE");
        System.out.println(uppercase);

        Scanner sc = new Scanner(System.in);

        System.out.println("Welches Wort möchest du größer machen?");
        String word = sc.nextLine();
        String upperWord = text.replace(word, word.toUpperCase());
        System.out.println(upperWord);
    }
}



