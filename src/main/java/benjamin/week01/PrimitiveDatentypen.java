package benjamin.week01;

public class PrimitiveDatentypen {

    public static void main(String[] args) {

        System.out.println("Aufgabe Summe");

        int summe = 0;

        for (int i = 20; i <= 50; i++) {
            summe = summe + i;
        }
        System.out.println("Summe ist: " + summe);

        System.out.println();

        System.out.println("Faktorial");

        long faktorial = 1;
        for (long i = 1; i <= 20; i++) {
            faktorial *= i;
            System.out.printf("%2d = %20d\n", i, faktorial);

        }

        System.out.println();

        System.out.println("Count 1 - 100");

        float steps1 = 0.1f;
        for (float i = 0; i < 100; i += steps1) {
            System.out.printf("Summe: %6.2f\n", i);

        }
        System.out.println();

        System.out.println("Teilen und Herrschen");


        for (int i = 0; i <= 20; i++) {

            System.out.print("x = " + i);
            System.out.println();
            System.out.print("x/5 = " + i / 5);
            System.out.println();
            System.out.print("x/5.0 = " + i / 5.0f);
            System.out.println();
            System.out.println();
        }

        System.out.println("Pi Leibniz Reihe");

        double pi = 0;
        int zeichen = 1;
        for (int i = 1; i <= 100000; i += 2) {
            pi += zeichen * 4.0 / i;
            zeichen *= -1;

        }
        System.out.println("Pi = " + pi);


        System.out.println("Pi Nilakantha Reihe");

        double pi1 = 3;
        int zeichen1 = 1;
        long a = 2;
        long b = 3;
        long c = 4;
        for (int i = 1; i <= 2000000; i ++) {
            pi1 += zeichen1 * 4.0 / (a * b * c);
            zeichen1 *= -1;
            a += 2;
            b += 2;
            c += 2;
        }
        System.out.println("Pi = " + pi1);


    }


}




