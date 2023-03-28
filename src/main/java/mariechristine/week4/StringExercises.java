package mariechristine.week4;

import java.util.Arrays;

public class StringExercises {
    public static void main(String[] args) {

        String[] names = new String[]{"Joachim", "Mert", "Eric", "Marie-Christine", "Benjamin", "Sandro", "Aygün", "Hassan", "Svitlana", "Lukas", "Gyula"};

        bubblesortAscending(names);
        System.out.println("String Bubblesort Ascending:\n" + Arrays.toString(names) + "\n");

        bubblesortDescending(names);
        System.out.println("String Bubblesort Descending:\n" + Arrays.toString(names) + "\n");

        bubblesortLexAsc(names);
        System.out.println("String Bubblesort Lexicographically Ascending:\n" );


    }

    public static void bubblesortAscending(String[] names) {
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].length() > names[j + 1].length()) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
    }

    public static void bubblesortDescending(String[] names) {
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].length() < names[j + 1].length()) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
    }

    public static void bubblesortLexAsc(String[] names) {
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (names[j].length() > names[j + 1].length()) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
    }
}