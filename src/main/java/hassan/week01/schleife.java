package hassan.week01;

public class schleife {

    public static void main(String[] args) {
        System.out.println("AUFGABE 1");
        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println("i: " + i);
        }
        System.out.println("AUFGABE 2");

        int h = 0;
        while (h <= 10){
            System.out.println("h: " + h);

            h = h + 1;
        }
        System.out.println("Exlusive 10");
        for (int a = 0; a < 10; a = a + 1) {
            System.out.println("a: " + a);
        }
        System.out.println();
        System.out.println("Zählen mit Tricks");
        for (int A=0; A<=10; A = A +1) {
            if ( A % 2 == 0)
                System.out.println(A);
        }
        System.out.println();
        System.out.println("Rückwärts");
        for (int Z=10; Z >= -10; Z = Z - 1) {
            System.out.println(Z);


        }


    }

}
