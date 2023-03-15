package joachim.week02;

import java.util.Scanner;
import joachim.Week01.Strukturiertes_Prog;

public class Menue {
    public static void main(String[] args) {
        menue();
        //answerYN("?");
    }

    public static void menue() {
        Scanner scotty = new Scanner(System.in);

        System.out.printf("Hallo im Druckerpalat!\nMöchtest du etwas Drucken?\n%15s\n", "(Yes/No)");
        boolean answerYN = true;
        while (answerYN) {
            System.out.println("Bitte wähle eine Form");
            System.out.println();
            System.out.println("1.) Triangle)");
            System.out.println("2.) TriangleCenter");
            System.out.println("3.) Kreis");
            System.out.println("4.) BigX");
            System.out.println();
            answerYN = answerYN("Noch 1x Mal?");
        }


    }

    public static boolean answerYN(String question) {
        Scanner scotty = new Scanner(System.in);

        boolean yesAnswer = false;
        boolean noAnswer = false;

        while (!yesAnswer && !noAnswer){
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
}