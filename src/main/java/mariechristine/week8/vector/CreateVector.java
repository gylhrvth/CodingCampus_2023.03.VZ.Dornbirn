package mariechristine.week8.vector;

import java.util.Random;
import java.util.Vector;

public class CreateVector {


    public static void main(String[] args) {

        System.out.println("Vector mit 20 Zufallszahlen:");
        Vector<Integer> myData = createRandomVector(20);
        System.out.println(myData);

        System.out.println("\nZählen der geraden Zahlen: " + countEvenNumber(myData));
        System.out.println("\nDie kleinste Zahl ist: " + lookUpSmallestNumber(myData));
        System.out.println("\nDie größte Zahl lautet: " + lookUpBiggestNumber(myData));
        System.out.println("\nElemente absteigend sortiert:");
        sortElementsDecreasing(myData);
        System.out.println("\nUngerade Elemente gelöscht: ");
        deleteUnevenNumber(myData);


    }

    public static Vector<Integer> createRandomVector(int size) {
        Vector<Integer> data = new Vector<>();

        for (int i = 0; i < size; i++) {
            data.add((int) (Math.random() * 100));
        }
        return data;
    }

    public static int countEvenNumber(Vector<Integer> data) {
        int count = 0;
        for (Integer value : data) {
            if (value % 2 == 0) {
                ++count;
            }
        }

        return count;
    }

    public static int lookUpSmallestNumber(Vector<Integer> data) {
        int smallestNum = Integer.MAX_VALUE;
        for (Integer value : data) {
            if (value < smallestNum) {
//                System.out.println(value);
                smallestNum = value;
            }
        }
        return smallestNum;
    }

    public static int lookUpBiggestNumber(Vector<Integer> data) {
        int biggestNum = Integer.MIN_VALUE;
        for (Integer value : data) {
            if (value > biggestNum) {
                biggestNum = value;
            }

        }
        return biggestNum;
    }

    public static void sortElementsDecreasing(Vector<Integer> data) {
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.size() - i - 1; j++) {
                if (data.elementAt(j) < data.elementAt(j + 1)) {
                    int temp = data.elementAt(j);
                    data.set(j, data.elementAt(j + 1));
                    data.set(j + 1, temp);
                }

            }

        }
        System.out.println(data);
    }

    public static void deleteUnevenNumber(Vector<Integer> data) {
        for (int i = 0; i < data.size(); i++) {
            if (data.elementAt(i) % 2 == 1) {
                data.remove(data.elementAt(i));
                i--;
            }
        }
        System.out.println(data);

    }

}



