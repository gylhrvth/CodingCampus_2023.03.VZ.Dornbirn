package gyula.week04;

import java.text.Collator;
import java.util.Locale;

public class StringExample {
    public static void main(String[] args) {
        String leer = "";
        String s = "Hello World!";
        String lotOfSpaces = "             Apfel        ";

        System.out.println(s);
        System.out.printf("]%s[\n", s);
        System.out.printf("]%20s[\n", s);
        System.out.printf("]%-20s[\n", s);

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println(s.indexOf("World"));
        System.out.println(s.indexOf("Something"));

        System.out.println(s.substring(3, 7));
        System.out.println(s.repeat(5));
        System.out.println(s.concat(" Apfelsaftladen. :-)"));


        System.out.printf("]%s[\n", lotOfSpaces);
        System.out.printf("]%s[\n", lotOfSpaces.trim());

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(s.equals("Apfel"));
        System.out.println(s.contains("llo"));

        System.out.println(s.compareTo("Hello World!"));
        System.out.println(s.compareTo("World!"));
        System.out.println(s.compareTo("Apfel"));
        System.out.println(s.compareTo("Äpfel"));

        // Bonus
        Collator deCollator = Collator.getInstance(Locale.GERMAN);
        System.out.println(deCollator.compare(s, "Hello World!"));
        System.out.println(deCollator.compare(s, "World!"));
        System.out.println(deCollator.compare(s, "Apfel"));
        System.out.println(deCollator.compare(s, "Äpfel"));

    }
}
