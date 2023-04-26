package sandro.week08.Vector;

import java.util.Random;
import java.util.Vector;

public class VectorCreate {
    static Random rand = new Random();

    public static void main(String[] args) {
        int size = 20;

        System.out.println("Create Vector with Random");
        System.out.println(createVector(size));
        System.out.println();
        System.out.println("Count Even Numbers");
        Vector<Integer> data = new Vector<>();   //createVector(size);
        data.add(12);
        printVector(data);
        int evenNumbers = countEvenNumbers(data);
        System.out.println("Even Numbers count is: " + evenNumbers);
        System.out.println();
        System.out.println("Find the smallest and biggest Number");
        printVector(data);
        int smallestNumber = getSmallestNumber(data);
        int biggestNumber = getBiggestNumber(data);
        System.out.println("The smallest Number is: " + smallestNumber + "\nThe biggest Number is: " + biggestNumber);
        System.out.println();
        System.out.println("Sort Decending Numbers");
        sortDecendingwithBubble(data);
        System.out.println(data);
        System.out.println();
        System.out.println("Remove all Odd Numbers");
        deleteOddNumbers(data);
        System.out.println(data);


    }

    public static void deleteOddNumbers (Vector<Integer>data){
        for (int i = 0; i < data.size(); i++) {
            if (data.elementAt(i) % 2 != 0){
                data.remove(i);
                i --;
            }
        }
    }
    public static void sortDecendingwithBubble(Vector<Integer> data) {
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.size() - i - 1; j++) {
                if (data.elementAt(j) < data.elementAt(j + 1)) {
                    int temp = data.elementAt(j);
                    data.set(j, data.elementAt(j + 1));
                    data.set(j + 1, temp);
                }
            }
        }
    }

    public static int getSmallestNumber(Vector<Integer> data) {
        int min = 0;
        if (data.size() > 0) {
            min = data.elementAt(0);
            for (int i = 0; i < data.size(); i++) {
                if (data.elementAt(i) < min) {
                    min = data.elementAt(i);
                }
            }
        }
        return min;
    }

    public static int getBiggestNumber(Vector<Integer> data) {
        int max = 0;
        if (data.size() > 0) {
            max = data.elementAt(0);
            for (int i = 0; i < data.size(); i++) {
                if (data.elementAt(i) > max) {
                    max = data.elementAt(i);
                }
            }
        }
        return max;
    }

    public static int countEvenNumbers(Vector<Integer> data) {
        int counter = 0;
        for (int i = 0; i < data.size(); i++) {
            if (data.elementAt(i) % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static Vector<Integer> createVector(int input) {
        int size = input;
        Vector<Integer> data = new Vector<>();

        for (int i = 0; i < size; i++) {
            int randInt = rand.nextInt(0, 100);
            data.add(i, randInt);
        }
        return data;
    }

    public static void printVector(Vector<Integer> data) {
        for (Integer value : data) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
