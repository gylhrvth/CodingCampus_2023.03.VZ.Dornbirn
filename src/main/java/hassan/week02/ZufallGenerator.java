package hassan.week02;

import java.util.Scanner;
import java.util.Random;


public class ZufallGenerator {
    static Random rand = new Random();

    public static void main(String[] args) {

        int target = rand.nextInt(101);
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("Rate Spiel (Made by Hassan)");
        System.out.println();
        System.out.println("Errate einen zahl zwischen 1 - 100: ");

        boolean win = false;
        while (!win) {
            while (!sc.hasNextInt()) {
                System.out.println("Bitte einen zahl geben");
                sc.nextLine();

            }
            int guess = sc.nextInt();
            sc.nextLine();

            if (guess < target) {
                System.out.println("Die Zahl ist zu niedrig, versuche es noch ein mal!!");
            } else if (guess > target) {
                System.out.println("Die Zahl ist zu Hoch, versuche es noch ein mal!!");
            } else {
                System.out.println("Gratuliere du hast 30.000$ Gewonnen!!:))))");
                win = true;
            }
        }

    }

}
