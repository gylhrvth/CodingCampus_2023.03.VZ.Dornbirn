package joachim.week04;

public class Tabelle {
    public static void main(String[] args) {
        String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar", "Lukas Joseph Hermann"};
        String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma", "Kneissel"};
        int[] age = {40, 78, 5, 18, 81, 32};
        String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten", "Frankfurt"};
        float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f, 637.000f};


        System.out.printf("[%-" + namelength(firstName,lastName)  +"s]|[%-12s]|[%-" + city(place) + "s]|[%" +numbers(distanceFromCapital) + "s   ]\n", "Name", "Age in Years", "Lives at", "Distance to Capital");
        System.out.println();
        for (int i = 0; i < firstName.length; i++) {
           System.out.printf("[%-" + namelength(firstName,lastName)  + "s]|", firstName[i] + " " + lastName[i]);
            System.out.printf("[%6d Years]|", age[i]);
            System.out.printf("[%-" + city(place) + "s]|", place[i]);
            System.out.printf("[%" + numbers(distanceFromCapital) +".2f km]", distanceFromCapital[i]);
            System.out.println();

        }
    }

    public static int namelength(String[] first, String[] last) {
        int max = 0;
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i].length() > max1) {
                max1 = first[i].length();
            }

        }
        for (int i = 0; i < last.length; i++) {
            if (last[i].length() > max2) {
                max2 = last[i].length();

            }
        }
        max = max1 + max2;
        return max;
    }
    public static int city(String[] land){
        int max = 0;
        for (int i = 0; i < land.length; i++) {
            if(land[i].length() > max){
                max = land[i].length();
            }

        }
        return max;
    }
    public static int numbers(float[] num){
        int max = 19;
        for (int i = 0; i < num.length; i++) {
            if(num.length > max){
                max = (int) num[i];
            }
        }
        return max;
    }
}