package joachim.week02;

import joachim.Week01.Strukturiertes_Prog;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menue {
    public static void main(String[] args) {
        menue();
    }

    public static void menue() {
        Scanner scotty = new Scanner(System.in);

        System.out.printf("Hallo im Druckerpalsat!\nMöchtest du etwas Drucken?\n");
        boolean repeat = true;
        while (repeat) {
            System.out.println("Bitte wähle eine Form");
            System.out.println();
            System.out.println("1.) Triangle)");
            System.out.println("2.) TriangleCenter");
            System.out.println("3.) Kreis");
            System.out.println("4.) BigX");
            System.out.println("Press 0 to Exit");
            int choose = readAnswer();
            boolean commit = answerYN("Bist du wirklich wirklich sicher? So beinahe 100%?");
            if (commit) {
                if (choose == 1) {
                    int size = readAnswer2();
                    String letter = readAnswerChar();
                    Strukturiertes_Prog.printTriangle(letter, size);
                } else if (choose == 2) {
                    int size = readAnswer2();
                    String letter = readAnswerChar();
                    Strukturiertes_Prog.printtriangleCenter(letter, size);
                } else if (choose == 3) {
                    int size = readAnswer2();
                    String letter = readAnswerChar();
                    Strukturiertes_Prog.Kreis(letter, size);
                } else if (choose == 4) {
                    int size = readAnswer2();
                    String letter = readAnswerChar();
                    Strukturiertes_Prog.printBigX(letter, size);
                } else if (choose == 0) {
                    repeat = false;
                }
            } else {
                System.out.println("Dann doch nicht");
            }
        }
    }


    public static boolean answerYN(String question) {
        Scanner scotty = new Scanner(System.in);

        boolean yesAnswer = false;
        boolean noAnswer = false;

        while (!yesAnswer && !noAnswer) {
            System.out.println(question);
            String answer = scotty.nextLine();

            if (answer.equals("yes") || answer.equals("ja")) {
                yesAnswer = true;
            } else if (answer.equals("no") || answer.equals("nein")) {
                noAnswer = true;
            }
        }
        return yesAnswer;

    }

    public static int readAnswer() {
        Scanner scotty = new Scanner(System.in);
        int guess = -1;
        while ((guess < 0) || (guess > 5)) {
            try {
                System.out.println("Geben Sie eine Zahl zwischen 0 und 4 ein");
                guess = scotty.nextInt();
                scotty.nextLine();
            } catch (InputMismatchException ignore) {
                System.out.println("Eine Nummerische Zahl bitte!");
                scotty.nextLine();
            }
        }
        return guess;
    }

    public static int readAnswer2() {
        Scanner scotty = new Scanner(System.in);
        int size = -1;
        while ((size < 0) || (size > 21)) {
            try {
                System.out.println("Geben Sie eine Zahl zwischen 0 und 20 ein");
                size = scotty.nextInt();
                scotty.nextLine();
            } catch (InputMismatchException ignore) {
                System.out.println("Eine Nummerische Zahl bitte!");
                scotty.nextLine();
            }
        }
        return size;
    }

    public static String readAnswerChar() {
        System.out.println("Bitte Buchstaben eingeben");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}