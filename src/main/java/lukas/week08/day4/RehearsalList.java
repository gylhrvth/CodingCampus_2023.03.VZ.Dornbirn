package lukas.week08.day4;

import sandro.week02.Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class RehearsalList {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Lukas", 20, 190, 105));
        persons.add(new Person("Marie", 20, 190, 105));
        persons.add(new Person("Sandro", 20, 190, 105));
        persons.add(new Person("Beni", 20, 190, 105));
        persons.add(new Person("Joachim", 20, 190, 105));
        persons.add(new Person("Eric", 20, 190, 105));
        persons.add(new Person("Hassan", 20, 190, 105));
        persons.add(new Person("Mert", 20, 190, 105));
        persons.add(new Person("Aygün", 20, 190, 105));
        persons.add(new Person("Gyula", 20, 190, 105));
        persons.add(new Person("ToBeRemoved", 20, 190, 105));

        //Letzte Person
        Person p = new Person("ToBeRemoved", 20, 190, 105);
        System.out.println(persons.contains(p));

        persons.remove(p);
        System.out.println(persons.get(persons.size() - 1));

        printList(persons);
    }

    private static void printList(List<Person> persons) {
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }
}
