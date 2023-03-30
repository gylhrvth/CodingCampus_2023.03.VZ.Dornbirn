package eric.week04;

public class Tabellarisch {


    public static void main(String[] args) {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar", "Hunde"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma", "Katzen"};
        int[] age = {40, 78, 5, 18, 81, 200};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten", "Bregenz"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f, 10000.3456f};

        int headerFirstName = maxLength("Vorname", firstName);
        int headerLastName = maxLength("Nachname", lastName);
        int headerPlace = maxLength("Wohnort", place);
        int headerAge = maxInt("Alter", age);
        int headerDistanceFromCap = maxFloat("Distanz (in KM)", distanceFromCapital);


        String input = "=";
        System.out.printf("|| %-" + headerFirstName + "s || %-" + headerLastName + "s || %-" + headerAge + "s || %-" + headerPlace + "s || %-" + headerDistanceFromCap + "s || %n", "Vorname", "Nachname", "Alter", "Wohnort", " Distanz (in KM)");
        System.out.println("||" + input.repeat(headerAge + headerAge + headerLastName + headerDistanceFromCap + headerPlace * 3) + "||");

        for (int i = 0; i < firstName.length; i++) {
            System.out.printf("|| %-" + headerFirstName + "s || %-" + headerLastName + "s || %" + headerAge + "s || %-" + headerPlace + "s || %" + headerDistanceFromCap + ".4f || %n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);
        }

        System.out.println("||" + input.repeat(headerAge + headerAge + headerLastName + headerDistanceFromCap + headerPlace * 3) + "||");

    }

    public static int maxLength(String header, String[] arr) {
        int maximalLength = header.length();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maximalLength) {
                maximalLength = arr[i].length();
            }
        }
        return maximalLength;
    }

    public static int maxInt(String header, int[] arr) {
        int maxLength = header.length();
        for (int intArr : arr) {
            String text = String.format("%d", intArr);
            if (text.length() > maxLength) {
                maxLength = text.length();
            }
        }
        return maxLength;
    }

    public static int maxFloat(String header, float[] arr) {
        int maxLength = header.length();
        for (float floatArr : arr) {
            String text = String.format("%f", floatArr);
            if (text.length() > maxLength) {
                maxLength = text.length();
            }
        }
        return maxLength;
    }
}