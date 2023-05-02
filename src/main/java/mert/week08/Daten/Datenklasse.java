package mert.week08.Daten;

public class Datenklasse {
    private int min;
    private int max;
    private double avg;


    private Datenklasse() {
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        avg = 0.0;
    }

    public static Datenklasse calculateMinMaxAvg(int[] data) {
        Datenklasse result = new Datenklasse();
        result.min = Integer.MAX_VALUE;
        result.max = Integer.MIN_VALUE;
        long sum = 0;

        for (int value : data) {
            if (value < result.min) {
                result.min = value;
            }
            if (value > result.max) {
                result.max = value;
            }
            sum += value;
        }
        result.avg = (double) sum / data.length;

        return result;
    }

    @Override
    public String toString() {
        return "Min: " + min + " max: " + max + " avg: " + avg;
    }

}

/*
  public int minWert(int[] min) {
        int minValue = Integer.MAX_VALUE;
        for (int value : min) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public int MaxWert(int[] max) {
        int maxValue = Integer.MIN_VALUE;
        for (int value : max) {
            if (value > maxValue) {
                maxValue = value;
            }

        }
        return maxValue;
    }

    public double avgWert(int[] avg) {
        int avgnum = 0;
        for (int value : avg) {
            avgnum += value;
        }
        return (double) avgnum / avg.length;

 */

