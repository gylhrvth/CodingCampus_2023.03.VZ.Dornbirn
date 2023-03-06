package eric.Week01;

public class AufgabeZaehlen {
    public static void main(String[] args) {
        System.out.println("Aufgabe 1:");           //Aufgabe 1 for und while Schleife

        /*for (int i = 0; i < 11; i = i + 1) {         //for Schleife
            System.out.println(i);
        }

         */
        System.out.println();

        int k = 0;                                  //while Schleife
        while (k < 11) {
            System.out.println(k);
            k = k + 1;
        }

        System.out.println();

        System.out.println("Aufgabe 2:");          //Aufgabe 2 Zählervariable
        for (int l = 0; l < 10; l = l + 1) {
            System.out.println("zähler: " + l);
        }

        System.out.println();

        System.out.println("Aufgabe 3");            //Aufgabe 3 Zählen mit Trick
        for (int p = 0; p <= 10; p = p + 1) {
            if (p % 2 == 0) {
                System.out.println(p);
            }
        }

        System.out.println();

        for (int o = 0; o < 11; o = o + 2) {
            System.out.println(o);
        }

        System.out.println();

        System.out.println("Aufgabe 4");            //Rewind
        for (int i = 10; i > -11; i = i - 1){
            System.out.println(i);
        }



    }
}
