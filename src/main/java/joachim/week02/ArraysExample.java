package joachim.week02;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        exel();
    }

    public static void exel() {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int[] safes = new int[width];

        for (int i = 0; i < safes.length; i++) {
            safes[i] = 1 + i;
        }

        int[] safes2 = new int[width];
        for (int i = 0; i < safes2.length; i++) {
            safes2[i] = safes2.length - i;
        }

        System.out.println(Arrays.toString(safes));
        System.out.println(Arrays.toString(safes2));

    }
}
