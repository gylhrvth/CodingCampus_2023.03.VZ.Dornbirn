package benjamin.week07;

import java.io.*;
import java.util.Scanner;


public class StreamTabelle {
    public static void main(String[] args) {

        File f = new File("assets/tmp/output.txt");

        String headfirstNamen = "First Name";
        String headLastNamen = "Last Name";
        String headPlace = "Place";
        String headAge = "Age";
        String headDistance = "Distance From Capital";

        String[] firstName = {"Alfonso", "Beatrix-Eleonors", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        int first = formatStrings(headfirstNamen, firstName);
        int last = formatStrings(headLastNamen, lastName);
        int place1 = formatStrings(headPlace, place);
        int age1 = formatAge(headAge, age);
        int dist = formatDistance(headDistance, distanceFromCapital);

        try {
            FileOutputStream fos = new FileOutputStream(f, false);
            PrintStream ps = new PrintStream(fos);

            //Information + Kopfzeile

            ps.printf("|%-" + first + "s|%-" + last + "s|%" + age1 + "s|%-" + place1 + "s|%" + dist + "s|",
                    headfirstNamen, headLastNamen, headAge, headPlace, headDistance);
            ps.println();

            ps.printf("|%s|%s|%s|%s|%s|", "-".repeat(first), "-".repeat(last), "-".repeat(age1), "-".repeat(place1), "-".repeat(dist));

            ps.println();

            //Inhalt und Daten

            for (int i = 0; i < firstName.length; i++) {

                ps.printf("|%-" + first + "s|%-" + last + "s|%" + age1 + "d|%-" + place1 + "s|%" + dist + ".2f|",
                        firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
                ps.println();
            }

            ps.close();

        } catch (FileNotFoundException fnfe) {
            System.err.println(f.getAbsolutePath() + " not available.");
        }
    }

    public static int formatStrings(String head, String[] arr) {
        int name = head.length();
        for (String max : arr) {
            if (max.length() > name) {
                name = max.length();
            }
        }
        return name;
    }

    public static int formatAge(String head, int[] arr) {
        int length = head.length();
        for (int max : arr) {
            String text = String.format("%d", max);
            if (text.length() > length) {
                length = max;
            }
        }
        return length;
    }

    public static int formatDistance(String head, float[] arr) {
        int length = head.length();
        for (float max : arr) {
            String text = String.format("%.2f", max);
            if (text.length() > length) {
                length = (int) max;
            }
        }
        return length;
    }

}
