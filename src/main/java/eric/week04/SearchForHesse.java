package eric.week04;

import data.Texts;
import lukas.week03.day4.Colors;

import java.util.Scanner;

public class SearchForHesse {

    public static String input = Texts.HESSE;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        findHesse();

        System.out.println();
        System.out.println("-----------");
        System.out.println();

        String replace = input.replace("Hesse", "HESSE");
        System.out.println(replace);

        System.out.println();
        System.out.println("-----------");
        System.out.println();

        System.out.println("Gib ein Wort ein das ersetzt werden soll");
        String whatToReplace = sc.nextLine();
        System.out.println("Durch welches Wort soll es ersetzt werden?");
        String replacement = (Colors.COLORS[6] + sc.nextLine() + Colors.RESET);

        String askReplace = input.replace(whatToReplace, replacement);
        System.out.println(askReplace);
    }

    public static void findHesse() {
        String searchFor = "Hesse";
        int count = 0;
        int lastIndex = input.indexOf(searchFor);
        while (lastIndex != -1) {
            count++;
            System.out.println("Hesse wurde im text an Stelle: " + lastIndex + " gefunden!");
            lastIndex = input.indexOf(searchFor, lastIndex + 1);
        }
        System.out.println("Das Wort Hesse kommt im Text: " + count + " mal vor!");
    }
}