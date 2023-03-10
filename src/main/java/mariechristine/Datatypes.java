package mariechristine;

public class Datatypes {
    public static void main(String[] args) {

        sumUpNewValue(20, 50);
        factorResult(1, 20);

    }

        public static void sumUpNewValue(int startValue, int endValue) {
            int summe = 0;
            for (int i = startValue; i <= endValue; ++i) {
                summe += i;

            }
            System.out.println("Summe von " + startValue + " bis " + endValue + " ist " + summe);

        }

      public static void factorResult(int startValue, int endValue) {
        long factor = 1;
        for (int i = startValue; i <= endValue; ++i) {
            factor *= i;

        }
          System.out.println("Die Faktoren ergeben folgende Ergebnisse " + startValue + " bis " + endValue + factor);
      }


    }
