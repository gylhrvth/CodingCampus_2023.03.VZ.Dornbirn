package benjamin.week08.Vector;

import java.util.Random;
import java.util.Vector;

public class CreateVector {
    static Random rand = new Random();

    public static void main(String[] args) {

        int dim = 20;

        Vector<Integer> random = randVec(dim);
        System.out.println(random);

        int straight = straightVec(random);
        System.out.println("Straight Numbers: " + straight);

        int smallest = smallestVec(random);
        System.out.println("Smallest Number: " + smallest);

        int biggest = biggestVec(random);
        System.out.println("Biggest Number: " + biggest);

        sortDscVec(random);
        printVec(random);
//        System.out.println(random);

        deleteVec(random);
        printVec(random);

    }

    public static Vector<Integer> randVec(int dim) {
        Vector<Integer> data = new Vector<>();
        for (int i = 0; i < dim; i++) {
            int randNumber = rand.nextInt(100);
            data.add(randNumber);
        }
        return data;
    }

    public static int straightVec(Vector<Integer> dim) {
        int count = 0;
        for (int number : dim) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int smallestVec(Vector<Integer> dim) {
        int smallest = 0;
        for (int number : dim) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int biggestVec(Vector<Integer> dim) {
        int biggest = 0;
        for (int number : dim) {
            if (number > biggest) {
                biggest = number;
            }
        }
        return biggest;
    }

    public static void sortDscVec(Vector<Integer> dim) {
        for (int i = 0; i < dim.size(); i++) {
            for (int j = 0; j < dim.size() - i - 1; j++) {
                if (dim.get(j) < dim.get(j + 1)) {
                    Integer temp = dim.get(j);
                    dim.set(j, dim.get(j + 1));
                    dim.set(j + 1, temp);
                }
            }
        }
    }

    public static void printVec(Vector<Integer> dim) {
        for (int value : dim) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void deleteVec(Vector<Integer> dim) {
        for (int i = 0; i < dim.size(); i++) {
            if (dim.elementAt(i) % 2 != 0) {
                dim.remove(i);
                i--;
            }
        }
    }


}


