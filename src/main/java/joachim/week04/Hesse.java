package joachim.week04;

import data.Texts;
import java.util.Arrays;
import java.util.Scanner;

import lukas.week03.day4.Colors;



public class Hesse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = data.Texts.HESSE;
        String regex = "[ \n,:]";
        String arr[] = text.split(regex);
        System.out.println("Gesamtanzahl: " + count(arr, "Hesse"));

        System.out.println("Was möchten Sie ersetzten?");
        regex= scanner.next();
        System.out.println("Was stattdessen schreiben");
        String replacement = scanner.next();
        replace(Texts.HESSE, regex, replacement);

//        System.out.println("Was möchten Sie suchen");
//        search(Texts.HESSE, scanner.next());
    }

    public static int count(String arr[], String regex) {
        int counts = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].matches(regex)) {
                counts++;
            }
        }
        return counts;
    }
    public static void replace(String text, String regex, String replacement) {
        String newText = text;
        while (newText.contains(regex)) {
            newText = newText.replace(regex, Colors.COLORS[5] + replacement.toUpperCase() + Colors.RESET);
        }
        System.out.println(newText);
    }
    public static void search(String text, String regex) {
        String newText = text.replace(regex, Colors.COLORS[4] +regex + Colors.RESET);
        System.out.println(newText);
    }

}


// data.Texts.HESSE