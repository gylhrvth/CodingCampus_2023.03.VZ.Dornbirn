package lukas.week02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RehearsalScanner {
    public static void main(String[] args) {
        //System.out.println("Die zahl ist: "+readNumber());

        System.out.println("Die zahl2 ist: "+readNumber2());
    }

    public static int readNumber() {
        System.out.println("Bitte geben sie eine Zahl ein:");
        Scanner sc = new Scanner(System.in);

        while(true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException nft) {
                System.out.println("Das ist keine gültige Zahl!!!");
                sc.nextLine();
            }
        }
    }

    public static int readNumber2() {
        System.out.println("Bitte geben sie eine Zahl ein:");
        Scanner sc = new Scanner(System.in);

        while(true) {
            if(sc.hasNextInt()) {
                return sc.nextInt();
            }
            System.out.println("Das ist keine gültige Zahl");
            sc.nextLine();
        }
    }
}
