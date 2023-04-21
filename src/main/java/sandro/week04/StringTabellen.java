package sandro.week04;

import lukas.week03.day4.Colors;

import java.util.Random;

public class StringTabellen {
    public static Random rand = new Random();

    public static void main(String[] args) {

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

        while (true) {
            int Farbe1 = rand.nextInt(8);
            int Farbe2 = rand.nextInt(8);
            int Farbe3 = rand.nextInt(8);
            int Farbe4 = rand.nextInt(8);
            int Farbe5 = rand.nextInt(8);
            int Farbe6 = rand.nextInt(8);


            int maxLen = tabspaceS(headerFirstName, firstName);
            int maxLen2 = tabspaceS(headerLastName, lastName);
            int maxLen3 = tabspaceINT(headerAge, age);
            int maxLen4 = tabspaceS(headerPlace, place);
            int maxLen5 = tabspaceFloat(headerDistanceFromCapital, distanceFromCapital);


            System.out.printf(Colors.COLORS[Farbe1] + "]>" + Colors.RESET + Colors.COLORS[Farbe2] + " %-" + maxLen + "s " + Colors.RESET + Colors.COLORS[Farbe1] + "<[" + Colors.RESET, headerFirstName);
            System.out.printf(Colors.COLORS[Farbe1] + "]>" + Colors.RESET + Colors.COLORS[Farbe3] + " %-" + maxLen2 + "s " + Colors.RESET + Colors.COLORS[Farbe1] + "<[" + Colors.RESET, headerLastName);
            System.out.printf(Colors.COLORS[Farbe1] + "]>" + Colors.RESET + Colors.COLORS[Farbe4] + " %-" + maxLen3 + "s " + Colors.RESET + Colors.COLORS[Farbe1] + "<[" + Colors.RESET, headerAge);
            System.out.printf(Colors.COLORS[Farbe1] + "]>" + Colors.RESET + Colors.COLORS[Farbe5] + " %-" + maxLen4 + "s " + Colors.RESET + Colors.COLORS[Farbe1] + "<[" + Colors.RESET, headerPlace);
            System.out.printf(Colors.COLORS[Farbe1] + "]>" + Colors.RESET + Colors.COLORS[Farbe6] + " %-" + maxLen5 + "s " + Colors.RESET + Colors.COLORS[Farbe1] + "<[" + Colors.RESET, headerDistanceFromCapital);
            System.out.println();
            System.out.printf(Colors.COLORS[Farbe1] + "]>" + Colors.COLORS[Farbe2] + "%s" + Colors.COLORS[Farbe1] + "<[", "=".repeat(maxLen + 2));
            System.out.printf(Colors.COLORS[Farbe1] + "]>" + Colors.COLORS[Farbe3] + "%s" + Colors.COLORS[Farbe1] + "<[", "=".repeat(maxLen2 + 2));
            System.out.printf(Colors.COLORS[Farbe1] + "]>" + Colors.COLORS[Farbe4] + "%s" + Colors.COLORS[Farbe1] + "<[", "=".repeat(maxLen3 + 2));
            System.out.printf(Colors.COLORS[Farbe1] + "]>" + Colors.COLORS[Farbe5] + "%s" + Colors.COLORS[Farbe1] + "<[", "=".repeat(maxLen4 + 2));
            System.out.printf(Colors.COLORS[Farbe1] + "]>" + Colors.COLORS[Farbe6] + "%s" + Colors.COLORS[Farbe1] + "<[", "=".repeat(maxLen5 + 2));
            System.out.println(Colors.RESET);

//        System.out.printf(Colors.COLORS[6] +"]>%s"+Colors.COLORS[6]+"<[", Colors.COLORS[1] + "=".repeat(maxLen + 2) + Colors.RESET);
//        System.out.printf(Colors.COLORS[6] +"]>%s"+Colors.COLORS[6]+"<[", Colors.COLORS[2] + "=".repeat(maxLen2 + 2) + Colors.RESET);
//        System.out.printf(Colors.COLORS[6] +"]>%s"+Colors.COLORS[6]+"<[", Colors.COLORS[3] + "=".repeat(maxLen3 + 2) + Colors.RESET);
//        System.out.printf(Colors.COLORS[6] +"]>%s"+Colors.COLORS[6]+"<[", Colors.COLORS[4] + "=".repeat(maxLen4 + 2) + Colors.RESET);
//        System.out.printf(Colors.COLORS[6] +"]>%s"+Colors.COLORS[6]+"<[", Colors.COLORS[5] + "=".repeat(maxLen5 + 2) + Colors.RESET);
//        System.out.println();


            for (int i = 0; i < firstName.length; i++) {
                System.out.printf(Colors.COLORS[Farbe1] + "]>" + Colors.RESET + Colors.COLORS[Farbe2] + " %-" + maxLen + "s " + Colors.RESET + Colors.COLORS[Farbe1] + "<[" + Colors.RESET, firstName[i]);

                System.out.printf(Colors.COLORS[Farbe1] + "]>" + Colors.RESET + Colors.COLORS[Farbe3] + " %-" + maxLen2 + "s " + Colors.RESET + Colors.COLORS[Farbe1] + "<[" + Colors.RESET, lastName[i]);

                System.out.printf(Colors.COLORS[Farbe1] + "]>" + Colors.RESET + Colors.COLORS[Farbe4] + " %" + maxLen3 + "d " + Colors.RESET + Colors.COLORS[Farbe1] + "<[" + Colors.RESET, age[i]);

                System.out.printf(Colors.COLORS[Farbe1] + "]>" + Colors.RESET + Colors.COLORS[Farbe5] + " %-" + maxLen4 + "s " + Colors.RESET + Colors.COLORS[Farbe1] + "<[" + Colors.RESET, place[i]);

                System.out.printf(Colors.COLORS[Farbe1] + "]>" + Colors.RESET + Colors.COLORS[Farbe6] + " %" + maxLen5 + ".2f " + Colors.RESET + Colors.COLORS[Farbe1] + "<[" + Colors.RESET, distanceFromCapital[i]);


                System.out.println();
            }
            System.out.printf(Colors.COLORS[Farbe1] + "]>" + Colors.COLORS[Farbe2] + "%s" + Colors.COLORS[Farbe1] + "<[", "=".repeat(maxLen + 2));
            System.out.printf(Colors.COLORS[Farbe1] + "]>" + Colors.COLORS[Farbe3] + "%s" + Colors.COLORS[Farbe1] + "<[", "=".repeat(maxLen2 + 2));
            System.out.printf(Colors.COLORS[Farbe1] + "]>" + Colors.COLORS[Farbe4] + "%s" + Colors.COLORS[Farbe1] + "<[", "=".repeat(maxLen3 + 2));
            System.out.printf(Colors.COLORS[Farbe1] + "]>" + Colors.COLORS[Farbe5] + "%s" + Colors.COLORS[Farbe1] + "<[", "=".repeat(maxLen4 + 2));
            System.out.printf(Colors.COLORS[Farbe1] + "]>" + Colors.COLORS[Farbe6] + "%s" + Colors.COLORS[Farbe1] + "<[", "=".repeat(maxLen5 + 2));
            System.out.println(Colors.RESET);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //noop
            }


        }
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

    public static int tabspaceS(String header, String[] arr) {
        int maxLen = header.length();
        for (String nameFromArr : arr) {
            if (nameFromArr.length() > maxLen) {
                maxLen = nameFromArr.length();
            }
        }
        return maxLen;
    }

}