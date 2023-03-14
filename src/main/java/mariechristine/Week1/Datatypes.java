package mariechristine.Week1;

public class Datatypes {
    public static void main(String[] args) {

//        sumUpNewValue(20, 50);
//        factorResult(20);
//        factorResult2(20);
//        stepsToHundred(100);
//        fractionTask(20);
//        leibnitz();
    }

    public static void sumUpNewValue(int startValue, int endValue) {
        int summe = 0;
        for (int i = startValue; i <= endValue; ++i) {
            summe += i;

        }
        System.out.println("Summe von " + startValue + " bis " + endValue + " ist " + summe);

    }

    public static void factorResult(int endValue) {
        long factor = 1;
        for (long i = 1; i <= endValue; ++i) {
            factor *= i;

        }
        System.out.println("Die Faktoren ergeben folgendes Ergebnis " + factor);
        System.out.println();

    }


    public static void factorResult2(int endValue) {
        long factor = 1;
        for (int i = 1; i <= endValue; ++i) {
            factor *= i;

            System.out.printf("%2d! = %20d", i, factor);
            System.out.println();
        }

    }

    public static void stepsToHundred(int endValue) {
        double step = 0.1;
        for (int i = 0; step <= endValue; ++i) {
            step += 0.1;

            System.out.printf("%5.2f", step);
            System.out.println();
        }
    }

    public static void fractionTask(int numerator) {
        for (int i = 0; i <= numerator; ++i) {
            System.out.println(i + " " + (i / 5) + " " + (i / 5.0));
        }


    }

    public static void leibnitz(){
        double pi = 0;
        boolean positiv = true;
        for (int i = 1; i < 20000; i += 2) {
            double part = 4.0 / i;
            if (positiv) {
                pi += part;
            } else {
                pi -= part;
            }
            positiv = !positiv;
            System.out.println(pi);
        }
    }

}
