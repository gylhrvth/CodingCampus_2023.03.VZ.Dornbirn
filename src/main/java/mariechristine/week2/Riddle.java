package mariechristine.week2;

import gyula.week02.ConsoleInputNumber;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Riddle {
    static Random ran = new Random();

    public static void main(String[] args) {

        System.out.println("Willkommen beim super coolen Zahlen Ratespiel!\nErrate die Zahl zwischen 0 und 100!");
        int goal = ran.nextInt(101); //Die Zielzahl entspricht der random number; diese ist kleiner als 101
        int guess = -1; //Die erratene Zahl soll im Plusbereich sein, Minus wird ausgeschlossen

        while (goal != guess){ //Das Ziel ist ungleich der erratenen Zahl
            guess = myReadNumber("Was ist deine Zahl?", 0, 100);
            if (guess < goal){ // Ist die erratene Zahl kleiner als das Ziel, dann "zu klein"
                System.out.println("Es ist zu klein");
            } else if (guess > goal) { //Ist die erratene Zahl größer als das Ziel, dann "zu groß"
                System.out.println("Es ist zu groß");
            }
        }
        System.out.println("Gratuliere! Du hast korrekt erraten.");

    }


    public static int myReadNumber(String message, int min, int max){
        int value = min - 1;

        Scanner sc = new Scanner(System.in);

        while (value < min || value > max) {
            System.out.println(message);
            try {
                value = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException ime) {
                sc.nextLine();
                System.out.println("Mir wäre lieber ein Zahl!");
            }
        }


        return  value;
    }
}



