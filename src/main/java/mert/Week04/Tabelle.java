package mert.Week04;

public class Tabelle {
    public static void main(String[] args) {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        int firstNameMax = max(firstName);
        int latstNameMax = max(lastName);
        int placeMax = max(place);


        System.out.println("Vorname         " + "Nachname         " + "Alter  " + "Ort            " + "Entfernung");
        for (int i = 0; i < firstName.length; i++) {
            System.out.printf("%-" + firstNameMax + "s %-" + latstNameMax + "s %10d %-" + placeMax + "s %10.2f\n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
        }
    }

    public static int max(String[] text) {
        int result = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i].length() > result) {
                result = text[i].length();
            }
        }
        return result;
    }

    public static int maxInt(int[] zahlen) {
        int max = 0;
        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] > max) {
                max = zahlen[i];
            }
        }
        return max;
    }
}





