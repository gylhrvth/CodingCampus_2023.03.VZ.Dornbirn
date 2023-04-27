package mariechristine.week8.vector;

import java.util.Vector;

public class MergeVector {
    public static void main(String[] args) {

        Vector<Integer> data = createRandomVector(20);

        System.out.println("Elemente aufsteigend sortiert: ");
        sortElementsIncreasing(data);
        System.out.println("-------------------------------------\n");

        System.out.println("Zwei Random Vectoren: ");
        Vector<Integer> a = createRandomVector(10);
        sortElementsIncreasing(a);
        Vector<Integer> b = createRandomVector(10);
        sortElementsIncreasing(b);

        System.out.println("\nZwei zusammengeführte Vectoren aufsteigend sortiert: ");
        System.out.println(sortThreeVectors(a, b));

    }

    /*    [0, 9, 19, 33, 35, 54, 55, 70, 70, 80]
                    |
        [2, 20, 23, 35, 35, 38, 49, 56, 83, 99]
                     |
         0, 2, 9, 19, 20, 23
    */
    public static Vector<Integer> createRandomVector(int size) {
        Vector<Integer> data = new Vector<>();

        for (int i = 0; i < size; i++) {
            data.add((int) (Math.random() * 100));
        }
        return data;
    }

    public static void sortElementsIncreasing(Vector<Integer> data) {
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.size() - i - 1; j++) {
                if (data.elementAt(j) > data.elementAt(j + 1)) {
                    int temp = data.elementAt(j);
                    data.set(j, data.elementAt(j + 1));
                    data.set(j + 1, temp);
                }

            }

        }
        System.out.println(data);

    }

    public static Vector<Integer> sortThreeVectors(Vector<Integer> lhsData, Vector<Integer> rhsData) {
        Vector<Integer> result = new Vector<>();

        int i = 0;
        int j = 0;

        while (i < lhsData.size() && j < rhsData.size()) {
            int lhsValue = lhsData.get(i);
            int rhsValue = rhsData.get(j);
            if (lhsValue < rhsValue) {
                result.add(lhsValue);
                i++;
            } else {
                result.add(rhsValue);
                j++;
            }
        }


        for (; i < lhsData.size(); i++) {
            result.add(lhsData.get(i));
        }

        for (; j < rhsData.size(); j++) {
            result.add(rhsData.get(j));
        }

//        for (int i = 0; i < lhsData.size(); i++) {
//            for (int j = 0; j < rhsData.size(); j++) {
//                if (lhsData.elementAt(i) < rhsData.elementAt(j)) {
//
//
//
//
//                }
//            }
//        }
        return result;
    }
}


