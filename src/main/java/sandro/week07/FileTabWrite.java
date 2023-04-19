package sandro.week07;

public class FileTabWrite {
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
