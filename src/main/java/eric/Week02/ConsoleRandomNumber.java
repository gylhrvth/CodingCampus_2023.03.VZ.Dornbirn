package eric.Week02;

import java.util.Scanner;
import java.util.Random;

public class ConsoleRandomNumber {
    static Random number = new Random();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = number.nextInt(100);

        System.out.println("Ratespiel: Wähle eine Zahl zwischen 1 - 100!");
        while (true) {
            while (!sc.hasNextInt()) {
                System.out.println("Keine Gültige Zahl!");
                sc.next();
            }

            int guess = sc.nextInt();

            if (guess < num) {
                System.out.println("Die Zahl ist zu Niedrig!");
            } else if (guess > num) {
                System.out.println("Die Zahl ist zu Hoch!");
            } else {
                System.out.println("Du hast Gewonnen!");
                break;
            }
        }
    }
}