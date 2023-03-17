package benjamin.week02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysExample {

    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Gib die Größe des Arrays ein!");
        int dim = number();

        int[] empty = new int[]{};
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
        System.out.println("Random");
        System.out.println(Arrays.toString(rand));

        printForEach(rand);
        printForI(rand);

        printSecFifthTen(rand);
        //printSecFifthTen(empty);

        printEachSecond(rand);

        printForEach(crazy);

        System.out.println(countValuesOverThirty(rand) + " Zahlen über 30");

        System.out.print("Summe:" + printrandCountSum(rand));

        System.out.println("MaxValue:" + printmaxValue(rand));
        System.out.println("MinValue:" + printminVlaue(rand));
        System.out.println("AvgValue:" + printAvgValue(rand));
    }

    public static int[] numberArray(int dim) {
        int[] count = new int[dim];
        for (int i = 0; i < count.length; i++) {
            count[i] = 1 + i;
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
            int randNumber = rand.nextInt(100);
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
        System.out.println("TODO !!!");
    }

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
//        System.out.println("Zeige den 2ten, 5ten und 10ten Wert an");
        System.out.println("Zweiter Wert: " + array[1]);
        System.out.println("Fünfter Wert: " + array[4]);
        System.out.println("Zehnter Wert: " + array[9]);
    }


    public static int printmaxValue(int [] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println();
        return max;
    }

    public static int printminVlaue(int [] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min ){
                min = array[i];
            }
        }
        return min;
    }

    public static float printAvgValue(int [] array){
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        sum /= array.length;


        return sum;
    }


    public static int number() {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        try {
            String line = sc.nextLine();
            value = Integer.parseInt(line);
        } catch (NumberFormatException nfe) {
            System.out.println("Keine gültige Eingabe.");
        }
        return value;
    }
}








