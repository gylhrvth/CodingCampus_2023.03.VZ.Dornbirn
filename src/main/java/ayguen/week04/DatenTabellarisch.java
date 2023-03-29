package ayguen.week04;

public class DatenTabellarisch {

    public static void main(String[] args) {

        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        int[] age = {40, 78, 5, 18, 81};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        float[] distanceFromCapital = {0f, 654.4f, 12.45f, 120.0f, 119.99999999999f};

        int firstNameMax = maxLen(firstName);
        int lastNameMax = maxLen(lastName);
        int placeMax = maxLen(place);
        int agemax = maxVal(age);

        for (int i = 0; i < firstName.length; i++) {
            System.out.printf("%-" + firstNameMax + "s %-" + lastNameMax + "s %15s %-"+ placeMax+ "s %30.2f\n", firstName[i], lastName[i], age[i], place[i], distanceFromCapital[i]);

        }


    }

    public static int maxLen(String[] alleTexts) {
        int result = 0;
        for (int i = 0; i < alleTexts.length; i++) {
            if (alleTexts[i].length() > result) {
                result = alleTexts[i].length();
            }
        }

        return result;
    }
    public static int maxVal (int [] text){

        int result = 0;
        for (int i = 0; i < text.length ; i++) {
            if (text[i] > result){
                result = text[i];
            }

        }
        return result;

    }

}

