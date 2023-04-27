package hassan.week08.Vector;

import java.util.Vector;

public class MergeVector {
    public static void main(String[] args) {

        Vector<Integer> randVector = RandomVector.generateRandomVector();

        RandomVectorManipulator.sortDescendingSelecyion(randVector);
        System.out.println(randVector);

        Vector<Integer> randVector2 = RandomVector.generateRandomVector();
        RandomVectorManipulator.sortDescendingSelecyion(randVector2);
        System.out.println(randVector2);

        System.out.println();
        System.out.println("Merge Sorted");
        Vector<Integer> result = mergeSortedVectores(randVector,randVector2);
        System.out.println(result);

    }

    public static Vector<Integer> mergeSortedVectores(Vector<Integer> v1, Vector<Integer> v2) {
        Vector<Integer> result = new Vector<Integer>(v1.size() + v2.size());
        int i = 0;
        int j = 0;

        while (i < v1.size() && j < v2.size()) {
            if (v1.get(i) < v2.get(j)) {
                result.add(v1.get(i));
                i++;
            }else {
                result.add(v2.get(j));
                j++;
            }
        }

        while (i < v1.size()){
            result.add(v1.get(i));
            i++;
        }

        while (j < v2.size()){
            result.add(v2.get(j));
            j++;
        }
        return result;
    }
}
