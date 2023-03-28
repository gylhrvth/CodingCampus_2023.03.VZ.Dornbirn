package hassan.week04;

public class Tabellarisch {

    public static void main(String[] args) {


        String[] firstname = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};


        System.out.printf("%-20s %-20s %-5s %-20s %-20s%n", "First Name", "Last Name", "Age", "Place", "Distance from Capital");
        System.out.println("-------------------------------------------------------------------------------------------------");


        for (int i = 0; i < firstname.length; i++) {
            System.out.printf("%-20s %-20s %-5d %-20s %-20.2f%n", firstname[i], lastName[i],age[i],place[i],distanceFromCapital[i]);
        }

    }

}
