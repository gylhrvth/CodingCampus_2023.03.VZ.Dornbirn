package mert.Week01;

public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i = i + 1) {
            System.out.println("i:" + i);
        }

        int k = 0;
        while (k <= 10) {

            System.out.println("k:" + k);
            k = k + 1;
        }

        for (int i = 0; i <= 10; i = i + 1) {
            if (i % 2 == 0) {
                System.out.println("i:" + i);
            }
            for (int j = 10; j >= -10; j = j - 1) {
                System.out.println("j:" + 1);
            }
        }

    }

        }


