package sandro.week07;

import lukas.week03.day4.Colors;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileTabWrite {
    public static void main(String[] args) {
        File file = new File("assets/temp/output.txt");

        String headerFirstName = "FirstName";
        String headerLastName = "LastName";
        String headerAge = "Age";
        String headerPlace = "Place";
        String headerDistanceFromCapital = "DistanceFromCapital";

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 225581};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

        int maxlenFirst = tabspaceS(headerFirstName, firstName);
        int maxlenLast = tabspaceS(headerLastName, lastName);
        int maxlenAge = tabspaceINT(headerAge, age);
        int maxlenPlace = tabspaceS(headerPlace, place);
        int maxlenDistance = tabspaceFloat(headerDistanceFromCapital, distanceFromCapital);

        try {
            FileOutputStream fos = new FileOutputStream(file, false);
            PrintStream ps = new PrintStream(fos);
            String formatHeader = String.format("]> %%-%ds <[]> %%-%ds <[]> %%-%ds <[]> %%-%ds <[]> %%-%ds <[\n", maxlenFirst, maxlenLast, maxlenAge, maxlenPlace, maxlenDistance);
            ps.printf(formatHeader, headerFirstName, headerLastName, headerAge, headerPlace, headerDistanceFromCapital);
            /*
            ps.printf("]> %-" + maxlenFirst + "s <[", headerFirstName);
            ps.printf("]> %-" + maxlenLast + "s <[", headerLastName);
            ps.printf("]> %-" + maxlenAge + "s <[", headerAge);
            ps.printf("]> %-" + maxlenPlace + "s <[", headerPlace);
            ps.printf("]> %-" + maxlenDistance + "s <[", headerDistanceFromCapital);
            ps.println();
             */
            ps.printf("]>%s<[", "=".repeat(maxlenFirst + 2));
            ps.printf("]>%s<[", "=".repeat(maxlenLast + 2));
            ps.printf("]>%s<[", "=".repeat(maxlenAge + 2));
            ps.printf("]>%s<[", "=".repeat(maxlenPlace + 2));
            ps.printf("]>%s<[", "=".repeat(maxlenDistance + 2));
            ps.println();
            String formatData = String.format("]> %%-%ds <[]> %%-%ds <[]> %%%dd <[]> %%-%ds <[]> %%%d.2f <[\n", maxlenFirst, maxlenLast, maxlenAge, maxlenPlace, maxlenDistance);
            for (int i = 0; i < firstName.length; i++) {
                ps.printf(formatData, firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
                /*
                ps.printf("]> %-" + maxlenFirst + "s <[", firstName[i]);
                ps.printf("]> %-" + maxlenLast + "s <[", lastName[i]);
                ps.printf("]> %" + maxlenAge + "d <[", age[i]);
                ps.printf("]> %-" + maxlenPlace + "s <[", place[i]);
                ps.printf("]> %" + maxlenDistance + ".2f <[", distanceFromCapital[i]);
                ps.println();
                 */
            }


            ps.close();
            System.out.println("File schreiben war erfolgreich");
        } catch (FileNotFoundException fnfe) {
            System.out.println(file.getAbsolutePath() + " ist nicht erreichbar.");
        }

    }

    public static int tabspaceS(String header, String[] arr) {
        int maxLen = header.length();
        for (String nameFromArr : arr) {
            if (nameFromArr.length() > maxLen) {
                maxLen = nameFromArr.length();
            }
        }
        return maxLen;
    }

    public static int tabspaceINT(String header, int[] arr) {
        int maxLen = header.length();
        for (int nameFromArr : arr) {
            String text = String.format("%d", nameFromArr);
            if (text.length() > maxLen) {
                maxLen = text.length();
            }
        }
        return maxLen;
    }

    public static int tabspaceFloat(String header, float[] arr) {
        int maxLen = header.length();
        for (float nameFromArr : arr) {
            String text = String.format("%.2f", nameFromArr);
            if (text.length() > maxLen) {
                maxLen = text.length();
            }
        }
        return maxLen;
    }

}
