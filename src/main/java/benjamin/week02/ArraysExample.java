package benjamin.week02;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {

    public static void main(String[] args) {

        int[] asc = numberArray();
        int[] desc = numberArrayDesc();
        int[] copy = makeACopy(desc);


        System.out.println(Arrays.toString(asc));
        System.out.println(Arrays.toString(desc));
        System.out.println(Arrays.toString(copy));
    }

    public static int[] numberArray() {
        System.out.println("Gib die Anzahl ein!");
        int dim = Math.max(0, number());

        int[] count = new int[dim];
        for (int i = 0; i < count.length; i++) {
            count[i] = 1 + i;
        }

        return count;
    }

    public static int[] numberArrayDesc() {
        System.out.println("Gib die Anzahl ein!");
        int dim = Math.max(0, number());

        int[] count2 = new int[dim];
        for (int i = 0; i < count2.length ; i++) {
            count2[i] = dim - i;
        }
        return count2;
    }

    public static int[] makeACopy(int[] kopie){
        int [] count = new int[kopie.length];
        for (int i = 0; i < count.length; i++) {
           count[i] = kopie[i];
        }

        return count;
    }


    public static int number() {

        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean numberIsValid = false;
        while (!numberIsValid) {
            try {
                value = sc.nextInt();
                numberIsValid = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Keine gültige Eingabe.");
            }
        }
        return value;
    }
}





