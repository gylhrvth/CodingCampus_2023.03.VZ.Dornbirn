package mert.Week04;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String[] namesMembers = new String[]{"Joachim", "Mert", "Eric", "Marie Christine", "Benjamin", "Sandro", "Aygün", "Hassan", "Svitlana", "Lukas", "Gyula"};


        bubblesort(namesMembers);
        printName(namesMembers);

        bubblesort2(namesMembers);
        printName(namesMembers);

        bubblesort3(namesMembers);
        printName(namesMembers);

        bubblesort4(namesMembers);
        printName(namesMembers);
    }


    public static void printName(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]);
            if (i < names.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void bubblesort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;


                }
            }
        }
    }

    public static void bubblesort2(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubblesort3(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].length() < arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubblesort4(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
