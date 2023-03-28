package joachim.week01;

public class Schleifen {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println("i: " + i);
        }
        System.out.println();
        int k = 0;
        while (k <= 10) {

            System.out.println("k: " + k);
            k += 1;
        }
        System.out.println();
        for (int i = 0; i <= 10; i += 1) {
            if (i % 2 < 1) {
                System.out.println(i);
            }
        }
        System.out.println();
        for (int j = 10; j >= -10; j = j - 1) {
            System.out.println("j: " + j);
        }


    }
}
