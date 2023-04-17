package mariechristine.week2;

import mariechristine.Week1.MethodenSchleifen;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menue {
    public static void main(String[] args) {
        boolean repeat = true; //Abfrage am Schluss, ob nochmal gezeichnet werden soll
        while (repeat) {

            System.out.println("Willkommen bei meinen Aufgaben. Was möchten Sie zeichnen?\n1) Christbaum\n2) Quader\n3) Rhombus");
            int choice = readChoice("Bitte wählen Sie nun:", 1, 3);
            readText("Welches Zeichen soll verwendet werden?");
            int size = readChoice("Wie groß soll es sein?", 1, 10);
            if (choice == 1) {
                MethodenSchleifen.printXMasTree("X ", size);
            } else if (choice == 2) {
                MethodenSchleifen.printEmptySquare("X ", size);
            } else {
                MethodenSchleifen.printRhombus("X ", size);
            }

            repeat = readJaNein("Möchtest du noch etwas zeichnen? (j/n)");
        }
        System.out.println("Auf Wiedersehen!");

    }

    public static int readChoice(String text, int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println(text);

        int number = 0;
        boolean validInput = false;
        while (!validInput)
            try {
                number = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException ime) {
                System.out.println("Eingabe ungültig. Wähle eine Zahl zwischen " + min + " und " + max + " .");
                sc.nextLine();
            }
        return number;
    }

    public static String readText(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.println(text);
        return sc.nextLine();
    }

    public static boolean readJaNein(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String answer = sc.nextLine();

        return answer.equals("ja") || answer.equals("Ja") || answer.equals("j") || answer.equals("J");
    }
}
