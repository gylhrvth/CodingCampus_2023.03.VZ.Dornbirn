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

        System.out.println("Teilen und Herrschen");




    }



}
