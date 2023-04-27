package eric.week08.person2;

import java.util.*;

public class PersonV2Main {
    private enum Data{
        NAME, AGE, HEIGHT, WEIGHT
    }
    private static Random age = new Random();
    private static Random height = new Random();
    private static Random weight = new Random();

    public static void main(String[] args) {
        List<PersonV2> persons = new LinkedList<>();
        persons.add(new PersonV2("Alpha", age.nextInt(20, 45), height.nextInt(150, 190), weight.nextInt(50, 100)));
        persons.add(new PersonV2("Beta", age.nextInt(20,45), height.nextInt(150, 190), weight.nextInt(50, 100)));
        persons.add(new PersonV2("Gamma", age.nextInt(20,45), height.nextInt(150, 190), weight.nextInt(50, 100)));
        persons.add(new PersonV2("Echo", age.nextInt(20,45), height.nextInt(150, 190), weight.nextInt(50, 100)));

        for (PersonV2 person : persons) {
            System.out.printf("%2s", person);
            System.out.println();
        }

        System.out.println("---");

        Statistik statistik = PersonCalcStatistik.calculateStatistics(persons);
        System.out.println(statistik);

        for (Data data : Data.values()) {
            System.out.println("Sorting by: " + data);
            sorter(persons, data);
            for (PersonV2 person : persons) {
                System.out.printf("%2s%n", person.getName() + "-->" + person.getAge() + "-" + person.getHeight() + "-" + person.getWeight());
            }
        }
    }

    public static void sorter(List<PersonV2> personSort, Data data){
        Comparator<PersonV2> comparator = null;

        switch (data){
            case NAME -> {
                comparator = Comparator.comparing(PersonV2::getName);
            }
            case AGE -> {
                comparator = Comparator.comparing(PersonV2::getAge);
            }
            case HEIGHT -> {
                comparator = Comparator.comparing(PersonV2::getHeight);
            }
            case WEIGHT -> {
                comparator = Comparator.comparing(PersonV2::getWeight);
            }
        }
        personSort.sort(comparator);
    }
}
