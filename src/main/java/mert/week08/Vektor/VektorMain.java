package mert.week08.Vektor;

import java.awt.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class VektorMain {
    static Random rand = new Random();

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < 20; i++) {
            int random = rand.nextInt(100);
            vector.add(random);

        }

        Vector<Integer> vector1 = new Vector<>();
        for (int j = 0; j < 20; j++) {
            int random1 = rand.nextInt(100);
            vector1.add(random1);

        }
        sort(vector);
        sort(vector1);

        System.out.println("Vector:   " + vector);
        System.out.println("Vector 1: " + vector1);

        Vector<Integer> sortedVector = merge(vector1,vector);
        System.out.println(sortedVector);
    }


    public static Vector<Integer> merge(Vector<Integer> data1, Vector<Integer> data2) {
        Vector<Integer> result = new Vector<>();

        while (!data1.isEmpty() && !data2.isEmpty()) {
            if (data1.firstElement() < data2.firstElement()) {
                result.add(data1.firstElement());
                data1.remove(0);
            } else {
                result.add(data1.firstElement());
                data1.remove(0);
            }
            while (!data1.isEmpty()) {
                result.add(data1.firstElement());
                data1.remove(0);
            }
            while (!data2.isEmpty()) {
                result.add(data2.firstElement());
                data2.remove(0);
            }
        }

        return result;
    }

//        System.out.println("------------------------------------");
//
//        System.out.println("Gerade Zahlen: " + geradeZahlen(vector));
//        System.out.println("Kleinste Zahl: " + kleinsteZahl(vector));
//        System.out.println("Größte Zahl: " + bigestNumber(vector));
//
//        sort(vector);
//        System.out.println("Sortiert: " + vector);
//
//        loescheUngerade(vector);
//        System.out.println("Ungerade: " + vector);


    public static void loescheUngerade(Vector<Integer> vector) {
        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) % 2 == 1) {
                vector.remove(i);
                --i;
            }
        }

    }

    public static int geradeZahlen(Vector<Integer> vektor) {
        int count = 0;
        for (int i = 0; i < vektor.size(); i++) {
            if (vektor.get(i) % 2 == 0) {
                count++;
            }

        }
        return count;
    }

    public static int kleinsteZahl(Vector<Integer> vector) {
        int minValue = Integer.MAX_VALUE;
        for (int value : vector) {
            if (value < minValue) {
                minValue = value;
            }

        }
        return minValue;
    }

    public static int bigestNumber(Vector<Integer> vector) {
        int maxValue = Integer.MIN_VALUE;
        for (int value : vector) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static void sort(Vector<Integer> vector) {
        for (int i = 0; i < vector.size(); i++) {
            for (int j = 0; j < vector.size() - i - 1; j++) {
                if (vector.get(j) < vector.get(j + 1)) {

                    int temp = vector.get(j);
                    vector.set(j, vector.get(j + 1));
                    vector.set(j + 1, temp);
                }

            }
        }


    }

}

