package ayguen.week08;

import java.util.Random;
import java.util.Vector;

public class Vectors {
    private static Random random = new Random();

    public static void main(String[] args) {
        Vector<Integer> data = createRandomNumbers(20);
        System.out.println(data);

        System.out.println("Wie viele gerade Zahlen: " + geradeZahlen(data));
        System.out.println("Kleinste Zahl: " + minimumNumber(data));
        System.out.println("Grösste Zahl: " + maximumNumber(data));
        descendingNumb(data);
        System.out.println("Zahlen absteigend : " + data);
        deleteUngeradeZahlen(data);
        System.out.println("Ungerade Zahlen löschen :" + data);


        Vector<Integer> data1 = createRandomNumbers(20);
        descendingNumb(data1);
        System.out.println("data1: " + data1);

        Vector<Integer> data2 = createRandomNumbers(20);
        descendingNumb(data2);
        System.out.println("data2: " + data2);

        Vector<Integer> merge = mergeVectors(data1, data2);
        System.out.println("merge: " + merge);


    }

    public static Vector<Integer> mergeVectors(Vector<Integer> left, Vector<Integer> right) {
        Vector<Integer> result = new Vector<>();

        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.firstElement() > right.firstElement()) {
                result.add(left.firstElement());
                left.remove(0);
            } else {
                result.add(right.firstElement());
                right.remove(0);
            }
        }
        while (!left.isEmpty()) {
            result.add(left.firstElement());
            left.remove(0);
        }
        while (!right.isEmpty()) {
            result.add(right.firstElement());
            right.remove(0);
        }
        return result;

    }


    public static Vector<Integer> createRandomNumbers(int size) {
        Vector<Integer> data = new Vector<>();
        for (int i = 0; i < size; i++) {
            data.add(random.nextInt(100));
        }
        return data;
    }


    public static int geradeZahlen(Vector<Integer> data) {
        int counter = 0;
        for (Integer value : data) {
            if (value % 2 == 0) {
                ++counter;

            }
        }
        return counter;
    }

    public static int minimumNumber(Vector<Integer> data) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) < result) {
                result = data.get(i);
            }
        }
        return result;
    }

    public static int maximumNumber(Vector<Integer> data) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) > result) {
                result = data.get(i);
            }
        }
        return result;
    }

    public static void descendingNumb(Vector<Integer> desc) {
        for (int i = 0; i < desc.size(); i++) {
            for (int j = 0; j < desc.size() - i - 1; j++) {
                if (desc.get(j) < desc.get(j + 1)) {
                    int temp = desc.get(j);
                    desc.set(j, desc.get(j + 1));
                    desc.set(j + 1, temp);
                }

            }
        }
    }

    public static void deleteUngeradeZahlen(Vector<Integer> data) {
        for (int i = 0; i < data.size(); i++) {
            if (data.elementAt(i) % 2 != 0){
                data.remove(i);
                --i;
            }
        }
    }
}
