package sandro.week02;

import java.util.Scanner;
public class ConInputText {
    public static void main(String[] args) {
        String name = readtext ("Was ist dein Name?");
        System.out.println("Hallo " + name + "!");
    }

    public static String readtext(String massage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(massage);
        return sc.nextLine();
    }
}
