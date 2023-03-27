package joachim.Week03;

import java.util.Arrays;
import java.util.Random;

public class Sortieren {
    public static Random rand = new Random();       // Die TestArray wird mit Zufallszahlen gefüllt daher müssen wir ein RNG einspielen.

    public static void main(String[] args) {
        int[] array = createArray(20);      // es muss zuerst eine Array erschaffen werden um mit dieser zu arbeiten. Siehe UNTEN
        int[] array2 = createArray2(25);
        int[] array3 = createArray3(200000);

//// Bubblesort
//        System.out.println("Bubblesort: nach unten");
//        bubbleSort2(array);
//        System.out.println("Bubblesort: nach oben");
//        bubbleSort(array);
//// Shaker
//        System.out.println("Shaker sorting: vorher");
//        System.out.println(Arrays.toString(array2));
//        createshaker(array2);
//        System.out.println("Shaker sorting: naher");
//        System.out.println(Arrays.toString(array2));
// Mergesort
        System.out.println("Merge sorting: vorher");
        System.out.println(Arrays.toString(array3));
        mergeSort("",array3, 0, array3.length);
        System.out.println("Merge sorting: nacher");
        System.out.println(Arrays.toString(array3));


    }

    public static void mergeSort(String prefix, int[] array3, int lo, int hi) {
//        System.out.println(prefix + lo + " " +  hi);
        if (hi - lo <= 1) return;
        int mid = (hi + lo) / 2;
        mergeSort(prefix + "  ",array3, lo, mid);
        mergeSort(prefix + "  ",array3, mid, hi);

        int[] temp = new int[hi - lo];
        int i = lo;
        int j = mid;
        int k = 0;
        while ((i < mid) && (j < hi)) {
            if (array3[i] < array3[j]) {
                temp[k] = array3[i];
                ++i;
                ++k;
            } else {
                temp[k] = array3[j];
                ++j;
                ++k;
            }
        }
        while (i < mid) {
            temp[k] = array3[i];
            ++i;
            ++k;
        }
        while (j < hi) {
            temp[k] = array3[j];
            ++j;
            ++k;
        }
        for (int l = lo; l < hi; l++) {
            array3[l] = temp[l - lo];
        }
//        System.out.println(prefix + Arrays.toString(array3));
        }

        private static void createshaker ( int[] array2){
            int lo = 0;
            int hi = array2.length - 1;
            int mov = lo;
            while (lo < hi) {
                for (int i = hi; i > lo; i--) {
                    if (array2[i - 1] > array2[i]) {
                        int temp = array2[i];
                        array2[i] = array2[i - 1];
                        array2[i - 1] = temp;
                        mov = i;
                    }
                }
                lo = mov;
                for (int i = lo; i < hi; i++) {
                    if (array2[i] > array2[i + 1]) {
                        int temp = array2[i];
                        array2[i] = array2[i + 1];
                        array2[i + 1] = temp;
                        mov = i;
                    }
                }
                hi = mov;
            }
        }


        public static void bubbleSort ( int[] array){
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

        public static void bubbleSort2 ( int[] array){
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

        public static int[] createArray ( int size)
        {     //Hier wird die Array erschaffen und mit zufälligen Zahlen gefüllt.
            int[] testarray = new int[size];
            for (int i = 0; i < testarray.length; i++) {
                testarray[i] = rand.nextInt(101);
            }
            return testarray;
        }

        public static int[] createArray2 ( int size)
        {     //Hier wird die Array erschaffen und mit zufälligen Zahlen gefüllt.
            int[] testarray2 = new int[size];
            for (int i = 0; i < testarray2.length; i++) {
                testarray2[i] = rand.nextInt(101);
            }
            return testarray2;
        }

        public static int[] createArray3 ( int size)
        {     //Hier wird die Array erschaffen und mit zufälligen Zahlen gefüllt.
            int[] testarray3 = new int[size];
            for (int i = 0; i < testarray3.length; i++) {
                testarray3[i] = rand.nextInt(10001);
            }
            return testarray3;
        }

    }



