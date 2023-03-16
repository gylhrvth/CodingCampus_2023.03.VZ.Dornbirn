package sandro.week01;

public class PrimitiveDatentypen {
    public static void main(String[] args) {

              addieren(0, 20, 50);
              faktorial(1, 20);
              kommaschritte(0F, 100F, 0.1F);
              teilen(0,20,0);
              calculatePi(20000000);
        //      calculatePi2(20000000);
        //      calculatePi3(20000000);
        //      calculatePi4(20000000);
        //      calculatePi5(20000000);
        //      geheimeReihe();
        randomWurzel();

    }

    public static void addieren(int summe, int start, int end) {
        System.out.println("Summe von 20 bis 50 addiert");
        System.out.println("--------------------");


        for (int i = start; i <= end; i++) {
            summe = summe + i;
//            System.out.println("rechenweg " + summe);
        }
//        System.out.println("--------------------");
        System.out.println("Die EndSumme ist: " + summe);
    }

    public static void faktorial(long faktor, int end) {
        System.out.println("Summe von 1 bis 20 Faktorial");
        System.out.println("--------------------");


        for (int i = 1; i <= end; i++) {
            faktor *= i;
            System.out.printf("%2d! = %20d Hello World! %%\n", i, faktor);
        }
        System.out.println("--------------------");
        System.out.printf("%d\n", faktor);
    }

    public static void kommaschritte(float start, float end, float steps) {
        System.out.println("0 bis 100 in 0.1 schritt");
        System.out.println("--------------------");

        for (float i = start; i <= end; i = i + steps) {
            System.out.printf("%5.1f\n", +i);
            //       System.out.printf("%-6.2f\n", +i);
        }
        System.out.println();

    }

    public static void teilen(int start, int end, float summe) {
        for (int i = 0; i <= 20; i++) {
            System.out.println("Zähler" + i);
            summe = i / 5;
            System.out.println("x / 5" + summe);
            summe = i / 5.0f;
            System.out.println("x / 5.0" + summe);

        }
        System.out.println();
    }

    private static void calculatePi(int accuracy) {
        double pi = 0.0;
        boolean addValues = true;

        for (int i = 0; i <= accuracy; i++) {

            double iterationValue = 4.0 / (i * 2 + 1);


            if (addValues) {
                // schöner geht auch: pi += iterationValue;
                pi = pi + iterationValue;
            } else {
                // schöner geht auch: pi -= iterationValue;
                pi = pi - iterationValue;
            }

            addValues = !addValues;
        }
        System.out.println(pi);
    }

    private static void calculatePi2(int accuracy) {
        double pi = 0.0;
        boolean addValues = true;
        int b = 1;
        for (int i = 0; i <= accuracy; i++) {
            double iterationValue = 4.0 / b;
            if (addValues) {
                pi = pi + iterationValue;
            } else {
                pi = pi - iterationValue;
            }
            addValues = !addValues;
            // if (i == 0) {
            //      b = 3;
            //  } else {
            b = b + 2;
            // }
        }
        System.out.println(pi);
    }

    private static void calculatePi3(int accuracy) {
        //gyula version, very short
        double pi = 3.0;
        for (long i = 0; i <= accuracy; i++) {
            pi += (1 - 2 * (i % 2)) * 4.0 / (2 * (i + 1) * (2 * (i + 1) + 1) * (2 * (i + 1) + 2));
        }
        System.out.println(pi);
    }

    private static void calculatePi4(int accuracy) {
        double pi = 3.0;
        for (long i = 0; i <= accuracy; i++) {

            double iterationValue = 4.0 / (2 * (i + 1) * (2 * (i + 1) + 1) * (2 * (i + 1) + 2));

            if (i % 2 == 0) {
                pi += iterationValue;
            } else {
                pi -= iterationValue;
            }
        }
        System.out.println(pi);
    }

    private static void calculatePi5(int accuracy) {
        double pi = 3.0;
        boolean addValues = true;
        long a = 2;
        long b = 3;
        long c = 4;
        for (int i = 0; i <= accuracy; i++) {

            double iterationValue = 4.0 / (a * b * c);

            if (addValues) {
                pi = pi + iterationValue;
            } else {
                pi = pi - iterationValue;
            }
            addValues = !addValues;

            a = a + 2;
            b = b + 2;
            c = c + 2;

        }
        System.out.println(pi);
    }

    private static void geheimeReihe(){
        double wert = 1.0;
        for (int i = 0; i < 100; i++) {
            wert = wert/2.0 + (1.0/wert);
            System.out.println(wert);
        }
        System.out.println();
    }

    private static void randomWurzel(){
        double random = new
        java.util.Random().nextInt(10000) + 1;
        System.out.println("random zahl ist:" +random);


    }

}


