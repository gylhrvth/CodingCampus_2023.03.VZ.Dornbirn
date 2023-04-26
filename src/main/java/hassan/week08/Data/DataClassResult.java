package hassan.week08.Data;

public class DataClassResult {

    private int max;
    private int min;
    private double avg;




    public DataClassResult(int[] arr){
        findMax(arr);
        findMin(arr);
        findAvg(arr);
    }

    private DataClassResult(){
    }

    public static DataClassResult calculateMinMaxAvg(int[] data){
        DataClassResult result = new DataClassResult();
        result.findMin(data);
        result.findMax(data);
        result.findAvg(data);
        return result;
    }

    public void findMin(int[] min) {
        this.min = Integer.MAX_VALUE;
        for (int i : min) {
            if (i < this.min) {
                this.min = i;
            }
        }
    }


    public void findMax(int[] max) {
        this.max = Integer.MIN_VALUE;
        for (int i : max) {
            if (i > this.max) {
                this.max = i;
            }
        }
    }

    public void findAvg(int[] avg) {
        this.avg = 0;
        long sum = 0;
        for (int i : avg) {
             sum += i;
        }
        this.avg = (double)sum / avg.length;
    }

    public String toString() {
        return "Max : [" + this.max + "] \nMin : [" +
                this.min + "] \nAvg : [" + this.avg + "].";
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public double getAvg() {
        return avg;
    }
}
