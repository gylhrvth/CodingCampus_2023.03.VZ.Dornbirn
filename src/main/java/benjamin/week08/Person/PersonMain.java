package benjamin.week08.Person;

import benjamin.week08.PersonEx.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
    public enum Sortby {
        Name, Age, Height, Weight
    }

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        Person person = new Person("Beni", 34, 184, 90);
        Person person2 = new Person("Oliver", 50, 175, 80);
        Person person3 = new Person("Manfred", 20, 160, 60);
        Person person4 = new Person("Josef", 36, 184, 85);
        Person person5 = new Person("Günter", 40, 175, 70);
        Person person6 = new Person("Manuel", 15, 170, 40);

        list.add(person);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        list.add(person6);

        PersonStats stats = PersonStats.calculateStats(list);

        System.out.println("Get MinHeight:" + stats.getMinHeight());
        System.out.println("Get MaxHeight:" + stats.getMaxHeight());
        System.out.println("Get MinWeight:" + stats.getMinWeight());
        System.out.println("Get MaxWeight:" + stats.getMaxWeight());
        System.out.println("Get Average Age:" + stats.getAverageAge());
        System.out.println("Get Average Weight:" + stats.getAverageWeight());
        System.out.println("Get Average Height:" + stats.getAverageHeight());
        System.out.println();
        sortList(list, Sortby.Height);
        for (Person p : list) {
            System.out.println(p.getName() + " " + p.getAge() + " " + p.getHeight() + " " + p.getWeight());
        }
    }

    //mit Comperator :)

//    public static void sortListComperator(List<Person> people, Sortby sort) {
//
//        Comparator<Person> comparator;
//
//        switch (sort) {
//            case Name -> {
//                comparator = Comparator.comparing(Person::getName);
//            }
//            case Age -> {
//                comparator = Comparator.comparing(Person::getAge).reversed();
//            }
//            case Height -> {
//                comparator = Comparator.comparing(Person::getHeight).reversed();
//            }
//            case Weight -> {
//                comparator = Comparator.comparing(Person::getWeight).reversed();
//            }
//            default -> throw new IllegalStateException("Unexpected value: " + sort);
//        }
//        people.sort(comparator);
//    }

    public static void sortList(List<Person> people, Sortby sort) {

        switch (sort) {
            case Name -> {
                sortNames(people);
            }
            case Age -> {
                sortAge(people);
            }
            case Height -> {
                sortHeight(people);
            }
            case Weight -> {
                sortWeight(people);
            }
            default -> throw new IllegalStateException("Unexpected value: " + sort);
        }
    }
    public static void sortNames(List<Person> people) {
        for (int i = 0; i < people.size(); i++) {
            for (int j = 0; j < people.size() - i - 1; j++) {
                if (people.get(j).getName().compareTo(people.get(j + 1).getName()) > 0) {
                    Person temp = people.get(j);
                    people.set(j, people.get(j + 1));
                    people.set(j + 1, temp);
                }
            }
        }
    }
    public static void sortAge(List<Person> people) {
        for (int i = 0; i < people.size(); i++) {
            for (int j = 0; j < people.size() - i - 1; j++) {
                if (people.get(j).getAge() > people.get(j + 1).getAge()) {
                    Person temp = people.get(j);
                    people.set(j, people.get(j + 1));
                    people.set(j + 1, temp);
                }
            }
        }
    }
    public static void sortWeight(List<Person> people) {
        for (int i = 0; i < people.size(); i++) {
            for (int j = 0; j < people.size() - i - 1; j++) {
                if (people.get(j).getWeight() < people.get(j + 1).getWeight()) {
                    Person temp = people.get(j);
                    people.set(j, people.get(j + 1));
                    people.set(j + 1, temp);
                }
            }
        }
    }
    public static void sortHeight(List<Person> people) {
        for (int i = 0; i < people.size(); i++) {
            for (int j = 0; j < people.size() - i - 1; j++) {
                if (people.get(j).getHeight() < people.get(j + 1).getHeight()) {
                    Person temp = people.get(j);
                    people.set(j, people.get(j + 1));
                    people.set(j + 1, temp);
                }
            }
        }
    }
}

