package eric.week08.vektor;

import lukas.week03.day4.Colors;

import java.util.Random;
import java.util.Vector;

public class VectorExercise {
    public static void main(String[] args) {
        Vector<Integer> gyulasLieblingsVector = new Vector<>();
        System.out.println(gyulasLieblingsVector);
        System.out.println("getGreatest: " + getGreatestNumber(gyulasLieblingsVector));


        Vector<Integer> randomVector = new Vector<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt(100);
            randomVector.add(randomNumber);
        }
        System.out.println(randomVector);

        System.out.println();

        System.out.print(Colors.COLORS[6] + "Amount of even numbers: " + Colors.RESET);
        System.out.println(getCountOfEvenNumber(randomVector));

        System.out.println();

        System.out.print(Colors.COLORS[6] + "Greatest number is: " + Colors.RESET);
        System.out.println(getGreatestNumber(randomVector));

        System.out.println();

        System.out.print(Colors.COLORS[6] + "Smallest number is: " + Colors.RESET);
        System.out.println(getSmallestNumber(randomVector));

        System.out.println();

        System.out.println(Colors.COLORS[6] + "sort elements descending" + Colors.RESET);
        bubbleSort(randomVector);
        System.out.println(randomVector);

        System.out.println();

        System.out.println(Colors.COLORS[6] + "Delete uneven numbers" + Colors.RESET);
        for (int i = 0; i < randomVector.size(); i++) {
            if (randomVector.get(i) % 2 != 0) {
                randomVector.remove(i);
                i--;
            }
        }
        System.out.println(randomVector);

    }

    public static Integer getGreatestNumber(Vector<Integer> greatestNum) {
        if (greatestNum.size() == 0){
            return null;
        }
        Integer max = greatestNum.get(0);
        for (int i = 0; i < greatestNum.size(); i++) {
            if (greatestNum.get(i) > max) {
                max = greatestNum.get(i);
            }
        }
        return max;
    }

    public static int getSmallestNumber(Vector<Integer> smallestNum) {
        int min = smallestNum.get(0);
        for (int i = 0; i < smallestNum.size(); i++) {
            if (smallestNum.get(i) < min) {
                min = smallestNum.get(i);
            }
        }
        return min;
    }

    public static int getCountOfEvenNumber(Vector<Integer> countEvenNumbers) {
        int count = 0;
        for (int i = 0; i < countEvenNumbers.size(); i++) {
            if (countEvenNumbers.get(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void bubbleSort(Vector<Integer> randomNumber) {

        for (int i = 0; i < randomNumber.size(); i++) {
            for (int j = 0; j < randomNumber.size() - i - 1; j++) {
                if (randomNumber.get(j) < randomNumber.get(j + 1)) {
                    int temp = randomNumber.get(j);
                    randomNumber.set(j, randomNumber.get(j + 1));
                    randomNumber.set(j + 1, temp);
                }
            }
        }
    }
}
