package benjamin.week02;

import java.util.Scanner;
import java.util.Random;


public class RateSpiel {

    static Random rand = new Random();

    public static void main(String[] args) {

        rateSpiel();

    }

    public static int rateSpiel() {
        System.out.println("Willkommen beim super coolen Zahlen Ratespiel!");
        System.out.println("Errate die Zahl zwischen 0 und 100!");
        int randomValue = rand.nextInt(101);
         System.out.println(randomValue);

        int count = 0;
        int number = -1;  //bezieht sich auf (number != randomValue)
        while ((count < 5) && (number != randomValue)){ //nach 5x Zahleneingabe ist Spiel zuende
            number = readNumber3("Gib die Zahl nun ein:", 1, 100);
            if (number < randomValue) {
                System.out.println("Die Zahl ist zu niedrig!");
            } else if (number > randomValue) {
                System.out.println("Die Zahl ist zu hoch!");
            }
            ++count;
        }
        if (number == randomValue) {
            System.out.println("Du hast Gewonnen!!!");
        } else{
                System.out.println("Du hast Verloren!");
            }

            return randomValue;
        }


        public static int readNumber3 (String message,int minValue, int maxValue){
            Scanner sc = new Scanner(System.in);
            int value = 0;
            boolean numberIsValid = false;
            while (!numberIsValid) {
                System.out.println(message);
                try {
                    String line = sc.nextLine();
                    value = Integer.valueOf(line);
                    if ((value >= minValue) && (value <= maxValue)) {
                        numberIsValid = true;
                    } else {
                        System.out.println("Die Zahl muss zwischen " + minValue + " und " + maxValue + " sein! ");

                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("Keine gültige Zahl.");
                }
            }
            return value;
        }
    }





