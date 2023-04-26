package eric.week08.calculateNumbers;

import java.util.Arrays;

public class CalcNumbersMain {
    public static void main(String[] args) {
        int[] testArray = new int[]{5, 12, -3, 2, 0, 1, 1, 1, 23, 2};

        System.out.println(Arrays.toString(testArray));
        CalcMinMaxAvgNumbers result = CalcMinMaxAvgNumbers.calculate(testArray); //new CalcMinMaxAvgNumbers();
        System.out.println("Data was extracted Successfully.");
        System.out.println(result);
        System.out.println("----");
        System.out.println("Min: " + result.getSmallestNum());
        System.out.println("Max: " + result.getBiggestNum());
        System.out.println("Avg: " + result.getAverageNum());

    }
}
