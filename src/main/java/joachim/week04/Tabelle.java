package joachim.week04;

public class Tabelle {
    public static void main(String[] args) {
        String minus = "-";
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar", "Lukas Joseph Hermann"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma", "Kneissel"};
        int lengthname = firstName.length+ lastName.length;
        int[] age = {40, 78, 5, 18, 81, 32};
        String[] place = {"Wien", "Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten", "Frankfurt"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f, 637.000f};


        System.out.printf("[%-35s]|[%-12s]|[%-60s]|[%-22s]\n", "Name", "Age in Years", "Lives at", "Distance to Capital");
        System.out.printf(minus.repeat(137));
        System.out.println();
        for (int i = 0; i < firstName.length; i++) {
            System.out.printf("[%-35s]|",  firstName[i] + " " + lastName[i]);
            System.out.printf("[%12s]|", age[i] + " Years");
            System.out.printf("[%-60s]|", place[i]);
            System.out.printf("[%22s]", distanceFromCapital[i] + " Km");
            System.out.println();

        }

    }
}

