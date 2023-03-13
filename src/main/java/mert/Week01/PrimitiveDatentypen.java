package mert.Week01;

public class PrimitiveDatentypen {
    public static void main(String[] args) {
//        summe(20, 50);
//        faktorial(20);
        zaehlen(10);
        teilen(20);

    }

    public static void summe(int start, int end) {
        int sum = 0;
        for (int i = 20; i <= 50; i++) {
            sum += i;
        }
        System.out.println("Summe= " + sum);
        System.out.println();

    }

    public static void faktorial(int limit) {
        System.out.println(limit + "! Faktorialrechnung");
        long Faktorial = 1;
        for (long i = 1; i <= limit; i++) {
            Faktorial *= i;

            System.out.println("Faktorial= " + Faktorial);

        }
        long Faktorial1 = 1;
        for (long j = 1; j <= limit; j++) {
            Faktorial1 *= j;
            System.out.println();
            System.out.printf("%20d", +Faktorial1);

        }
    }

    public static void zaehlen(int limit2) {
        for (float f = 0; f <= limit2; f += 0.1) {
            System.out.println(f);
        }
        for (int i = 0; i <= 10 * limit2; i++) {
            System.out.println(i / 10.0);
        }


        System.out.println();
        for (double i = 0; i <= limit2; i += 0.1) {
            System.out.printf("%5.1f\n", i);

        }
    }

    public static void teilen(int int1) {
        System.out.println();
        for (int i = 0; i <= int1; i++) {
            System.out.println(i);
            System.out.println(i / 5);
            System.out.println(i / 5.0);
            System.out.println();
        }


    }
}
    
        



