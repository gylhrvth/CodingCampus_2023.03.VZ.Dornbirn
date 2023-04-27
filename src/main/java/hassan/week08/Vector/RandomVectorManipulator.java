package hassan.week08.Vector;

import java.util.Vector;

public class RandomVectorManipulator {

    public static void main(String[] args) {
        Vector<Integer> randomVector = RandomVector.generateRandomVector();

        System.out.println("Vector                : " + randomVector);

        System.out.println("Count even numbers    : " + countEvenNumbers(randomVector));

        System.out.println("Find smallest number  : " + findSmallestNumber(randomVector));

        System.out.println("Find largest Number   : " + findLargestNumber(randomVector));

        sortDescendingBubble(randomVector);
        System.out.println("Sortierung    (Bubble): "+randomVector);

        sortDescendingSelecyion(randomVector);
        System.out.println("Sortierung (Selection): "+randomVector);

        deleteOddNumbers(randomVector);
        System.out.println("Delete Odd Numbers    : " + randomVector);
    }
        
    public static int countEvenNumbers(Vector<Integer> v) {
        int count = 0;
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int findSmallestNumber(Vector<Integer> v) {
        if (v.isEmpty()) {
            return 0;
        }
        int smallest = v.get(0);
        for (int i = 1; i < v.size(); i++) {
            int current = v.get(i);
            if (current < smallest) {
                smallest = current;
            }
        }
        return smallest;
    }

    public static Integer findLargestNumber(Vector<Integer> v) {
        if (v.isEmpty()) {
            return null;
        }
        int largest = v.get(0);
        for (int i = 1; i < v.size(); i++) {
            int current = v.get(i);
            if (current > largest) {
                largest = current;
            }
        }
        return largest;
    }

    public static void sortDescendingBubble(Vector<Integer> vec) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < vec.size() - j; i++) {
                if (vec.get(i) < vec.get(i + 1)) {
                    tmp = vec.get(i);
                    vec.set(i, vec.get(i + 1));
                    vec.set(i + 1, tmp);
                    swapped = true;
                }
            }
        }
    }

    public static void sortDescendingSelecyion(Vector<Integer> vec) {
        int n = vec.size();

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vec.get(j) > vec.get(maxIndex)) {
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                int temp = vec.get(i);
                vec.set(i, vec.get(maxIndex));
                vec.set(maxIndex, temp);
            }
        }
    }


    public static void deleteOddNumbers(Vector<Integer> v) {
        for (int i = 0; i < v.size(); i++) {
            if (v.get(i) % 2 != 0){
                v.remove(i);
                i--;
            }
        }
    }
}
