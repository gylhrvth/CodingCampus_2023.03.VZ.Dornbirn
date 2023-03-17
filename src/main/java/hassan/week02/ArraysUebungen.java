package hassan.week02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysUebungen {

    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Halloooo");
        int arrayspace = readArrayspace("Wie Groß willst du deine Array haben?");
        int[] countNumber1 = decreasingArray(arrayspace);
        int[] countNumber2 = increasingArray(arrayspace);
        int[] countNumber3 = makeacopy(countNumber2);
        int[] countNumber4 = randomArray(arrayspace);
        int[] crazyRange = crazyRange(arrayspace);
        int randSumme = randSumme(crazyRange);
        int[] random30 = randomzaehlen30(arrayspace);


        System.out.println("Aufgabe 1, Plus");
        System.out.println(Arrays.toString(countNumber2));
        System.out.println("-----------");
        System.out.println("Aufgabe 1, Minus");
        System.out.println(Arrays.toString(countNumber1));
        System.out.println("--------------------");
        System.out.println("Aufgabe Kopie (von erste aufgabe)");
        System.out.println(Arrays.toString(countNumber3));
        System.out.println("----------------------");
        System.out.println("Aufgabe Random fori schleife");
        System.out.println(Arrays.toString(countNumber4));
        System.out.println("======");
        System.out.println("Aufgabe Random ForEach schleife");
        for (int random : countNumber4) {
            System.out.print(random + " ");
        }
        System.out.println();
        System.out.println("Der 2te Wert ist : " + countNumber4[1] + " ");
        System.out.println("Der 5te Wert ist : " + countNumber4[4] + " ");
        System.out.println("Der 10te Wert ist : " + countNumber4[9] + " ");
        System.out.println("---------");
        System.out.println("Jede zweite wert anzeigen..");
        for (int i = 0; i < countNumber4.length; i += 2) {
            System.out.print(countNumber4[i] + " ");
        }
        System.out.println();
        System.out.println("----------");
        System.out.println("Crazy Range");
        for (int crazy : crazyRange) {
            System.out.print(crazy + " ");
        }
        System.out.println();
        System.out.print("Summe : ");
        System.out.println(randSumme);
        System.out.println("------------");
        System.out.println("Zahlen über 30 zählen");
        System.out.println(Arrays.toString(random30));
        int count = 0;
        for (int i = 0; i < random30.length; i++) {
            if (random30 [i] > 30) {
                count = count + 1;
            }
        }
        System.out.println(count + " Zahlen über 30");
    }

    public static int[] decreasingArray(int arrayspace) {
        int[] countNumber2 = new int[arrayspace];
        for (int i = 0; i < countNumber2.length; i++) {
            countNumber2[i] = arrayspace - i;
        }
        return countNumber2;
    }

    public static int[] increasingArray(int arrayspace) {
        int[] countNumber = new int[arrayspace];
        for (int i = 0; i < countNumber.length; i++) {
            countNumber[i] = 1 + i;
        }

        return countNumber;
    }

    public static int[] makeacopy(int[] arrayToCopy) {
        int[] result = new int[arrayToCopy.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = arrayToCopy[i];
        }
        return result;
    }

    public static int[] randomArray(int arrayspace) {
        int[] randomArray = new int[arrayspace];
        for (int i = 0; i < randomArray.length; i++) {
            int randomValue = rand.nextInt(101);
            randomArray[i] = randomValue;
        }

        return randomArray;
    }

    public static int[] crazyRange(int arrayspace) {
        int[] crazyRange = new int[arrayspace];
        for (int i = 0; i < crazyRange.length; i++) {
            int randRange = rand.nextInt(-50, 51);
            crazyRange[i] = randRange;
        }

        return crazyRange;
    }

    public static int[] randomzaehlen30(int arrayspace) {
        int[] random30 = new int[arrayspace];
        for (int i = 0; i < random30.length; i++) {
            int randomValue = rand.nextInt(101);
            random30[i] = randomValue;
        }

        return random30;


    }


    public static int randSumme(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    public static int readArrayspace(String message) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        System.out.println(message);
        try {
            String line = sc.nextLine();
            value = Integer.valueOf(line);
        } catch (NumberFormatException nfe) {
            System.out.println("Das ist keine gültige ZAHL mein Lieber");
        }

        return value;
    }


}






