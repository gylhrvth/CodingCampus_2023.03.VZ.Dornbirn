package mariechristine.Week1;

public class Datatypes {
    public static void main(String[] args) {

        sumUpNewValue(20, 50);
        factorResult(10);
        factorResult2(10);
        stepsToHundred(10);
        fractionTask(20);
        leibnitz();
    }

    public static void sumUpNewValue(int startValue, int endValue) {
        System.out.println("Summe:");
        int summe = 0;
        for (int i = startValue; i <= endValue; ++i) {
            summe += i; //andere Schreibweise: summe = summe + i
        }
        System.out.println("Die Summe von " + startValue + " bis " + endValue + " ist " + summe);
        System.out.println();

    }

    public static void factorResult(int endValue) {
        System.out.println("Multiplikation:"); //Die Schreibweise '!10' wird '10 Fakultät' ausgesprochen
        long factor = 1;                        //!10 ist das Produkt aller ganzen Zahlen von 1-10, sprich 1*2*3*4 usw.
        for (long i = 1; i <= endValue; ++i) {
            factor *= i;

        }
        System.out.println("Die Faktoren ergeben folgendes Ergebnis " + factor);
        System.out.println();

    }

    public static void factorResult2(int endValue) {
        System.out.println("Multiplikation übersichtlich dargestellt:");
        long factor = 1;
        for (int i = 1; i <= endValue; ++i) {
            factor *= i;

            System.out.printf("%2d! = %20d", i, factor);
            System.out.println();
        }
        System.out.println();

    }

    public static void stepsToHundred(int endValue) {
        System.out.println("In 0.1er Schritten gezählt:");
        double step = 0.1;
        for (int i = 0; step <= endValue; ++i) {
            step += 0.1;

            System.out.printf("%5.2f", step);
            System.out.println();
        }
        System.out.println();
    }

    public static void fractionTask(int endValue) {
        System.out.println("Teilen und Herrschen:");
        for (int i = 0; i <= endValue; ++i) {
            System.out.println(i + ": " + (i / 5) + ", mit Dezimal: " + (i / 5.0));
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
