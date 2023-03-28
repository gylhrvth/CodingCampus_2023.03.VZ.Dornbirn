package ayguen.week04;

public class StringAufgabe {

    public static void main(String[] args) {
        String[] names = new String[]{"Joachim", "Mert", "Eric", "Marie Christine", "Benjamin", "Sandro", "Aygün", "Hassan", "Svitlana", "Lukas", "Gyula"};

        printNames(names);
        bubblesort(names, true);
        printNames(names);
        bubblesort(names, false);
        printNames(names);
        System.out.println();
        System.out.println("Sortiert namen Länglich");
        bubblesortLength(names);
        printNames(names);
        System.out.println("3. Buchstabe");
        Sort3Letter(names, 2);
        printNames(names);


    }


    public static void printNames(String[] names) {
        boolean first = true;
        for (String name : names) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(name);
            first = false;

        }
        System.out.println();
    }

    public static void bubblesort(String[] arr, boolean ascencing) {

        if (ascencing) {
            bubblesortAscending(arr);
        } else {
            bubblesortDescending(arr);
        }
    }

    public static void bubblesortAscending(String[] arr) {
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

    public static void bubblesortDescending(String[] arr) {


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

    public static void bubblesortLength(String[] arr) {


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

    public static void Sort3Letter(String[] arr, int index) {


        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                char cj = Character.MAX_VALUE;
                if (index < arr[j].length()) {
                    cj = arr[j].charAt(index);
                }
                char cjp = Character.MAX_VALUE;
                if (index < arr[j + 1].length()) {
                    cjp = arr[j + 1].charAt(index);
                }
                if (cj > cjp) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }


            }
        }
    }
}
