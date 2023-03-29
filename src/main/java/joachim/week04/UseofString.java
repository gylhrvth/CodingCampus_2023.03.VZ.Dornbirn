package joachim.week04;

import java.util.Arrays;

public class UseofString {
    public static void main(String[] args) {
        String[] names = new String[]{"Joachim", "Mert", "Mo", "Eric", "Marie Christine", "Benjamin", "Sandro", "Aygün", "Hassan", "Svitlana", "Lukas", "Gyula"};
        System.out.println(Arrays.toString(names));
/*
        bubbleSortAlph(names);
        bubbleSortAlphDes(names);
        bubbleSortNum(names);
        bubbleSortNumAsc(names);
        bubbleSortBoolean(names, false);
        bubbleSortAlphChar(names, 2);
        System.out.println(Arrays.toString(names));
            */
    }

    public static void bubbleSortAlph(String[] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];                //Kühlschrank auf, Elephant rein, Kühlschrank zu.
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        System.out.println(Arrays.toString(array) + "\n");
    }

    public static void bubbleSortAlphDes(String[] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1].compareTo(array[j]) > 0) {
                    String temp = array[j];                //Kühlschrank auf, Elephant rein, Kühlschrank zu.
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        System.out.println(Arrays.toString(array) + "\n");
    }

    public static void bubbleSortNum(String[] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].length() < (array[j + 1]).length()) {
                    String temp = array[j];                //Kühlschrank auf, Elephant rein, Kühlschrank zu.
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        System.out.println(Arrays.toString(array) + "\n");
    }

    public static void bubbleSortNumAsc(String[] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].length() > (array[j + 1]).length()) {
                    String temp = array[j];                //Kühlschrank auf, Elephant rein, Kühlschrank zu.
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        System.out.println(Arrays.toString(array) + "\n");
    }

    public static void bubbleSortBoolean(String[] array, boolean ascend) {
        if (ascend) {
            bubbleSortAlph(array);
        } else {
            bubbleSortAlphDes(array);
        }
    }

    public static void bubbleSortAlphChar(String[] array, int index) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - i - 1; j++) {
                char cj = Character.MAX_VALUE;
                if (index < array[j].length()) {
                    cj = array[j].charAt(index);
                }
                char cjp = Character.MAX_VALUE;
                if (index < array[j + 1].length()) {
                    cjp = array[j + 1].charAt(index);
                }

                if (cj > cjp) {
                    String temp = array[j];                //Kühlschrank auf, Elephant rein, Kühlschrank zu.
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
    }

}