package benjamin.week04;

public class Tabelle {
    public static void main(String[] args) {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};


        for (int i = 0; i < firstName.length; i++) {
            System.out.printf("| %-20s | %-20s |\n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);

        }
    }
}