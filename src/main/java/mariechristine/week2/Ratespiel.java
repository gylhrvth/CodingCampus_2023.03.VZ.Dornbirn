package mariechristine.week2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ratespiel {

    static Random ranNum = new Random();
    public static void main(String[] args) {

        System.out.println("Willkommen beim super coolen Ratespiel.\nErrate eine Zahl zwischen 0 und 100."); //1.
        int goalNum = ranNum.nextInt(101);
        int guess = -1;

        while (goalNum != guess) {
            guess = validInput("Was ist deine Zahl", 0, 100);
            if (guess < goalNum) {
                System.out.println("Die Zahl ist zu klein.");
            } else if (guess > goalNum) {
                System.out.println("Die Zahl ist zu groß.");
            }
        }
        System.out.println("Du hast gewonnen!");
    }

    public static int validInput(String message, int min, int max) { //2. Bestimmung wann eine Zahl gültig ist
        Scanner sc = new Scanner(System.in);

        int number = -1; //Hier Minus, damit nur positive Zahlen gültig sind
        boolean numberIsValid = false;
        while (!numberIsValid) {
            System.out.println(message);//Die Message "Was ist deine Zahl" wird hier deponiert, da solange die Zahl !valid ist, diese Frage kommen soll
            try {
                number = sc.nextInt();
                numberIsValid = true;
                if (number < min || number > max) {
                    System.out.println("Deine Zahl muss zwischen " + min + " und " + max + " liegen.");}
                } catch (InputMismatchException ime) {
                System.out.println("Das ist keine gültige Eingabe!");
                sc.nextLine();
            }
        }
        return number;
    }
}