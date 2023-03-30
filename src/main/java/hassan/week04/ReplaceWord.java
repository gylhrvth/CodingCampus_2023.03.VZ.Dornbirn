package hassan.week04;

import data.Texts;

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        String text = Texts.HESSE;

        String replacedText = text.replace("Hesse","HESSE");

        System.out.println(replacedText);


        Scanner sc = new Scanner(System.in);
        System.out.println("Welches Wort soll in Uppercase umgewandelt werden?");
        String word = sc.nextLine();

        replacedText = replacedText.replace(word, word.toUpperCase());

        System.out.println(replacedText);
    }
}
