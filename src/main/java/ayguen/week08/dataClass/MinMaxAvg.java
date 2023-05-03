package ayguen.week08.dataClass;

public class MinMaxAvg {

    private int minValue;
    private int maxValue;
    private double average;

    //Attributen

    private MinMaxAvg() {
        this.minValue = 0;
        this.maxValue = 0;
        this.average = 0.0;
    }

    public static MinMaxAvg calculate(int[] data) {
        MinMaxAvg result = new MinMaxAvg();

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
