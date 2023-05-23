package gyula.week08;

import sandro.week08.Vector.MergeSort2Vectors;

import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.Random;
import java.util.Vector;

public class Merge {
    private static Random rand = new Random();
    private static final Comparator<Integer> comp = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    };
    public static void main(String[] args) {
        Vector<Integer> left = generateVectorAsc(20_000_000);
        Vector<Integer> right = generateVectorAsc(20_000_000);
        left.sort(comp);
        right.sort(comp);
//        System.out.println(left);
//        System.out.println(right);

        System.out.println("=========");
        Instant start = Instant.now();
        Vector<Integer> mergedVector = MergeSort2Vectors.mergeData2(left, right); //merge(left, right);
        Instant end = Instant.now();

//       System.out.println(left);
//       System.out.println(right);
//       System.out.println(mergedVector);

        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");

    }

    private static Vector<Integer> generateVectorAsc(int size){
        Vector<Integer> result = new Vector<>();
        for (int i = 0; i < size; i++) {
            result.add(rand.nextInt(100));
        }
        return result;
    }

    private static Vector<Integer> merge(Vector<Integer> data1, Vector<Integer> data2){
        Vector<Integer> result = new Vector<>();

        while (!data1.isEmpty() && !data2.isEmpty()) {
            if (data1.firstElement() < data2.firstElement()) {
                result.add(data1.firstElement());
                data1.remove(0);
            } else {
                result.add(data2.firstElement());
                data2.remove(0);
            }
        }
        while (!data1.isEmpty()) {
            result.add(data1.firstElement());
            data1.remove(0);
        }
        while (!data2.isEmpty()) {
            result.add(data2.firstElement());
            data2.remove(0);
        }

        return result;
    }
}
