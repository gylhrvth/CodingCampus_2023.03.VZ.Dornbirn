package gyula.week02;

import java.util.Arrays;

public class BuchLaden {

    public static void main(String[] args) {
        buchladen3();

        int[] einnahmen = {1300, 1400, 1500, 1650};
        System.out.println(einnahmen);
        System.out.println(Arrays.toString(einnahmen));
        for (int i = 0; i < einnahmen.length; i++) {
            System.out.println("einnahmen[" + i + "] = " + einnahmen[i]);
        }
    }

    public static void buchladen3(){
        int[] verkauf = {25, 33, 17, 19, 24, 41, 0, 6 ,45, 33, 12};

        int sum = 0;
        for (int i = 0; i < verkauf.length; i++) {
            sum += verkauf[i];
        }

        System.out.println("Der Buchladen hat an der Woche " +
                sum +
                " Bücher verkauft"
        );
    }

    public static void buchladen2(){
        int[] verkauf = new int[7];
        verkauf[0] = 25;
        verkauf[1] = 33;
        verkauf[2] = 17;
        verkauf[3] = 19;
        verkauf[4] = 24;
        verkauf[5] = 41;
        verkauf[6] = 0;

        int sum = 0;
        for (int i = 0; i < verkauf.length; i++) {
            sum += verkauf[i];
        }

        System.out.println("Der Buchladen hat an der Woche " +
                sum +
                " Bücher verkauft"
        );
    }

    public static void buchladen1() {
        int montag = 25;
        int dienstag = 33;
        int mittwoch = 17;
        int donnerstag = 19;
        int freitag = 24;
        int samstag = 41;
        int sonntag = 0;

        System.out.println("Der Buchladen hat an der Woche " +
        (montag + dienstag + mittwoch + donnerstag + freitag + samstag + sonntag) +
        " Bücher verkauft"
        );
    }
}
