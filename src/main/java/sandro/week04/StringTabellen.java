package sandro.week04;

public class StringTabellen {
    public static void main(String[] args) {



        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
        tabSpace(firstName);
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
        tabSpace(lastName);
        int[] age = {40, 78, 5, 18, 81};

        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
        tabSpace(place);
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};


    
    }

    public static void printTab() {

    }

    public static void tabSpace(String[] arr) {
        int maxLen = 0;
        for (String nameFromArr: arr) {
            if (nameFromArr.length() > maxLen){
                maxLen = nameFromArr.length();
            }
        }

        for (String nameFromArr: arr) {
            System.out.printf(
                    "] %s%s%s [\n",
                    " ".repeat((maxLen - nameFromArr.length()) / 2),
                    nameFromArr,
                    " ".repeat(maxLen - ((maxLen - nameFromArr.length()) / 2) - nameFromArr.length()));
        }
        System.out.print("");
    }

}
