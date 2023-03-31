package lukas.week04.day5;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        String test = "Hallo was geht ab?";

        System.out.println(">>>" + test.substring(6) + "<<<");
        System.out.println(">>>" + test.substring(6, 9) + "<<<");

        String test1 = "Hallo was geht ab?";
        String test2 = "was";
        String test3 = "Was";

        //Ist test2 in test1 enthalten?
        System.out.println(test1.contains(test2));

        //Ist test2 in test1 enthalten?
        System.out.println(test1.contains(test3));

        //Ist ein String gleich einem anderen?
        //Ist test2 gleich test3
        System.out.println(test2.equals(test3));

        //A und b verweisen durch Compileroptimierung auf das SELBE Hallo
        String a = "Hallo";
        String b = "Hallo";
        System.out.println(a.equals(b));
        System.out.println(a == b);

        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();

        System.out.println(a+" <-> "+c);
        System.out.println("equals: " + a.equals(c));
        System.out.println("==: " + (a == c));
    }

    public static String crop(String text) {
        if(text.length() < 2) {
            return "";
        }
        return text.substring(1, text.length() - 1);
    }
}
