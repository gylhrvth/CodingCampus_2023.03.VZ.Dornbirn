package ayguen.week02;

import java.util.Scanner;

public class ConsoleInputText {
    public static void main(String[] args) {
        String name = readText("Was ist dein Name?");
        String answer = readText("Hallo " + name + ", wie geht es dir?");
        String answer1= readText("Wie kann ich dir behilflich sein? " + name);
        String answer2= readText("Vielen dank und schöner Tag noch!");

        System.out.println();
    }
    public static String readText (String Frage){
        Scanner sc = new Scanner(System.in);
        System.out.println(Frage);
        return sc.nextLine();
    }
}
