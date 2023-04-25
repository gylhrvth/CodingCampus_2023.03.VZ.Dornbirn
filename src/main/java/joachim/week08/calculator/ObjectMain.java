package joachim.week08.calculator;

import java.util.Arrays;

public class ObjectMain {
    public static void main(String[] args) {
        int[] testValues = new int[]{11, 2, -3, 5};
        Calculator result = Calculator.calculateMinMaxAvg(testValues);

        System.out.println(Arrays.toString(testValues));
        System.out.println(result);
        System.out.println("------------");
        System.out.println("min: " + result.getMin());
        System.out.println("max: " + result.getMax());
        System.out.println("avg: " + result.getAvg());
    }
}
