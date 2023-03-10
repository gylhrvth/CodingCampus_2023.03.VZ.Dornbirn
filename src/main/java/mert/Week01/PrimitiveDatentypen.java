package mert.Week01;

public class PrimitiveDatentypen {
    public static void main(String[] args) {
        summe(20, 50);
        faktorial(20);
        zaehlen(100);
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
        System.out.println();
        for (double i = 0; i <= limit2; i += 0.1) {
            System.out.println(i);

        }
    }

}

