package mert.week08.Personen2;

import java.util.List;

public class CalculateMix {
    private CalculateDataPersons age;
    private CalculateDataPersons height;
    private CalculateDataPersons weight;

    private CalculateMix() {

    }

    public static CalculateMix calculate(List<Personnnn2> persons) {
        CalculateDataPersons resultAge = new CalculateDataPersons();
        resultAge.min = Integer.MAX_VALUE;
        resultAge.max = Integer.MIN_VALUE;
        long sum = 0;

        for (Personnnn2 value : persons) {
            if (value.getAge() < resultAge.min) {
                resultAge.min = value.getAge();
            }
            if (value.getAge() > resultAge.max) {
                resultAge.max = value.getAge();
            }
            sum += value.getAge();
        }
        resultAge.avg = (double) sum / persons.size();

        CalculateDataPersons resultHeight = new CalculateDataPersons();
        resultHeight.min = Integer.MAX_VALUE;
        resultHeight.max = Integer.MIN_VALUE;


        for (Personnnn2 value : persons) {
            if (value.getHeight() < resultHeight.min) {
                resultHeight.min = value.getHeight();
            }
            if (value.getHeight() > resultHeight.max) {
                resultHeight.max = value.getHeight();
            }
            sum += value.getHeight();
        }
        resultHeight.avg = (double) sum / persons.size();

        CalculateDataPersons resultWeight = new CalculateDataPersons();
        resultWeight.min = Integer.MAX_VALUE;
        resultWeight.max = Integer.MIN_VALUE;


        for (Personnnn2 value : persons) {
            if (value.getWeight() < resultWeight.min) {
                resultWeight.min = value.getWeight();
            }
            if (value.getWeight() > resultWeight.max) {
                resultWeight.max = value.getWeight();
            }
            sum += value.getWeight();
        }
        resultWeight.avg = (double) sum / persons.size();

        CalculateMix mix = new CalculateMix();
        mix.age = resultAge;
        mix.height = resultHeight;
        mix.weight = resultWeight;


        return mix;
    }

    @Override
    public String toString() {
        return "Größe. " + height + "\n" +
                "Alter. " + age + "\n"+
                "Gewicht. " + height;
    }
}
