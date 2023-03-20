package joachim.week02;

import sandro.week02.Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        int[] rand = randomArray(25, 1, 100);
        System.out.println(Arrays.toString(rand));
        System.out.println("Hier wird die zufällig generierte Array dargestellt\n");
        //myPrintWithForI(rand);
        //myPrintWithForEach(rand);
        System.out.println("Exel: generiert 2 Arrays die linear von 1 bis zur Array größe " + exel() + " zählt und umgekehrt\n");

        int[] copyOf = copy(rand);
        System.out.println("Copy of a Array");
        System.out.println("Orginal: " + Arrays.toString(rand) + "\nCopy:    " + Arrays.toString(copyOf) + "\nCopy: hier wir eine Array mit den momentanen werten kopiert.\n");
        rand[4] = 1337;
        System.out.println("Hier habe Ich die (rand) Array an dem [4] Platz auf 1337 geändert und wie man sieht bleibt die Kopie gleich!");
        System.out.println("Orginal: " + Arrays.toString(rand) + "\nCopy:    " + Arrays.toString(copyOf));
        System.out.println();

        System.out.println("arrayCrazyRange generiert eine Array die Zahlen zwischen -50 und 50 generiert. SUCH WOW, MUCH CRAZE\n" + Arrays.toString(arrayCrazyRange()) + "\n");

        System.out.println("Array Greater 30: zählt Alle Zahlen aus dem zufällig generiertem Array über 30 diese Betragen " + arrayGreater30(rand) + "\n");

        System.out.println("arraySum: gibt die Summe aller Werte aus der Array aus \nMenge: " + arraySum() + "\n");
        max();
        min();
        avg();
        System.out.println("max/min/avg geben genau das aus was der Name verspricht.\n");


        System.out.println("Der Bubblsort ist einer der einfachsten aber auch einer der aufwendigsten Sotierungsalgorithmen.\nGrundsätzlich vergleicht dieser Algorithmus die zwei anliegenden Zahlen und tausch diese wenn nötig.");
        System.out.println("Dies Funktioniert in beide Richtungen wenn man das Kriterium tauscht.'>' oder '<' \n");
        System.out.println("Von unten nach oben sortiert. '>'");
        bubbleSort(randomArray(20,0, 100));;
        System.out.println("Von oben nach unten sortiert.'<'");
        bubbleSort2(randomArray(20,0, 100));


    }

    static Random random = new Random();

    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^here i define the width of the random generated Array, the "from" and "to" is defined in the methods themself, ---> see randomArray.
    public static int[] randomArray(int width, int from, int to) {
        int[] rand = new int[width];
        for (int i = 0; i < rand.length; i++) { // The rand.length and the new int[width] are the same number, just for understanding it is named differently
            rand[i] = random.nextInt(from, to + 1);
        }
        return rand;
    }

    public static int exel() {
        Scanner scanner = new Scanner(System.in);
        int width = 10;
        int[] safes = new int[width];

        for (int i = 0; i < safes.length; i++) {
            safes[i] = 1 + i;
        }

        int[] safes2 = new int[width];
        for (int i = 0; i < safes2.length; i++) {
            safes2[i] = safes2.length - i;
        }

        System.out.println(Arrays.toString(safes));
        System.out.println(Arrays.toString(safes2));
        return width;
    }

    public static int[] copy(int[] orginal) {
        int[] makeACopy = new int[orginal.length];
        for (int i = 0; i < orginal.length; i++) {
            makeACopy[i] = orginal[i];
        }
        return makeACopy;
    }

    public static int[] arrayCrazyRange() {
        int[] numbers = randomArray(10, -50, 50);
        for (int number : numbers) {
        }
        return numbers;
    }

    public static int arrayGreater30(int[] arr) {
        int count = 0;
        for (int number : arr) {                           //arr is the Array we are reading and number is the INT inside the Array wich we are looking at.
            if (number > 30) {
                count = count + 1;                           // count is the amount of times the if function repeated itself. wich is the same amount as numbers are above 30.
            }

        }
        return count;
    }

    public static int arraySum() {
        int result = 0;
        int[] numbers = randomArray(10, 1, 100);
        for (int number : numbers) {
            result = number + result;
        }
        return result;
    }

    public static int max() {
        int[] numbers = randomArray(10, 1, 100);
        int max = numbers[0];
        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Max: " + max);
        return max;
    }

    public static int min() {
        int[] numbers = randomArray(10, 1, 100);
        int min = numbers[0];
        for (int number : numbers) {
            if (min > number) {
                min = number;
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Min: " + min);
        return min;
    }

    public static double avg() {
        int[] numbers = randomArray(10, 1, 100);
        int avgb = 0;
        for (int number : numbers) {
            avgb = avgb + number;

        }
        double avg = (double) avgb / numbers.length;
        System.out.println(Arrays.toString(numbers));
        System.out.println("Avg: " + avg);
        return avg;
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];                //Kühlschrank auf, Elephant rein, Kühlschrank zu.
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        System.out.println(Arrays.toString(array) + "\n");
    }

    public static void bubbleSort2(int[] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        System.out.println(Arrays.toString(array) + "\n");
    }
}