package joachim.week02;

import com.sun.source.tree.IfTree;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ConsoleInput {
    static Random zahl = new Random();

    public static void main(String[] args) {

//        frage1("wie alt bist du?");
//        mitLoop("Wie alt bist du?");
//        printRaetselSpiel2();
    }

    public static int frage1(String text) {
        Scanner scotty = new Scanner(System.in);
        System.out.println(text);
        int value = 0;
        try {
            value = scotty.nextInt();
            System.out.println("Du bist also " + value + "!");
        } catch (InputMismatchException ime) {
            System.out.println("Bitte eine Nummerische Zahl!");
            scotty.nextLine();
        }
// Diese Programm loopt ich da es keine Schleife gibt. Entweder ein If oder While hinzufügen. Siehe mitLoop
        return value;
    }

    public static int mitLoop(String message) {
        Scanner scotty = new Scanner(System.in);
        int value = 0;
        boolean numberIsValid = false;
        while (!numberIsValid) {
            System.out.println(message);
            try {
                String line = scotty.nextLine();
                value = Integer.valueOf(line);
                numberIsValid = true;
                System.out.println("Du bist also " + value + "!");
            } catch (NumberFormatException fehler) {
                System.out.println("Bitte eine Nummerische Zahl!");
            }

        }
        return value;

    }

    public static int readGuess() {
        Scanner scotty = new Scanner(System.in);
        int guess = -1;
        while ((guess < 0) || (guess > 100)) {
            try {
                guess = scotty.nextInt();
                scotty.nextLine();
            } catch (InputMismatchException ime) {
                System.out.println("Eine Nummerische Zahl bitte!");
                scotty.nextLine();
            }
        }
        return guess;
    }

    public static void printRaetselSpiel2() {
        int answer = zahl.nextInt(101);
        boolean ziel = false;
        // der boolean ist dazu da die while Schleife zu loopen wenn eine falsche Antwort gegeben wird.
        System.out.println("Geben Sie eine Zahl zwischen 0 und 100 ein");
        while (!ziel) {
            int guess = readGuess();
            if (answer == guess) {
                System.out.println("Good Job");
                ziel = true;
                // Durch das ziel = false statement wird die while Loop aufgelöst
            } else if (answer > guess) {
                System.out.println("Leider zu niedrig, versuche es nochmal");
            } else {
                System.out.println("Leider zu hoch, versuche es nochmal");
            }

        }
    }


}





