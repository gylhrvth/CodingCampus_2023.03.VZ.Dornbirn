package ayguen.week08.person;

public class MainPerson {

    public static void main(String[] args) {

        Person prs = new Person("Aygün", 23, 1.75, 69.0);
        Person prs2 = new Person("Gyula", 43, 1.72, 81.0);
        Person prs3 = new Person("Mert", 25, 1.76, 88.0);
        System.out.println(prs);
        System.out.println(prs2);
        System.out.println(prs3);
        System.out.println("AUFGABE PERSON");
        System.out.println("--------------");
        System.out.println();
        System.out.println("Name:     " + prs.personName());
        System.out.println("Age:      " + prs.getAge());
        System.out.println("Height:   " + prs.getHeight());
        System.out.println("Weight:   " + prs.getWeight());

    }
}
