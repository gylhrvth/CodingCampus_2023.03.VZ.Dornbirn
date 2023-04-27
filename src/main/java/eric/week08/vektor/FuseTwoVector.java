package eric.week08.vektor;

import java.util.Random;
import java.util.Vector;

public class FuseTwoVector {
    public static void main(String[] args) {
        Vector<Integer> vOne = new Vector<>();
        Vector<Integer> vTwo = new Vector<>();
        Random randomOne = new Random();
        Random randomTwo = new Random();

        for (int i = 0; i < 20000; i++) {
            int randomNumber = randomOne.nextInt(100);
            int randomNumber2 = randomTwo.nextInt(100);
            vOne.add(randomNumber);
            vTwo.add(randomNumber2);
        }

        bubbleSort(vOne);
        bubbleSort(vTwo);

        System.out.print(vOne);
        System.out.println();

        System.out.print(vTwo);
        System.out.println();

        Vector<Integer> result = mergeSort(vOne, vTwo);
        System.out.print(result);

        
    }

    public static Vector<Integer> mergeSort(Vector<Integer> v1, Vector<Integer> v2) {
        Vector<Integer> result = new Vector<>(v1.size() + v2.size());
        int i = 0;
        int j = 0;

        while (i < v1.size() && j < v2.size()) {
            if (v1.get(i) <= v2.get(j)) {
                result.add(v1.get(i));
                i++;
            } else {
                result.add(v2.get(j));
                j++;
            }
        }
        while (i < v1.size()) {
            result.add(v1.get(i));
            i++;
        }
        while (j < v2.size()) {
            result.add(v2.get(j));
            j++;
        }
        return result;
    }


    public static Vector<Integer> merge(Vector<Integer> left, Vector<Integer> vTwo) {
        Vector<Integer> result = new Vector<>();

        int i = 0;
        int j = 0;

        while (i < left.size() && j < vTwo.size()) {
            if (left.get(i) <= vTwo.get(j)) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(vTwo.get(j));
                j++;
            }
        }
        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }
        while (j < vTwo.size()) {
            result.add(vTwo.get(j));
            j++;
        }
        return result;
    }

//    public static Vector<Integer> mergeSort(Vector<Integer> vec, Vector<Integer> low, Vector<Integer> high){
//        if (vec.size() == 0){
//            return vec;
//        }
//        int mid = vec.size() / 2;
//
//        for (int i = 0; i < mid; i++) {
//            low.add(vec.get(i));
//        }
//        for (int i = mid; i < vec.size(); i++) {
//            high.add(vec.get(i));
//        }
//
////        mergeSort(low);
////        mergeSort(high);
//
//        return merge(low, high);
//    }

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
