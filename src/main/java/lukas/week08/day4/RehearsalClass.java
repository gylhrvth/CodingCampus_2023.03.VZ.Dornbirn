package lukas.week08.day4;

public class RehearsalClass {
    public static void main(String[] args) {
        Person person = new Person("Lukas", 37, 180, 80);
        Person person1 = new Person("Lukas", 37, 180, 80);
        Person person2 = new Person("Hassan", 37, 180, 80);

        System.out.println(person.getName());

        String output = person.toString();
        System.out.println(output);
        System.out.println(person1);

        printObject(person);

        System.out.println("Sind Personen gleich? " + person1.equals(person));
        System.out.println("Sind Personen gleich? " + person2.equals(person1));
    }


    private static void printObject(Object obj) {
        System.out.println("My object: " + obj.toString());
    }
}
