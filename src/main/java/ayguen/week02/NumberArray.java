package ayguen.week02;

import java.util.Arrays;
import java.util.Random;

public class NumberArray {

    static Random rand = new Random();

    public static void main(String[] args) {
        int size = MenuGyula.getNumber("Wie groß soll das Array sein?", 1, 1000);


        int[] zahlen = new int[size];
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = 1 + i;

        }
        int[] zahlen2 = new int[size];
        for (int i = 0; i < zahlen2.length; i++) {
            zahlen2[i] = zahlen2.length - i;

        }
        System.out.println(Arrays.toString(zahlen));
        System.out.println(Arrays.toString(zahlen2));

        int[] namesCopy = new int[zahlen.length];
        System.arraycopy(zahlen, 0, namesCopy, 0, zahlen.length);
        System.out.println(Arrays.toString(namesCopy));

        System.out.println("--------------");

        int[] zahlen3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] zahlen3Copy = copy(zahlen3);
        System.out.println("_____________");
        printArray(zahlen3);
        printArray(zahlen3Copy);
        zahlen3[0] = 100;

    }


    public static int[] copy(int[] zahlen3) {
        System.out.println("COPY--------");
        int[] copy = new int[zahlen3.length];
        for (int i = 0; i < zahlen3.length; i++) {
            copy[i] = zahlen3[i];
        }
        return copy;
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        numbers[2] = 58;
        numbers[4] = 54;
        numbers[9] = 54;
        System.out.println(Arrays.toString(numbers));
    }
}





