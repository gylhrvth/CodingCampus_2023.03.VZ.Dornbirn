package gyula.week02;

import java.util.Scanner;

public class ConsoleInputText {
    public static void main(String[] args) {
        String name = readText("Was ist dein Name?");
        System.out.println("Hallo " + name + "!");
    }

    public static String readText(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
}
