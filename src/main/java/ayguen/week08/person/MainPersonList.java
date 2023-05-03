package ayguen.week08.person;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MainPersonList {

    public static void main(String[] args) {
        List<PersonV2> persons = createPersonList();

        printPersons(persons);
        MinMaxAvgPerson minMaxAvg = MinMaxAvgPerson.calculate(persons);
        System.out.println();
        System.out.println("Minimum Maxmimum avg Alter: ");
        System.out.println(minMaxAvg);
        System.out.println();
    }

    public static List<PersonV2> createPersonList() {
        List<PersonV2> persons = new ArrayList<>();

        PersonV2 pers = new PersonV2("Aygün", 24, 176, 68);
        PersonV2 pers1 = new PersonV2("Lukas", 21, 1888, 68);
        PersonV2 pers2 = new PersonV2("Mert", 24, 176, 68);
        PersonV2 pers3 = new PersonV2("Gyula", 26, 176, 68);
        PersonV2 pers4 = new PersonV2("Marie", 23, 120, 68);
        PersonV2 pers5 = new PersonV2("Beni", 25, 176, 68);
        PersonV2 pers6 = new PersonV2("Joachim", 24, 176, 68);
        PersonV2 pers7 = new PersonV2("Eric", 24, 176, 10856);
        PersonV2 pers8 = new PersonV2("Hassan", 24, 176, 3);
        PersonV2 pers9 = new PersonV2("Sandro", 24, 176, 68);

        persons.add(pers);
        persons.add(pers1);
        persons.add(pers2);
        persons.add(pers3);
        persons.add(pers4);
        persons.add(pers5);
        persons.add(pers6);
        persons.add(pers7);
        persons.add(pers8);
        persons.add(pers9);
        return persons;
    }
    public static void printPersons(List<PersonV2> personss){

        for (int i = 0; i < personss.size(); i++) {
            System.out.println(personss.get(i));

        }


    }
}
