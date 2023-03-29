package joachim.week04;

public class Tabelle {
    public static void main(String[] args) {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Llanfairpwllgwyngyllgogerychwyrndrobwllllantysiliogogogoch", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        for (int i = 0; i < 5; i++) {
            System.out.printf("[%-35s]","Name: " +  firstName[i] + " " + lastName[i]);
            System.out.printf("[%-10s]","Age: " +  age[i]);
            System.out.printf("[%-70s]","Lives at: " +  place[i]);
            System.out.printf("[%-32s]","Distance to Capital: " + distanceFromCapital[i]);
            System.out.println();

        }

    }
}

