package ayguen.week08.dataClass;

import java.util.Random;

public class MinMaxAvgResult {

    private int minValue;
    private int maxValue;
    private double average;

    //Attributen

    private MinMaxAvgResult() {
        this.minValue = 0;
        this.maxValue = 0;
        this.average = 0.0;
    }

    public static MinMaxAvgResult calculate(int[] data) {
        MinMaxAvgResult result = new MinMaxAvgResult();

        result.minValue = Integer.MAX_VALUE;
        result.maxValue = Integer.MIN_VALUE;
        int summe = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < result.minValue) {
                result.minValue = data[i];
            }
            if (data[i] > result.maxValue) {
                result.maxValue = data[i];
            }
            summe += data[i];
        }
        result.average = (double)summe / data.length;


        return result;

    }
    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public double getAverage() {
        return average;
    }


}
