package sandro.week08.DatenKlasse;

public class ArrayResult {
    private int min;
    private int max;
    private double avg;

    private ArrayResult(){
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
    public static ArrayResult calculate(int[] arr){
        ArrayResult result = new ArrayResult();

        if (arr.length > 0){
            result.min = arr[0];
            result.max = arr[0];
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
                result.min = Math.min(result.min, arr[i]);
                result.max = Math.max(result.max, arr[i]);
            }
            result.avg = (double)sum / arr.length;
        }
        return result;
    }

//    public ArrayResult(int[] arr) {
//        this.min = getmin(arr);
//        this.max = getmax(arr);
//        this.avg = getAvg(arr);
//        this.orgi = printOrginal(arr);
//    }


    @Override
    public String toString() {
        return "| max value is: " + max + "\n| min value is: " + min + "\n| average Value is: " + avg;
    }
}
