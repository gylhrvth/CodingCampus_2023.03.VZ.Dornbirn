package sandro.week04;

import data.Texts;
import lukas.week03.day4.Colors;

import java.util.Locale;
import java.util.Scanner;

public class StringSearchAndReplace {
    public static void main(String[] args) {
        String text = Texts.HESSE;
        String search = userInput("Gib ein Wort ein das du auswecheln willst");
        String upper = Colors.COLORS[1] + search.toUpperCase() + Colors.RESET;


        String uppercase = text.replace(search,upper);

        System.out.println(uppercase);


    }


    public static String userInput(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }




}
