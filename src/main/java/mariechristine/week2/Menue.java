package mariechristine.week2;

import mariechristine.Week1.ExercisesMethodsLoops1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menue {
    public static void main(String[] args) {

        System.out.println("Willkommen bei meinen Aufgaben! Was möchten Sie zeichnen?");
        choiceTask("Bitte wählen Sie eine Figur!\n1) Christbaum\n2) Quader\n3) Rhombus", 1, 3);

        int choice = 2;
        if (choice == 1) {
            printXMasTree();
        } else if (choice == 2) {
            int size = choiceTask("Wie groß möchtest du den Quader zeichnen?", 1, 20);
            ExercisesMethodsLoops1.printEmptySquare(" X ", 20);
        } else if (choice == 3) {
            int size = choiceTask("Wie groß möchtest du den Rhombus zeichnen?", 1, 20);
            ExercisesMethodsLoops1.printTriangleBottomLeft(" X ", 20);
        }

   }

    public static int choiceTask(String text, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean validChoice = false;

        while (!validChoice) {
            System.out.println(text);
            try {
                value = sc.nextInt();
                sc.nextLine();
                if (value <= max) {
                    validChoice = true;
                } else {
                    System.out.println("Bitte wähle eine Zahl zwischen " + min + " und " + max + " . ");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Ihre Eingabe ist ungültig. Wählen Sie 1, 2 oder 3.");
                sc.nextLine();
            }
        }
        return value;
    }

    public static void printXMasTree() {
        int size = choiceTask("Wie groß möchtest du den Weihnachtsbaum haben?", 1, 20);
        ExercisesMethodsLoops1.printChristmasTree(" X ", 20);
    }
}
