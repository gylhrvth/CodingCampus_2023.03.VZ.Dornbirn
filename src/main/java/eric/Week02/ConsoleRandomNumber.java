package eric.Week02;

import java.util.Scanner;
import java.util.Random;

public class ConsoleRandomNumber {
    static Random number = new Random();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = number.nextInt(100);


        System.out.println("Ratespiel: Wähle eine Zahl zwischen 1 - 100!");
        boolean win = false;
        int count = 0;
        while (!win && count < 5) {
            while (!sc.hasNextInt()) {
                System.out.println("Keine Gültige Zahl!");
                sc.nextLine();
            }

            int guess = sc.nextInt();
            count++;

            if (guess < num) {
                System.out.println("Die Zahl ist zu Niedrig!");
                sc.nextLine();
            } else if (guess > num) {
                System.out.println("Die Zahl ist zu Hoch!");
                sc.nextLine();
            } else {
                System.out.println("Du hast Gewonnen!");
                win = true;
            }
        }
        if (!win){
            System.out.println("Du hast verloren! Die Zahl war: " + num);
        }
    }
}