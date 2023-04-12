package benjamin.week04;

public class Tabelle {
    public static void main(String[] args) {

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

        System.out.printf("|%-" + first + "s", headfirstNamen);
        System.out.printf("|%-" + last + "s", headLastNamen);
        System.out.printf("|%" + age1 + "s", headAge);
        System.out.printf("|%-" + place1 + "s", headPlace);
        System.out.printf("|%" + dist + "s|", headDistance);
        System.out.println();
        System.out.printf("|%s","-".repeat(first));
        System.out.printf("|%s","-".repeat(last));
        System.out.printf("|%s","-".repeat(age1));
        System.out.printf("|%s","-".repeat(place1));
        System.out.printf("|%s","-".repeat(dist) + "|");
        System.out.println();

        for (int i = 0; i < firstName.length; i++) {
            System.out.printf("|%-" + first + "s", firstName[i]);
            System.out.printf("|%-" + last + "s", lastName[i]);
            System.out.printf("|%" + age1 + "d", age[i]);
            System.out.printf("|%-" + place1 + "s", place[i]);
            System.out.printf("|%" + dist + ".2f|", distanceFromCapital[i]);
            System.out.println();
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
    public static int formatAge(String head, int[] arr){
        int length = head.length();
        for (int max: arr) {
            String text = String.format("%d",max);
            if(text.length() > length){
                length = max;
            }
        }
        return length;
    }

    public static int formatDistance(String head, float[] arr){
        int length = head.length();
        for (float max: arr) {
            String text = String.format("%.2f", max);
            if(text.length() > length){
                length = (int) max;
            }
        }
        return length;
    }
}
