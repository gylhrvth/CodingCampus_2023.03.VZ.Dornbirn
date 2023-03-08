package mariechristine;

public class Loops {
    public static void main(String[] args) {



        //Aufgabe: Zählen
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println("i: " + i);
        }

        int x = 0;
        while (x <= 10) {
            System.out.println("x: " + x);
            x = x + 1;
        }

        //Aufgabe: Zählen 2

        for (int i = 0; i < 10; i = i + 1) {
            System.out.println("i: " + i);
        }

        //Aufgabe: Zählen mit Trick

        int k = 0;
        while (k <= 10) {
            System.out.println("k: " + k);
            k = k + 2;
        }

        //Modulo Operator
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("i: " + i);
            }
        }

            }
        }

