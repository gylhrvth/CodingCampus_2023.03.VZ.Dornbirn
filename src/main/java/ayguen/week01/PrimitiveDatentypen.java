package ayguen.week01;

public class PrimitiveDatentypen {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 20; i <= 50; i++) {
            sum += i;

        }
        System.out.println("summe von 20 bis 50 =" + sum);
        System.out.println();

        long faktorial = 1;
        for (long j = 1; j < 20; j++) {
            faktorial *= j;
            System.out.println("Faktorial =" + faktorial);

        }
        System.out.println();

        long faktorial1 = 1;
        for (long j = 1; j <= 20; j++) {
            faktorial1 *= j;
            System.out.printf("%2d! = %20d\n", j, faktorial1);


        }
        System.out.println();
        float float1 = 0.0f ;
        for (float i = 0.0f; i <= 100.0f ; i+= 0.1f) {
            System.out.println(i);

        }
        System.out.println();
    }
}

