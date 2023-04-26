package mariechristine.week8;

public class MinMaxAvg { //Datenklasse

    private int min;                //Attribut

    private int max;

    private double avg;


/*
    public GetElementOfArray(int min, int max, double avg){ //Konstruktor
        this.min = min;
        this.max = max;
        this.avg = avg;
    }
 */
    private MinMaxAvg(){
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        avg = 0.0;
    }
    
    public static MinMaxAvg calculate(int[] data){
        MinMaxAvg result = new MinMaxAvg();

        long sum = 0;
        for (int value: data) {
            sum += value;
            if (value < result.min){
                result.min = value;
            }
            if (value > result.max){
                result.max = value;
            }
        }
        if (data.length > 0){
            result.avg = (double)sum / data.length;
        }

        return result;
    }
    
    public int getMin(){
        return min;
    }

    public int getMax(){
        return max;
    }

    public double getAvg(){
        return avg;
    }

    public String toString(){
        return min + ", " + max + ", " + avg + ".";
    }

}


