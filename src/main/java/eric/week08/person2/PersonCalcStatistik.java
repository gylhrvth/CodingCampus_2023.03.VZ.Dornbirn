package eric.week08.person2;

import java.util.List;

public class PersonCalcStatistik {
    public static Statistik calculateStatistics(List<PersonV2> personLists) {
        if (personLists == null || personLists.isEmpty()) {
            throw new IllegalArgumentException("Liste von Personen darf nicht leer sein!");
        }

        int minAge = Integer.MAX_VALUE;
        int maxAge = Integer.MIN_VALUE;
        double sumAge = 0;

        int minWeight = Integer.MAX_VALUE;
        int maxWeight = Integer.MIN_VALUE;
        double sumWeight = 0;

        int minHieght = Integer.MAX_VALUE;
        int maxHeight = Integer.MIN_VALUE;
        double sumHeight = 0;

        for (PersonV2 person : personLists) {

            if (person.getAge() < minAge) {
                minAge = person.getAge();
            }
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
            }
            sumAge += person.getAge();


            if (person.getWeight() < minWeight) {
                minWeight = person.getWeight();
            }

            if (person.getWeight() > maxWeight) {
                maxWeight = person.getWeight();
            }
            sumWeight += person.getWeight();


            if (person.getHeight() < minHieght) {
                minHieght = person.getHeight();
            }
            if (person.getHeight() > maxHeight) {
                maxHeight = person.getHeight();
            }
            sumHeight += person.getHeight();

        }

        double avgAge = sumAge / personLists.size();
        double avgWeight = sumWeight / personLists.size();
        double avgHeight = sumHeight / personLists.size();

        return new Statistik(minAge, maxAge, avgAge, minWeight, maxWeight, avgWeight, minHieght, maxHeight, avgHeight);
    }
}
