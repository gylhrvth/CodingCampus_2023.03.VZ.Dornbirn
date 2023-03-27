package hassan.week04;

import java.util.Arrays;

public class StringAufgaben {


    public static void main(String[] args) {
        String[] names = new String[]{"Joachim","Mert", "Mo","Eric", "Marie Christine", "Benjamin", "Sandro", "Aygün", "Hassan", "Svitlana", "Lukas", "Gyula"};




        sortByThirdLetter(names, 5);
        System.out.println("======3te Char======");
        for (String i:names) {
            System.out.println(i);
        }
/*

        bubbleSortByLength(names);
        System.out.println("======Länge======");
        for (String name : names) {
            System.out.println(name);
        }


        bubbleSort(names, true);
        //true = Ascend
        //flase = Descend
        System.out.println("======Aufsteigend======");
        for (String i : names) {
            System.out.println("[" + i + "]");
        }


        bubbleSort(names, false);
        System.out.println("======Absteigend======");
        for (String i : names) {
            System.out.println("[" + i + "]");
        }


 */

    }

    public static void bubbleSort(String[] array, boolean choose) {
        if (choose) {
            bubbleSortAscend(array);
        } else {
            bubbleSortDescend(array);
        }
    }


    public static void sortByThirdLetter(String[] array, int index) {
        for (int i = 0; i < array.length - 1; i++) {
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
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }



    public static void bubbleSortByLength(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].length() > (array[j + 1]).length()) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    public static void bubbleSortAscend(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortDescend(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) < 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
