package benjamin.week08;

public class DataMinMaxAvg {

    private int min;
    private int max;
    private double avg;

    public DataMinMaxAvg() {
        this.min = 0;
        this.max = 0;
        this.avg = 0;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public double getAvg() {
        return avg;
    }

    public static DataMinMaxAvg calculate(int[] data) {
        DataMinMaxAvg result = new DataMinMaxAvg();

        if (data.length > 0) {
            result.min = data[0];
            result.max = data[0];
            int sum = 0;

            for (int i = 0; i < data.length; i++) {
                sum += data[i];
                result.min = Math.min(result.min, data[i]);
                result.max = Math.max(result.max, data[i]);
            }
            result.avg = (double) sum / data.length;
        }
        return result;
    }

    @Override
    public String toString() {  //
        return "Max: " + max + "\nMin: " + min + "\nAVG: " + avg;
    }
}
