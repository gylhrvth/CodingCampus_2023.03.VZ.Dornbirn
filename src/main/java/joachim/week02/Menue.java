package joachim.week02;

import java.util.Scanner;
import joachim.Week01.Strukturiertes_Prog;

public class Menue {
    public static void main(String[] args) {
        menue();
        answerYN("?");
    }

    public static void menue() {
        Scanner scotty = new Scanner(System.in);

        System.out.printf("Hallo im Druckerpalat!\nMöchtest du etwas Drucken?\n%15s\n", "(Yes/No)");
        boolean AnswerYN = true;
        scotty.nextLine();
        while (AnswerYN) {
            System.out.println("Bitte wähle eine Form");
            System.out.println();
            System.out.println("1.) Triangle)");
            System.out.println("2.) TriangleCenter");
            System.out.println("3.) Kreis");
            System.out.println("4.) BigX");
            System.out.println();
        }


    }

    public static boolean answerYN(String Antwort) {
        Scanner scotty = new Scanner(System.in);
        System.out.println(Antwort);
        String ja = scotty.nextLine();

        return ja.equals("Yes") || ja.equals("Y");
    }
}