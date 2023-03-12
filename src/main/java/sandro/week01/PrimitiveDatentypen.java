package sandro.week01;

public class PrimitiveDatentypen {
    public static void main(String[] args) {

        //      addieren(0, 20, 50);
        //      faktorial(1, 20);
        //      kommaschritte(0F, 100F, 0.1F);
              teilen(0,20,0);
        //      piLeibniz(4,1,0);
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

    public static void teilen(int start, int end,float summe) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
            summe = i / 5;
            System.out.println(summe);

        }
        System.out.println();
    }

    public static void piLeibniz(double a, double b,double summe){

    }

}


