package sandro.week02;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;
import java.util.random.RandomGenerator;

public class ConsoleInputAufgaben {
    static Random rand = new Random();
    public static void main(String[] args) {
        String name = readText ("Wie ist dein Name?");
        System.out.println("Hallo " + name + "!");
        int nummer = spielerZahl("Was ist deine Nummer",0,100);
        System.out.println("Deine Nummer ist = " +nummer);

        for (int i = 0; i < 20; i++) {
            int randomValue = rand.nextInt(100) + 1;
            System.out.printf("%2d - %3d\n", i, randomValue);
        }

    }
    public static String readText(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }
    public static int number(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        int value = sc.nextInt();

        return value;
    }
    public static int number2(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        int value = 0;
        try {
            value = sc.nextInt();
        } catch (InputMismatchException ime){
            System.out.println("Es ist keine gültige Zahl !!!");
        }

        return value;
    }
    public static int number3(String message){
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean numberIsValid = false;
        while (!numberIsValid) {
            System.out.println(message);
            try {
                value = sc.nextInt();
                sc.nextLine();
                numberIsValid = true;
            } catch (InputMismatchException ime) {
                System.out.println("Deine Zahl ist ungültig !!!");
                sc.nextLine();
            }
        }
        return value;
    }
    public static int spielerZahl(String message, int minValue, int maxValue){
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean numberIsValid = false;
        while (!numberIsValid) {
            System.out.println(message);
            try {
                String line = sc.nextLine();
                value = Integer.valueOf(line);
                if ((value >= minValue) &&(value <= maxValue)) {
                    numberIsValid = true;
                } else {
                    System.out.println("Die Zahl muss zwischen " + minValue + " und " + maxValue + " sein ");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Deine Zahl ist ungültig!!!");
            }
        }
        return value;
    }
public static int randomZahl (){
    int randomValue = rand.nextInt(100) + 1;
    //System.out.println(randomValue);
    return randomValue;
}

}
