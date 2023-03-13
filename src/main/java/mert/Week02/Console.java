package mert.Week02;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        String name = readText("Was ist dein Name?");
        System.out.println("Hallo " + name + "!");
        String answer = readText("Wie geht es dir?");
        System.out.println("Freut mich das es dir " + answer + " geht. Wie kann ich dir helfen?");

    }

    public static String readText(String Message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Message);
        return sc.nextLine();

    }


}
