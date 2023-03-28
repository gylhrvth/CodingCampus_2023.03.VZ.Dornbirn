package ayguen.week04;

public class DatenTabellarisch {

    public static void main(String[] args) {

        String [] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String [] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int [] age = {40, 78, 5, 18, 81};
        String [] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float [] distanceFromCapital = {0f, 654.4f, 12.45f, 120.0f, 119.999f};

        System.out.printf("%-30s %-30s %-10s %-30s %-30s%n", "firstName", "lastName", "age", "place", "distanceFromCapital");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");


        for (int i = 0; i < firstName.length; i++) {
            System.out.printf("%-30s %-30s %-10s %-30s %-30.2f%n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);


        }

    }
}
