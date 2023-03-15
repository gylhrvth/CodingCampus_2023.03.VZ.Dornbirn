package ayguen.week02;

import java.util.Scanner;

public class Stringeinlesen {
    public static void main(String[] args) {
        String name = readText("Hallo, Wie ist dein Name");
        String frage= readText("Hallo, " + name + "Wie geht es dir?" );
    }

    public static String readText(String Frage){
        Scanner sc = new Scanner(System.in);
        System.out.println(Frage);
        return sc.nextLine();
    }
}
