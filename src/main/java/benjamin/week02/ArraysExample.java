package benjamin.week02;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysExample {

    static Random rand = new Random();

    public static void main(String[] args) {

        int[] asc = numberArray();
        int[] desc = numberArrayDesc();
        int[] copy = makeACopy(asc);
        int[] rand = numberRandom(asc);
        int[] crazy = numberRandomMinus(asc);


        System.out.println("Vorwärts");
        System.out.println(Arrays.toString(asc));
        System.out.println("Rückwärts");
        System.out.println(Arrays.toString(desc));
        System.out.println("Copy");
        System.out.println(Arrays.toString(copy));
        System.out.println("Random mit Arrays.String");
        System.out.println(Arrays.toString(rand));
        System.out.println("Mit foreach");

        for (int randi : rand) {
            System.out.print(randi + " ");
        }
        System.out.println();

        System.out.println("Nur 2ter,5ter und 10ter Wert");

        System.out.println("Zweiter Wert: " + rand[1]);
        System.out.println("Fünfter Wert: " + rand[4]);
        System.out.println("Zehnter Wert: " + rand[9]);

        System.out.println("Jeder zweiter Wert anzeigen");
        for (int i = 0; i < rand.length; i += 2) {
            System.out.print(rand[i] + " ");

        }
        System.out.println();
        System.out.println("Crazy Range");
        for (int randcrazy : crazy) {
            System.out.print(randcrazy + " ");

        }
        System.out.println();
        System.out.println("Random Number Array Zählen");
        int count = 0;
        for (int i = 0; i < rand.length ; i++) {
            if (rand[i] >= 30) {
                count = count + 1;
            }
        }
        System.out.println(Arrays.toString(rand));
        System.out.println(count + "Zahlen über 30");

        System.out.println("Random Number Array Summe");
        int sum = 0;
        for (int i = 0; i < rand.length; i++) {
            sum += rand[i];

        }
        System.out.println(Arrays.toString(rand));
        System.out.print("Summe:" + sum);


    }

    public static int[] numberArray() {
        System.out.println("Gib die Anzahl ein!");
        int dim = number();

        int[] count = new int[dim];
        for (int i = 0; i < count.length; i++) {
            count[i] = 1 + i;
        }
        return count;
    }

    public static int[] numberArrayDesc() {
        System.out.println("Gib die Anzahl ein!");
        int dim = number();

        int[] count2 = new int[dim];
        for (int i = 0; i < count2.length; i++) {
            count2[i] = dim - i;
        }
        return count2;
    }

    public static int[] makeACopy(int[] orginalArray) { //originalArray = das Arrays was kopiert werden soll
        int[] copyArray = new int[orginalArray.length];   //"copyArray" macht eine Kopie von "originalArray"
        for (int i = 0; i < copyArray.length; i++) {
            copyArray[i] = orginalArray[i];
        }
        return copyArray;
    }

    public static int[] numberRandom(int[] array) {
        int[] randArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int randNumber = rand.nextInt(100);
            randArray[i] = randNumber;

        }
        return randArray;
    }

    public static int[] numberRandomMinus(int[] array) {
        int[] randArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int randNumber = rand.nextInt(-50, 51);
            randArray[i] = randNumber;

        }
        return randArray;
    }


    public static int number() {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        try {
            String line = sc.nextLine();
            value = Integer.parseInt(line);
        } catch (NumberFormatException nfe) {
            System.out.println("Keine gültige Eingabe.");
        }
        return value;
    }
}








