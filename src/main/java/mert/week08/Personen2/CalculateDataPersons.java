package mert.week08.Personen2;

import java.util.List;

public class CalculateDataPersons {
    public int min;
    public int max;
    public double avg;

    public CalculateDataPersons() {
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        avg = 0.0;
    }
    @Override
    public String toString() {
        return "Min: " + min + " max: " + max + " avg: " + avg;
    }
}
