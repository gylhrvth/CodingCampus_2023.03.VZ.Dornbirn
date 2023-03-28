package mariechristine.week4;

import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class StringExercises {
    public static void main(String[] args) {

        String[] names = new String[]{"Joachim", "Mert", "Eric", "Ömer", "Marie-Christine", "Benjamin", "Sandro", "Aygün", "Hassan", "Svitlana", "Lukas", "Gyula"};

        bubblesortAscending(names);
        System.out.println("String Bubblesort Ascending:\n" + Arrays.toString(names) + "\n");

        bubblesortDescending(names);
        System.out.println("String Bubblesort Descending:\n" + Arrays.toString(names) + "\n");

        bubblesortLexAsc(names);
        System.out.println("String Bubblesort Lexicographically Ascending:\n" + Arrays.toString(names) + "\n");

        bubblesortLexDesc(names);
        System.out.println("String Bubblesort Lexicographically Descending:\n" + Arrays.toString(names) + "\n");

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
        Collator deCollator = Collator.getInstance(Locale.GERMAN);
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                //if (names[j].compareTo(names[j + 1]) > 0) {
                if (deCollator.compare(names[j], names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
    }

    public static void bubblesortLexDesc(String[] names) {
        Collator deCollator = Collator.getInstance(Locale.GERMAN);
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
//                if (names[j].compareTo(names[j + 1]) < 0) {
                    if (deCollator.compare(names[j], names[j + 1]) < 0) {
                        String temp = names[j];
                        names[j] = names[j + 1];
                        names[j + 1] = temp;
                    }
                }
            }
        }
    }
