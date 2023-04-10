package eric.osterFerien;



public class Schleifen {
    public static void main(String[] args) {
        System.out.println("Aufgabe 1");

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("---");

        System.out.println("Aufgabe 2");
        for (int i = -30; i <= 30; i++) {
            if (i % 3 == 0)
                System.out.println(i);
        }

        System.out.println("---");

        System.out.println("Aufgabe 3");
        int count = 0;
        while (count <= 10) {
            System.out.println(count);
            if (count > 5) {
                System.out.println();
                System.out.println();
            }
            count++;
        }
    }
}
