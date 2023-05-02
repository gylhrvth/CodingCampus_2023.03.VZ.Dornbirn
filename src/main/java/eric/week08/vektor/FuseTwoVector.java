package eric.week08.vektor;

import java.util.Random;
import java.util.Vector;

public class FuseTwoVector {
    private static Random rand = new Random();

    public static void main(String[] args) {
        Vector<Integer> vOne = generateRandomVector(20);
        Vector<Integer> vTwo = generateRandomVector(20);

        bubbleSort(vOne);
        bubbleSort(vTwo);

        System.out.println(vOne);
        System.out.println(vTwo);

        System.out.println("---");

        Vector<Integer> vThree = merge(vOne, vTwo);
        System.out.println(vThree);

    }

    public static Vector<Integer> generateRandomVector(int size) {
        Vector<Integer> result = new Vector<>();
        for (int i = 0; i < size; i++) {
            result.add(rand.nextInt(100));
        }
        return result;
    }

    public static Vector<Integer> merge(Vector<Integer> vOne, Vector<Integer> vTwo) {
        Vector<Integer> result = new Vector<>();

        while (!vOne.isEmpty() && !vTwo.isEmpty()) {
            if (vOne.firstElement() < vTwo.firstElement()) {
                result.add(vOne.firstElement());
                vOne.remove(0);
            } else {
                result.add(vTwo.firstElement());
                vTwo.remove(0);
            }
        }
        while (!vOne.isEmpty()) {
            result.add(vOne.firstElement());
            vOne.remove(0);
        }
        while (!vTwo.isEmpty()) {
            result.add(vTwo.firstElement());
            vTwo.remove(0);
        }
        return result;
    }

    public static void bubbleSort(Vector<Integer> randomNumber) {
        for (int i = 0; i < randomNumber.size(); i++) {
            for (int j = 0; j < randomNumber.size() - i - 1; j++) {
                if (randomNumber.get(j) > randomNumber.get(j + 1)) {
                    int temp = randomNumber.get(j);
                    randomNumber.set(j, randomNumber.get(j + 1));
                    randomNumber.set(j + 1, temp);
                }
            }
        }
    }
}
