package mariechristine.week2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        String input = consoleInputText("Was ist dein Name?");
        System.out.println("Dein Name ist also " + input + ".");
        String age = consoleInputText("Wie alt bist du?");
        System.out.println("Du bist " + age + " Jahre alt.");
        String place = consoleInputText("Wo wohnst du?");
        System.out.println(place + " ist ein schöner Ort zum Wohnen.");
        String job = consoleInputText("Was ist dein Job?");
        System.out.println("Dein Job ist " + job + " .");

        consoleInputLoop("Was ist deine Zahl?");
        consoleInput2("Nenne eine beliebige Zahl!");

    }

    public static String consoleInputText(String input) {
        Scanner sc = new Scanner(System.in);
        System.out.println(input); //Hier wurde 'name' eingegeben, warum erkennt der Computer oben, dass bei der nächsten Frage nach 'age' gefragt wird
        return sc.nextLine();//Damit liest der Scanner, was ich in die Konsole schreibe. Der Scanner gibt dann den gelesenen String mit dem Befehl return als Rückgabewert der Methode zurück, wenn die Methode aufgerufen wird.
    }

    public static int consoleInputLoop(String message) {
        Scanner sc = new Scanner(System.in); //Neue Methode, neuer Scanner
        System.out.println(message);

        int value = 0; //Hier einen Wert initialisieren, der später als korrekter Userinput ausgegeben wird
        boolean numberValid = false; //Boolean, um zu prüfen, ob eine gültige Zahl eingeben wurde
        while (!numberValid) {
            try {
                value = sc.nextInt();//Damit liest der Scanner die eingegebene Zahl
                numberValid = true;
                System.out.println("Deine Zahl lautet: " + value);
            } catch (InputMismatchException ime) {
                System.out.println("Gib eine gültige Zahl ein.");
                sc.nextLine(); //Hier braucht es den sc.nextLine da sonst eine Endlosschleife mit der Fehlermeldung entsteht
            }
        }
        return value;
    }

    public static int consoleInput2(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);

        int input = 0;
        boolean inputValid = false;
        while (!inputValid) {
            try {
                input = sc.nextInt();
                inputValid = true;
                System.out.println("Deine Zahl lautet: " + input + "!");
            } catch (InputMismatchException ime) {
                System.out.println("Das ist keine gültige Zahl!");
                sc.nextLine();
            }
        }
        return input;
    }
}

