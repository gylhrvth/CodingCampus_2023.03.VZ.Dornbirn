package mariechristine.week2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class InputZahl {
    public static void main(String[] args) {

//        frage1("Wie alt bist du?");
//        mitLoop("Wie alt bist du?");

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
// Diese Programm loopt nicht da es keine Schleife gibt. Entweder ein If oder While hinzufügen. Siehe mitLoop
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

}








