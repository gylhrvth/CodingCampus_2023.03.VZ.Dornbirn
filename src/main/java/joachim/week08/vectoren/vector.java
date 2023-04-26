package joachim.week08.vectoren;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> vex = fillRandom();
        Vector<Integer> vector = fillRandom();
        evenNumbers(vector);
        int small = smallestNumber(vector);
        System.out.println("small: " + small);

        int big = biggestNumber(vector);
        System.out.println("B.I.G.: " + big);

        bubbleVector(vector);
//        deleteOdd(vector);
        thirdParty(vector, vex);
    }

    public static Vector<Integer> fillRandom() {

        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < 20; i++) {
            vector.add((int) (Math.random() * 100) - 200);

        }
        return vector;
    }

    public static void evenNumbers(Vector<Integer> vector) {
        System.out.println(vector);
        int count = 0;
        for (
                int i = 0; i < vector.size(); i++) {
            if ((vector.elementAt(i) % 2) == 0) {
                count++;
            }
        }
        System.out.println("Even numbers: " + count);
    }

    public static int smallestNumber(Vector<Integer> vector) {
        int temp = 0;
        try {
            if (vector == null) {
                return 0;
            }
            temp = vector.elementAt(0);
            for (int i = 0; i < vector.size(); i++) {
                if (vector.elementAt(i) < temp) {
                    temp = vector.elementAt(i);
                }
            }
        } catch (ArrayIndexOutOfBoundsException aIOOBE) {
            System.out.println("Where number?");
        }
        return temp;
    }

    public static int biggestNumber(Vector<Integer> vector) {
        int temp = 0;
        try {
            if (vector == null) {
                return 0;
            }
            if (vector.elementAt(0) == null) {
                return 0;
            }
            temp = vector.elementAt(0);
            for (int i = 0; i < vector.size(); i++) {
                if (vector.elementAt(i) > temp) {
                    temp = vector.elementAt(i);
                }
            }
        } catch (ArrayIndexOutOfBoundsException aIOOBE) {
            System.out.println("Where number?");


        }
        return temp;
    }

    public static void bubbleVector(Vector<Integer> vector) {
        for (int i = 0; i < vector.size(); i++) {
            for (int j = 0; j < vector.size() - i - 1; j++) {
                if (vector.elementAt(j) < vector.elementAt(j + 1)) {
                    int temp = vector.elementAt(j);
                    vector.set(j, vector.elementAt(j + 1));
                    vector.set(j + 1, temp);
                    /*
                    vector.removeElementAt(j);
                    vector.add(j+1,temp);
                     */
                }
            }
        }
        System.out.println(vector);
    }

    public static void deleteOdd(Vector<Integer> vector) {
        for (int i = vector.size() - 1; i > 0; i--) {
            if (vector.elementAt(i) % 2 == 1) {
                vector.removeElementAt(i);
            }
        }
        System.out.println(vector);
    }

    public static void thirdParty(Vector<Integer> vector, Vector<Integer> vex) {
        if (vector == null) {
            return;
        }
        if (vex == null) {
            return;
        }
        bubbleVector(vector);
        bubbleVector(vex);
        System.out.println("Vector");
        System.out.println(vector);
        System.out.println("Vex");
        System.out.println(vex);
        System.out.println("Vextor");
        Vector<Integer> vextor = new Vector<>();

        while (vector.size() != 0 && vex.size() != 0) {
            if (biggestNumber(vector) > biggestNumber(vex)) {
                vextor.add(biggestNumber(vector));
                vector.removeElement(biggestNumber(vector));
            } else {
                vextor.add(biggestNumber(vex));
                vex.removeElement(biggestNumber(vex));
            }
        }
        System.out.println(vextor);
    }
}