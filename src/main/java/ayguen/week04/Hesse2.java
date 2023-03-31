package ayguen.week04;

import data.Texts;

import java.util.Locale;
import java.util.Scanner;

public class Hesse2 {

    public static void main(String[] args) {
        String text = Texts.HESSE;

        String index = text.replace("Hesse", "HESSE");
        System.out.println(index);
        System.out.println("Bitte geben Sie ein Wort ein um dieses im Text durch UPPERCASE zu ändern:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String inputUppercase = input.toUpperCase();
        String newHesse = text.replace(input, inputUppercase);
        System.out.println(newHesse);


    }

}




