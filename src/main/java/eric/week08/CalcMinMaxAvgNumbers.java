package eric.week08;

public class CalcMinMaxAvgNumbers {
    private int smallestNum;
    private int biggestNum;
    private double averageNum;

    private CalcMinMaxAvgNumbers(){
        smallestNum = Integer.MAX_VALUE;
        biggestNum = Integer.MIN_VALUE;
        averageNum = 0.0;
    }
    public static CalcMinMaxAvgNumbers calculate(int[] values){
        CalcMinMaxAvgNumbers result = new CalcMinMaxAvgNumbers();
        // TODO: 24.04.2023 Calcuulate actual values and set in attributes,,,

        for (int i : values) {
            if (i > result.biggestNum) {
                result.biggestNum = i;
            }
            if (i < result.smallestNum) {
                result.smallestNum = i;
            }
            result.averageNum += i / (double) values.length;
        }
        return result;
    }
    public String toString() {
        return "Biggest Number:  [" + biggestNum + "]\nSmallest Number: [" +
                smallestNum + "]\nAverage Number:  [" + averageNum + "]";
    }
    public int getSmallestNum() {
        return smallestNum;
    }
    public int getBiggestNum() {
        return biggestNum;
    }
    public double getAverageNum() {
        return averageNum;
    }
}
