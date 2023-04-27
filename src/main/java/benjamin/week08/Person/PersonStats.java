package benjamin.week08.Person;

import benjamin.week08.PersonEx.Person;

import java.util.List;

public class PersonStats {

    private double minHeight;
    private double maxHeight;
    private double minWeight;
    private double maxWeight;
    private double averageAge;
    private double averageWeight;
    private double averageHeight;


    public PersonStats(double minHeight, double maxHeight, double minWeight, double maxWeight, double averageAge, double averageHeight, double averageWeight) {
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.averageAge = averageAge;
        this.averageWeight = averageWeight;
        this.averageHeight = averageHeight;
    }


    public double getMinHeight() {
        return minHeight;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public double getMinWeight() {
        return minWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public double getAverageAge() {
        return averageAge;
    }

    public double getAverageWeight() {
        return averageWeight;
    }

    public double getAverageHeight() {
        return averageHeight;
    }

    public static PersonStats calculateStats(List<Person> persons) {
        Person p = persons.get(0);
        double minHeight = p.getHeight();
        double minWeight = p.getWeight();
        double maxWeight = p.getWeight();
        double maxHeight = p.getHeight();
        double totalWeight = 0;
        double totalHeight = 0;
        int totalAge = 0;

        for (Person person : persons) {
            double height = person.getHeight();
            double weight = person.getWeight();
            int age = person.getAge();

            if (height < minHeight) {
                minHeight = height;
            }
            if (height > maxHeight){
                maxHeight = height;
            }
            if (weight < minWeight){
                minWeight = weight;
            }
            if (weight > maxWeight){
                maxWeight = weight;
            }
            totalWeight += weight;
            totalHeight += height;
            totalAge += age;
        }
        double averageHeight = totalHeight / persons.size();
        double averageWeight = totalWeight / persons.size();
        double averageAge = (double) totalAge / persons.size();

        return  new PersonStats(minHeight,maxHeight,minWeight,maxWeight,averageAge,averageHeight,averageWeight);
    }
}
