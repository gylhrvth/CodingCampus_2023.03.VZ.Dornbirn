package benjamin.week02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysExample {

    static Random rand = new Random();

    public static void main(String[] args) {

        int dim = number("Gib die Größe des Arrays ein!");

        int[] asc = numberArray(dim);
        int[] desc = numberArrayDesc(dim);
        int[] copy = makeACopy(asc);
        int[] rand = numberRandom(dim);
        int[] crazy = numberRandomMinus(dim);

        System.out.println("Vorwärts");
        System.out.println(Arrays.toString(asc));
        System.out.println("Rückwärts");
        System.out.println(Arrays.toString(desc));
        System.out.println("Copy");
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(rand));

        printForEach(rand);

        printForI(rand);
//       printSecFifthTen(new int[]{dim});
        printSecFifthTen(rand);

        printEachSecond(rand);

        printForEach(crazy);

        System.out.println(countValuesOverThirty(rand) + " Zahlen über 30");

        System.out.print("Summe: " + printrandCountSum(rand));

        System.out.println("MaxValue: " + printmaxValue(rand));
        System.out.println("MinValue: " + printminVlaue(rand));
        System.out.println("AvgValue: " + printAvgValue(rand));
        System.out.println("MinIndex: [" + printIndexMin(rand) + "]");
        System.out.println("MaxIndex: [" + printIndexMax(rand) + "]");
//        bubbleSortAscending(rand);
//        System.out.print(Arrays.toString(rand));
//        System.out.println();
//        bubbleSortDescending(rand);
//        System.out.print(Arrays.toString(rand));
//        System.out.println();
//        selectionSort(rand);
//        System.out.println(Arrays.toString(rand));
//        System.out.println();
        cocktailShaker(rand);
        System.out.println(Arrays.toString(rand));
    }

    public static int[] numberArray(int dim) {
        int[] count = new int[dim];
        for (int i = 0; i < count.length; i++) {
            count[i] = i + 1;
        }

        return count;

    }

    public static int[] numberArrayDesc(int dim) {
        int[] count2 = new int[dim];
        for (int i = 0; i < count2.length; i++) {
            count2[i] = dim - i;
        }
        return count2;
    }

    public static int[] makeACopy(int[] orginalArray) { //originalArray = das Arrays was kopiert werden soll
        int[] copyArray = new int[orginalArray.length];   //"copyArray" macht eine Kopie von "originalArray"
        for (int i = 0; i < copyArray.length; i++) {
            copyArray[i] = orginalArray[i];
        }
        return copyArray;
    }

    public static int[] numberRandom(int dim) {
        int[] randArray = new int[dim];
        for (int i = 0; i < randArray.length; i++) {
            int randNumber = rand.nextInt(101);
            randArray[i] = randNumber;

        }
        return randArray;
    }

    public static int[] numberRandomMinus(int dim) {
        int[] randArray = new int[dim];
        for (int i = 0; i < randArray.length; i++) {
            int randNumber = rand.nextInt(-50, 51);
            randArray[i] = randNumber;

        }
        return randArray;
    }


    public static void printForI(int[] array) {
        System.out.print("[");
        for (int i = 0; i <= array.length - 1; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + "]");
            }

        }
        System.out.println();
    }

//    public static void printIndexes(int[] array){
//        int[] arr = new int[]{(array.length)};
//
//
//
//
//    }


    public static void printForEach(int[] array) {
//        System.out.println("Foreach!");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printEachSecond(int[] array) {
        System.out.println("Jeder zweiter Wert anzeigen!");
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static int countValuesOverThirty(int[] array) {
//        System.out.println("Random Number Array Zählen");

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 30) {
                count = count + 1;
            }
        }

        return count;

    }

    public static int printrandCountSum(int[] array) {
//         System.out.println("Random Number Array Summe");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }

    public static void printSecFifthTen(int[] array) {

        System.out.println("Zweiter Wert: " + array[1]);
        System.out.println("Fünfter Wert: " + array[4]);
        System.out.println("Zehnter Wert: " + array[9]);
    }

    public static int printmaxValue(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println();
        return max;
    }

    public static int printminVlaue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static float printAvgValue(int[] array) {
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        sum /= array.length;


        return sum;
    }

    public static int printIndexMin(int[] dim) {
        int index = 0;
        for (int i = 0; i < dim.length; i++) {
            if (dim[i] < dim[index]) {
                index = i;
            }

        }
        return index;
    }

    public static int printIndexMax(int[] dim) {
        int index = 0;
        for (int i = 0; i < dim.length; i++) {
            if (dim[i] > dim[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void bubbleSortAscending(int[] dim) {
        for (int i = 0; i < dim.length; i++) {
            for (int j = 0; j < dim.length - i - 1; j++) {
                if (dim[j] > dim[j + 1]) {
                    int temp = dim[j];
                    dim[j] = dim[j + 1];
                    dim[j + 1] = temp;
                }
            }
        }

    }

    public static void bubbleSortDescending(int[] dim) {
        for (int i = 0; i < dim.length; i++) {
            for (int j = 0; j < dim.length - i - 1; j++) {
                if (dim[j] < dim[j + 1]) {
                    int temp = dim[j];
                    dim[j] = dim[j + 1];
                    dim[j + 1] = temp;
                }

            }

        }
    }

    public static void selectionSort(int[] dim) {
        for (int i = 0; i < dim.length; i++) {
            int min = i;
            for (int j = i + 1; j < dim.length; j++) {
                if (dim[j] < dim[min]) {
                    min = j;
                }
            }
            int temp = dim[i];
            dim[i] = dim[min];
            dim[min] = temp;
        }
    }

    public static void cocktailShaker(int[] dim) {
        int low = 0;
        int high = dim.length -1;
        int mov = low;

        while (low < high) {
            for (int i = low; i < high; i++) {
                if (dim[i] > dim[i + 1]) {
                    int temp = dim[i];
                    dim[i] = dim[i + 1];
                    dim[i + 1] = temp;
                    mov = i;
                }
            }
            high = mov;

            for (int i = high ; i > low; i--) {
                if (dim[i] < dim[i - 1]) {
                    int temp = dim[i];
                    dim[i] = dim[i - 1];
                    dim[i - 1] = temp;
                    mov = i;

                }
            }
            low = mov;

        }

    }


    public static int number(String message) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean numberIsValid = false;
        while (!numberIsValid) {
            System.out.println(message);
            try {
                String line = sc.nextLine();
                value = Integer.parseInt(line);
                numberIsValid = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Keine gültige Eingabe.");
            }

        }
        return value;
    }
}








