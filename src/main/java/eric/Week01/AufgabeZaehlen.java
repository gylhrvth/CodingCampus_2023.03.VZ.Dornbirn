package eric.Week01;

public class AufgabeZaehlen {
    public static void main(String[] args) {
        int maxValue = meinMax(10, -5);

        aufgabe1(0, maxValue);
        aufgabe2(0, maxValue);
        aufgabe3(0, maxValue);
        aufgabe4(maxValue, -10);

    }

        public static int meinMax(int a,int b) {
            int result = b;
            if (a > b) {
                result = a;
            }
            return result;
        }
        public static void aufgabe1 ( int start, int end) {
            System.out.println("Aufgabe 1:");           //Aufgabe 1 for und while Schleife

            for (int i = start; i <= end; i = i + 1) {         //for Schleife
                System.out.println(i);
            }

            int k = start;                                  //while Schleife
            while (k <= end) {
                System.out.println(k);
                k = k + 1;
            }
        }
        public static void aufgabe2 ( int start, int end){
            System.out.println("Aufgabe 2:");          //Aufgabe 2 Zählervariable
            for (int l = start; l <= end; l = l + 1) {
                System.out.println("zähler: " + l);
            }
        }
        public static void aufgabe3 ( int start, int end){
            System.out.println("Aufgabe 3");            //Aufgabe 3 Zählen mit Trick
            for (int p = start; p <= end; p = p + 1) {
                if (p % 2 == 0) {
                    System.out.println(p);
                }
            }
            for (int o = start; o <= end; o = o + 2) {
                System.out.println(o);
            }
        }
        public static void aufgabe4 ( int start, int end){
            System.out.println("Aufgabe 4");            //Rewind
            for (int m = start; m >= end; m = m - 1) {
                System.out.println(m);
            }
    }
}
