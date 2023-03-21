package lukas.week02;

import java.util.Arrays;

public class RehearsalArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        numbers[2] = 5;
        numbers[6] = 65;

        printArray(numbers);

        for (int i = 10; i < 20; i++) {
            numbers[i - 10] = i;
        }

        printArray(numbers);

        for (int i = 0; i < 10; i++) {
            numbers[i] = i + 10;
        }

        printArray(numbers);

        //Nur in Zeile mit Deklaration der Variable möglich
        int[] numbers2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        //Nicht möglich
        //numbers2 = { 1, 2, 3 };

        int[] numbers3 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        numbers3 = new int[]{1, 2, 3};


        String[] names = new String[]{"Marie", "Joachim", "Benni", "Sandro", "Aygün", "Mert", "Rick", "Hassan", "Lukas", "Gyula", "Svitlana"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("---");

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        System.out.println("---");

        //Der effiziente Weg
        String[] namesCopy = new String[names.length];
        System.arraycopy(names, 0, namesCopy, 0, names.length);


        //Nicht kopieren, beide Variablen zeigen auf das selbe Array
        String[] namesCopy2 = names;


        int[] arr = new int[]{4, 5, 6};
        int[] arrCopy = copy(arr);
        System.out.println("---arrrrrrrr---");
        printArray(arr);
        printArray(arrCopy);
        arr[0] = 10;
        System.out.println("---arrrr geändert---");
        printArray(arr);
        printArray(arrCopy);

        /*
         * FOR EACH
         */
        int charCount = 0;
        for (String name : names) {
            charCount = charCount + name.length();
        }
        System.out.println("Unsere namen haben " + charCount + " Buchstaben, durchschnittlich " + ((float) charCount / names.length) + " Buchstaben pro Person.");

        for (int number : numbers) {
            System.out.println("Hallo: " + number);
        }
    }

    private static int[] copy(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
