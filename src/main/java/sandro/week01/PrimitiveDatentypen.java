package sandro.week01;

public class PrimitiveDatentypen {
    public static void main(String[] args) {

            System.out.println("Summe von 20 bis 50 addiert");
            System.out.println("--------------------");

            int summe = 0;
            int start = 20;
            int end = 50;

            for (int i = start; i <= end; i++) {
                summe = summe + i;
//            System.out.println("rechenweg " + summe);
            }
//        System.out.println("--------------------");
            System.out.println("Die EndSumme ist: " + summe);


            System.out.println("Summe von 1 bis 20 Faktorial");
            System.out.println("--------------------");

            long faktor = 1;
//        int start1 = 1;
            int end1 = 20;

            for (int i = 1; i <= end1; i++) {
                faktor *= i;
                System.out.printf("%2d! = %20d Hello World! %%\n", i, faktor);
            }
            System.out.println("--------------------");
            System.out.printf("%d\n", faktor);


        System.out.println("0 bis 100 in 0.1 schritt");
        System.out.println("--------------------");

            
        }
        
}
