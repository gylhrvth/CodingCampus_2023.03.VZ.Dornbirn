package joachim.Week03;

import java.util.Arrays;
import java.util.Random;

public class Sortieren {
    public static Random rand = new Random();       // Die TestArray wird mit Zufallszahlen gefüllt daher müssen wir ein RNG einspielen.

    public static void main(String[] args) {
        int[] array = createArray(20);      // es muss zuerst eine Array erschaffen werden um mit dieser zu arbeiten. Siehe UNTEN
        bubbleSort2(array);
        bubbleSort(array);
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


    public static int[] createArray(int size) {     //Hier wird die Array erschaffen und mit zufälligen Zahlen gefüllt.
        int[] testarray = new int[size];
        for (int i = 0; i < testarray.length; i++) {
            testarray[i] = rand.nextInt(101);
        }
        return testarray;
    }

}


