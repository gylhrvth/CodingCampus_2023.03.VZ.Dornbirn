package ayguen.week08.person;

import java.util.List;

public class MinMaxAvgPerson {

    private int minValueAge;
    private int maxValueAge;
    private int averageAge;

    private int minValueHeight;
    private int maxValueHeight;
    private int averageHeight;

    private int minValueWeight;
    private int maxValueWeight;
    private int averageWeight;


    private MinMaxAvgPerson() {
        this.minValueAge = 0;
        this.maxValueAge = 0;
        this.averageAge = 0;

        this.minValueHeight = 0;
        this.maxValueHeight = 0;
        this.averageHeight = 0;

        this.minValueWeight = 0;
        this.maxValueWeight = 0;
        this.averageWeight = 0;
    }

    public static MinMaxAvgPerson calculate(List<PersonV2> persons) {
        MinMaxAvgPerson result = new MinMaxAvgPerson();

        result.minValueAge = Integer.MAX_VALUE;
        result.maxValueAge = Integer.MIN_VALUE;
        int summe = 0;

        for (PersonV2 person : persons) {
            int age = person.getAge();
            if (age < result.minValueAge) {
                result.minValueAge = age;
            }
            if (age > result.maxValueAge) {
                result.maxValueAge = age;
            }
            summe += age;
        }
        result.averageAge = summe / persons.size();


        result.minValueHeight = Integer.MAX_VALUE;
        result.maxValueHeight = Integer.MIN_VALUE;
        int summeHeight = 0;

        for (PersonV2 person : persons) {
            int height = person.getHeight();
            if (height < result.minValueHeight) {
                result.minValueHeight = height;
            }
            if (height > result.maxValueHeight) {
                result.maxValueHeight = height;
            }
            summeHeight += height;
        }
        result.averageHeight = summeHeight / persons.size();

        result.minValueWeight = Integer.MAX_VALUE;
        result.maxValueWeight = Integer.MIN_VALUE;
        int summWeight = 0;

        for (PersonV2 person : persons){
            int weight = person.getWeight();
            if (weight < result.minValueWeight){
                result.minValueWeight = weight;
            }
            if (weight > result.maxValueWeight){
                result.maxValueWeight = weight;
            }
            summWeight += weight;
        }
        result.averageWeight = summWeight / persons.size();

        return result;


    }

    public int getMinValueAge() {
        return minValueAge;
    }

    public int getMinValueHeight() {
        return minValueHeight;
    }


    public int getMinValueWeight() {
        return minValueWeight;
    }
    @Override
    public String toString() {
        return "Alter: "+ "minValue = "+ minValueAge +" maxValue = " + maxValueAge + " durchschnitt = " + averageAge + "\n" +
                "Grösse: " + "minValue = " + minValueHeight + " maxValue = " + maxValueHeight + " durchschnitt = " + averageHeight + "\n" +
                "Gewicht: " + "minValue = " + minValueWeight + "maxValue = " + maxValueWeight + "durchschnitt = " + averageWeight + "\n";

    }

}
