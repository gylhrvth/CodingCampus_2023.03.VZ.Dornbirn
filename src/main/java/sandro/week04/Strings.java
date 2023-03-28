package sandro.week04;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String[] names = createArray();

        for (String name : names) {
            System.out.println(name + "(" + name.length() + ")");
        }

        System.out.println("===============");
        System.out.println("orginal");
        System.out.println(Arrays.toString(names));
        System.out.println();
/*        bubbleSortAscendingNameLength(names);
        System.out.println(Arrays.toString(names));
        System.out.println();
        bubbleSortDescendingNameLength(names);
        System.out.println(Arrays.toString(names));
        System.out.println();
        bubbleSortAscendingAlphabet(names);
        System.out.println(Arrays.toString(names));
        System.out.println();
        bubbleSortDescendingAlphabet(names);
        System.out.println(Arrays.toString(names));
        System.out.println();
        alphabetUpOrDown(names, false);
        System.out.println(Arrays.toString(names));
        alphabetUpOrDown(names, true);
        System.out.println(Arrays.toString(names));
        System.out.println();
        lengthUpOrDown(names, false);
        System.out.println(Arrays.toString(names));
        lengthUpOrDown(names, true);
        System.out.println(Arrays.toString(names));
        System.out.println();
 */
        bubbleSortChar2(names, 4);
        System.out.println(Arrays.toString(names));


        for (char c = 0; c <= 255; c++) {
            System.out.print(c);
        }
        System.out.println();

    }

    public static void bubbleSortChar2(String[] arr, int index) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                char cj = Character.MIN_VALUE;
                if (index < arr[j].length()) {
                    cj = arr[j].charAt(index);
                }
                char cjp = Character.MIN_VALUE;
                if (index < arr[j + 1].length()) {
                    cjp = arr[j + 1].charAt(index);
                }
                System.out.println("cj: "  + (int)cj  + " " + cj + " cjp:" + (int)cjp + " " + cjp);
                if (cj > cjp) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


    }

    public static void bubbleSortAscendingNameLength(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortDescendingNameLength(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].length() < arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortAscendingAlphabet(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortDescendingAlphabet(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void alphabetUpOrDown(String[] arr, boolean UpDown) {
        if (UpDown) {
            bubbleSortDescendingAlphabet(arr);
        } else {
            bubbleSortAscendingAlphabet(arr);
        }
    }

    public static void lengthUpOrDown(String[] arr, boolean UpDown) {
        if (UpDown) {
            bubbleSortDescendingNameLength(arr);
        } else {
            bubbleSortAscendingNameLength(arr);
        }
    }

    public static String[] createArray() {
        return new String[]{"Joachim", "Mert", "Eric", "Marie Christine", "Benjamin", "Sandro", "Aygün", "Hassan", "Svitlana", "Lukas", "Gyula"};
    }
}
