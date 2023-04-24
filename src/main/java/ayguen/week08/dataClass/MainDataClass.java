package ayguen.week08.dataClass;

import java.util.Arrays;


public class MainDataClass {

    public static void main(String[] args) {
        int[] testValues = ayguen.week02.ArrayWerte.createCrazyRange(13,-100, 100);

        MinMaxAvgResult result = MinMaxAvgResult.calculate(testValues);

        System.out.println(Arrays.toString(testValues));
        System.out.println("---------");
        System.out.println("AVG: " + result.getAverage());
        System.out.println("MIN: " + result.getMinValue());
        System.out.println("MAX: " + result.getMaxValue());

    }
}

