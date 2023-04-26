package joachim.week08.calculator;

public class Calculator {

    private int min;
    private int max;
    private float avg;

    private Calculator() {
        min = 0;
        max = 0;
        avg = 0.0f;
    }

    public static Calculator calculateMinMaxAvg(int[] data){
        Calculator result = new Calculator();

        // TODO: 24.04.2023 the calculation
        for (int number : data) {
            if (number > result.max) {
                result.max = number;
            }
        }
        for (int number : data) {
            if (number < result.getMin()) {
                result.min = number;
            }
        }
        for (int number : data) {
            result.avg += number;
        }
        result.avg = result.avg / data.length;


        return result;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public float getAvg() {
        return avg;
    }

    @Override
    public String toString() {
        return null;
    }

}
