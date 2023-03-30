package hassan.week04;

import java.util.Arrays;

public class Tabellarisch {

    public static void main(String[] args) {

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        String headerFirstName = "Vorname";
        // TODO: 29.03.23 wie da oben den header für alles andere machen.
        printTabelle(headerFirstName, firstName, lastName, age, place, distanceFromCapital);


    }

    public static String[] convertIntARrToStringArr(int[] arr) {
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = String.format("%d", arr[i]);
        }
        return result;
    }

    public static String[] convertFloatArrToStringArr(float[] arr) {
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = String.format("%.4f", arr[i]);
        }
        return result;
    }

    public static int findMaxWidth(String header, String[] arr) {
        int maxWidth = header.length();
        for (String s : arr) {
            int length = s.length();
            if (length > maxWidth) {
                maxWidth = length;
            }
        }
        return maxWidth;
    }
    public static void printTabelle(String headerFN, String[] firstName, String[] lastName, int[] age, String[] place, float[] distanceFromCapital) {
        String[] ageString = convertIntARrToStringArr(age);
        int ageWidth = findMaxWidth("Age", ageString);

        String[] disString = convertFloatArrToStringArr(distanceFromCapital);
        int disWidth = findMaxWidth("distanceFromCapital", disString);

        int numRows = firstName.length;
        int numCols = 5;

        int[] maxWidths = new int[numCols];
        // TODO: 29.03.23 headers zufügen
        maxWidths[0] = findMaxWidth(headerFN, firstName);
        maxWidths[1] = findMaxWidth("", lastName);
        maxWidths[2] = ageWidth;
        maxWidths[3] = findMaxWidth("", place);
        maxWidths[4] = disWidth;

        System.out.printf("| %-" + maxWidths[0] + "s | %-" + maxWidths[1] + "s | %" + maxWidths[2] + "s | %-" + maxWidths[3] + "s | %" + maxWidths[4] + "s |\n", "-".repeat(maxWidths[0]), "-".repeat(maxWidths[1]), "-".repeat(maxWidths[2]), "-".repeat(maxWidths[3]), "-".repeat(maxWidths[4]));
        System.out.printf("| %-" + maxWidths[0] + "s | %-" + maxWidths[1] + "s | %" + maxWidths[2] + "s | %-" + maxWidths[3] + "s | %" + maxWidths[4] + "s |\n", headerFN, "LN", "age", "place", "distanceFromCapital");
        System.out.printf("| %-" + maxWidths[0] + "s | %-" + maxWidths[1] + "s | %" + maxWidths[2] + "s | %-" + maxWidths[3] + "s | %" + maxWidths[4] + "s |\n", "-".repeat(maxWidths[0]), "-".repeat(maxWidths[1]), "-".repeat(maxWidths[2]), "-".repeat(maxWidths[3]), "-".repeat(maxWidths[4]));

        for (int i = 0; i < numRows; i++) {
            System.out.printf("| %-" + maxWidths[0] + "s | %-" + maxWidths[1] + "s | %" + maxWidths[2] + "d | %-" + maxWidths[3] + "s | %" + maxWidths[4] + ".4f |\n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
        }

        System.out.printf("| %-" + maxWidths[0] + "s | %-" + maxWidths[1] + "s | %" + maxWidths[2] + "s | %-" + maxWidths[3] + "s | %" + maxWidths[4] + "s |\n", "-".repeat(maxWidths[0]), "-".repeat(maxWidths[1]), "-".repeat(maxWidths[2]), "-".repeat(maxWidths[3]), "-".repeat(maxWidths[4]));
    }



}



