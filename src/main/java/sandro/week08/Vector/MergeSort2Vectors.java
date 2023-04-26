package sandro.week08.Vector;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Vector;

public class MergeSort2Vectors {
    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Create two Vectors with Random Numbers and Sort");
        Vector<Integer> data1 = createVector(20000);
        Vector<Integer> data2 = createVector(20000);
        sortAcendingwithBubble(data1);
        sortAcendingwithBubble(data2);
        System.out.println(data1);
        System.out.println(data2);
        System.out.println();

        Instant start = Instant.now();
        Vector<Integer> result = mergeData2(data1, data2);
        //Vector<Integer> result = VectorMerge.mergeDataAndSort(data1, data2);
        Instant end = Instant.now();
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(result);

        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");

    }

    public static Vector<Integer> mergeData(Vector<Integer> data1, Vector<Integer> data2) {    // Elemente werden nach erfolgreichem vergleich gelöscht, index verschiebt sich und wird nicht erweitert, es geht immer vom ersten index aus.
        Vector<Integer> mergeData = new Vector<>();

        while (!data1.isEmpty() && !data2.isEmpty()) {
            if (data1.firstElement() < data2.firstElement()) {
                mergeData.add(data1.firstElement());
                data1.remove(0);
            } else {
                mergeData.add(data2.firstElement());
                data2.remove(0);
            }
        }
        while (!data1.isEmpty()) {
            mergeData.add(data1.firstElement());
            data1.remove(0);
        }
        while (!data2.isEmpty()) {
            mergeData.add(data2.firstElement());
            data2.remove(0);
        }

        return mergeData;
    }

    public static Vector<Integer> mergeData2(Vector<Integer> data1, Vector<Integer> data2) {   //Index erweitert sich und wird nicht gelöscht, darum ist es schneller fertig, weil weniger Arbeit ist.
        Vector<Integer> mergeData = new Vector<>();
        int index1 = 0;
        int index2 = 0;

        while (index1 < data1.size() && index2 < data2.size()) {
            int value1 = data1.elementAt(index1);
            int value2 = data2.elementAt(index2);
            if (value1 < value2) {
                mergeData.add(value1);
                ++index1;
            } else {
                mergeData.add(value2);
                ++index2;
            }
        }
        while (index1 < data1.size()) {
            mergeData.add(data1.elementAt(index1));
            ++index1;
        }
        while (index2 < data2.size()) {
            mergeData.add(data2.elementAt(index2));
            ++index2;
        }

        return mergeData;
    }



    public static Vector<Integer> createVector(int size) {
        Vector<Integer> data = new Vector<>();

        for (int i = 0; i < size; i++) {
            int randInt = rand.nextInt(0, 100000);
            data.add(i, randInt);
        }
        return data;
    }

    public static void sortAcendingwithBubble(Vector<Integer> data) {
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.size() - i - 1; j++) {
                if (data.elementAt(j) > data.elementAt(j + 1)) {
                    int temp = data.elementAt(j);
                    data.set(j, data.elementAt(j + 1));
                    data.set(j + 1, temp);
                }
            }
        }
    }

}

