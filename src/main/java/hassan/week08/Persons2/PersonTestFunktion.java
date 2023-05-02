package hassan.week08.Persons2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonTestFunktion {
    public enum Data {
        NAME, AGE, HEIGHT, WEIGHT
    }



    public static void main(String[] args) {
        List<PersonList> personLists = new ArrayList<>();
        personLists.add(new PersonList("Hassan", 21, 187, 75));
        personLists.add(new PersonList("Lukas", 40, 180, 80));
        personLists.add(new PersonList("Mert", 24, 181, 70));
        personLists.add(new PersonList("Aygün", 24, 176, 75));
        personLists.add(new PersonList("Boso", 51, 140, 90));
        personLists.add(new PersonList("Eric", 21, 179, 60));


        Statistik statistics = PersonListStatistics.calculateStatistics(personLists);
        System.out.println(statistics.toString());

        System.out.println("----------------------------");


        for (Data data : Data.values()) {
            System.out.println("Sorting by: " + data);
            sorter(personLists, data);
            for (PersonList p : personLists) {
                System.out.println(p.getName() + " -- " + p.getAge() + " -- " + p.getHeight() + " -- " + p.getWeight());
            }
        }
    }

    public static void sorter(List<PersonList> personLists, Data data) {
        Comparator<PersonList> comparator = null;

        switch (data) {
            case NAME -> {
                comparator = Comparator.comparing(PersonList::getName);
            }

            case AGE -> {
                comparator = Comparator.comparing(PersonList::getAge);
            }
            case HEIGHT -> {

                comparator = Comparator.comparing(PersonList::getHeight);
            }
            case WEIGHT -> {
                comparator = Comparator.comparing(PersonList::getWeight);

            }
        }
        personLists.sort(comparator);
    }
}
