package sandro.week08.DatenKlasse;

import java.util.Arrays;
import java.util.Random;

public class TestFunktionArrayResult {
    static Random rand = new Random();

    public static void main(String[] args) {

        int[] input = new int[]{1, 3, 4, 5, 6, 9,};
        int[] crazyNumber = crazyRandomnumbers(10);
        int[] randNumber = createRandomArray(10);

        ArrayResult getResult = ArrayResult.calculate(input); //new ArrayResult(input);
        System.out.println(Arrays.toString(input));
        System.out.println(getResult);
        System.out.println("Min: " + getResult.getMin());
        System.out.println("Max: " + getResult.getMax());
        System.out.println("Avg: " + getResult.getAvg());
        System.out.println("|------------------------------------------");
        getResult = ArrayResult.calculate(crazyNumber); //new ArrayResult(crazyNumber);
        System.out.println(Arrays.toString(crazyNumber));
        System.out.println(getResult);
        System.out.println("|------------------------------------------");
        getResult = ArrayResult.calculate(randNumber); // new ArrayResult(randNumber);
        System.out.println(Arrays.toString(randNumber));
        System.out.println(getResult);
    }

    public static int[] crazyRandomnumbers(int arrayspace) {
        int[] crazyRandom = new int[arrayspace];
        for (int i = 0; i < crazyRandom.length; i++) {
            int randomValue = rand.nextInt(-50, 51);
            crazyRandom[i] = randomValue;
        }

        return crazyRandom;
    }

    public static int[] createRandomArray(int arrayspace) {
        int[] result = new int[arrayspace];
        for (int i = 0; i < result.length; i++) {
            result[i] = rand.nextInt(101);
        }
        return result;
    }


}
