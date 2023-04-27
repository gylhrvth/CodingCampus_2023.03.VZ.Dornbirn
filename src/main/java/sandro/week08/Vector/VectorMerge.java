package sandro.week08.Vector;

import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

public class VectorMerge {
    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Create two Vectors with Random Numbers and Sort");
        Vector<Integer> data1 = createVector();
        Vector<Integer> data2 = createVector();
        sortAcendingwithBubble(data1);
        sortAcendingwithBubble(data2);
        System.out.println(data1);
        System.out.println(data2);
        System.out.println();
        Vector<Integer> data3 = mergeDataAndSort(data1, data2);
        System.out.println(data3);
        System.out.println();
        System.out.println("Merge two Vectors");
        System.out.println(data1);
        System.out.println(data2);
        mergeData(data1, data2);
        Vector<Integer> mergeData = mergeData(data1, data2);
        System.out.println("Sort merged Vector");
        sortAcendingwithBubble(mergeData);
        System.out.println(mergeData);


    }

    public static void mergeSort(int[] arr, int lo, int hi) {
        if (hi - lo <= 1) return;
        int mid = (lo + hi) / 2;

        mergeSort(arr, lo, mid);
        mergeSort(arr, mid, hi);

        int[] temp = new int[hi - lo];
        int i = lo;
        int j = mid;
        int k = 0;

        while ((i < mid) && (j < hi)) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                ++i;
                ++k;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i < mid) {
            temp[k] = arr[i];
            ++i;
            ++k;
        }
        while (j < hi) {
            temp[k] = arr[j];
            ++j;
            ++k;
        }
        for (int l = lo; l < hi; l++) {
            arr[l] = temp[l - lo];
        }
        System.out.println(Arrays.toString(arr));
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

    public static Vector<Integer> createVector() {
        Vector<Integer> data = new Vector<>();

        for (int i = 0; i < 20; i++) {
            int randInt = rand.nextInt(0, 100);
            data.add(i, randInt);
        }
        return data;
    }

    public static Vector<Integer> mergeData(Vector<Integer> data1, Vector<Integer> data2) {
        Vector<Integer> mergeData = new Vector<>();

        for (Integer input1 : data1) {
            mergeData.add(input1);
        }
        for (Integer input2 : data2) {
            mergeData.add(input2);
        }
        return mergeData;
    }

    public static Vector<Integer> mergeDataAndSort(Vector<Integer> data1, Vector<Integer> data2) {
        Vector<Integer> mergeData = new Vector<>();
        for (Integer input1 : data1) {
            mergeData.add(input1);
        }
        for (Integer input2 : data2) {
            mergeData.add(input2);
        }
        for (int i = 0; i < mergeData.size(); i++) {
            for (int j = 0; j < mergeData.size() - i - 1; j++) {
                if (mergeData.elementAt(j) > mergeData.elementAt(j + 1)) {
                    int temp = mergeData.elementAt(j);
                    mergeData.set(j, mergeData.elementAt(j + 1));
                    mergeData.set(j + 1, temp);
                }
            }
        }
        return mergeData;
    }

}
