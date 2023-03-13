package eric.Week01;

import org.w3c.dom.ls.LSOutput;

public class PrimitiveDatentypen {
    public static void main(String[] args) {


    /*    System.out.println("Aufgabe Summe");
        int num = 0;
        for (int i = 20; i <= 50; i++) {
            num += i;
            System.out.print(" " + num);
        }
        System.out.println();

        System.out.println("---");

        System.out.println();

        System.out.println("Aufgabe Faktorial");
        for (int i = 1; i <= 20; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println(factorial);
        }

        System.out.println();

        System.out.println("---");

        System.out.println();

        System.out.println("Aufgabe Faktorial (erweiter)");
        long factorial = 1;
        for (long i = 1; i <= 20; i++) {
            factorial *= i;
            System.out.printf("%3d = %20d\n", i, factorial);
        }

        System.out.println();

        System.out.println("---");

        System.out.println();


        System.out.println("Aufgabe von 0 - 100 in 0.1 Schritten");

        for (float i = 0.1f; i <= 100; i += 0.1) {
            System.out.printf("%6.2f\n", i);
        }

        System.out.println();

        System.out.println("---");

        System.out.println();


        System.out.println("Aufgabe von 0 - 100 in 0.1 Schritten");
        for (int i = 0; i < 1000; i++) {
            System.out.printf(i / 10.0);
        }

        System.out.println();

        System.out.println("---");

        System.out.println();


        System.out.println("Teilen und Herrschen");
        for (int x = 1; x <= 20; x++) {
            System.out.println("x: " + x);
            System.out.println("x / 5: " + x / 5);
            System.out.println("x / 5.0: " + x / 5.0);
            System.out.println();
        }


        System.out.println("Berechung von Pi");
        double pi = 0;
        int zahl = 1;
        for (int i = 1; i <= 100000; i += 2) {
            pi += zahl  * 4.0 / i;
            zahl *= -1;
        }
        System.out.println("Pi: " + pi);


        System.out.println("Pi Nilakantha Reihe");
        double pi = 3;
        int zahl = 1;
        long a = 2;
        long b = 3;
        long c = 4;
        for (int i = 1; i <= 10000; i++) {
            pi += zahl * 4.0 / (a*b*c);
            zahl *= -1;
            a += 2;
            b += 2;
            c += 2;
        }
        System.out.println("Pi: " + pi);

        System.out.println("Geheime Reihe");
        double wert = 1.0;
        for (int i = 0; i <= 1.0; i++) {
            wert = wert / 2 + 1 / wert;
        }
        System.out.println(wert);
    */
        System.out.println("Wurzelnäherung");
        double random = new java.util.Random().nextInt(10000) + 1;
        random /= 2;
        System.out.println(random);
        random /= 4;
    }
}
