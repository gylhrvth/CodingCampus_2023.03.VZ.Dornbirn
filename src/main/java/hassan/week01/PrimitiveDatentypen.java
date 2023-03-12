package hassan.week01;

public class PrimitiveDatentypen {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("Aufgabe: Summe");
        int sum = 0;
        for (int i = 20; i <= 50; i++) {
            sum += i;
        }
        System.out.print("summe: " + sum);
        System.out.println();
        System.out.println();

        System.out.println("Aufgabe: Faktorial");
        long factorial = 1;
        for (long i = 1; i <=20 ; i++) {
            factorial *= i;
            System.out.printf("%2d! = %20d\n ", i, factorial);
        }
        System.out.println();
        System.out.println("-------");
        System.out.println("Von 0 - 100");
        float schritte = 0.1f;
        for (float i = 0; i < 100; i += schritte) {
            System.out.printf("Value: %6.2f\n", i);
        }
        System.out.println();
        System.out.println();
        System.out.println("Aufgabe Zahlen und aufteilen");
            for (int x = 0; x <= 20; x++) {
                System.out.println("x = " + x);
                System.out.println("x / 5 = " + (x / 5));
                System.out.println("x / 5.0 = " + (x / 5.0));
                System.out.println();
            }



    }
}



