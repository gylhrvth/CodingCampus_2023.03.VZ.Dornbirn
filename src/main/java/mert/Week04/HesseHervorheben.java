package mert.Week04;

import data.Texts;

import java.util.Scanner;

public class HesseHervorheben {
    public static void main(String[] args) {
        String text = Texts.HESSE;
        String replacedText = text.replace("Hesse", "HESSE");

//        System.out.println(replacedText);

        Scanner sc = new Scanner(System.in);
        System.out.println("Welches wort soll groß geschrieben werdne?");
        String word = sc.nextLine();

        replacedText = replacedText.replace(word,word.toUpperCase());
        System.out.println(replacedText);
    }
}
