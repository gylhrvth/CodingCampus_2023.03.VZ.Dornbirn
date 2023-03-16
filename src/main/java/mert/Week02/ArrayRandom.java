package mert.Week02;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandom {
    static Random rand = new Random();

    public static void main(String[] args) {

        int size = 10;
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            int zufallszahl = rand.nextInt(101);
            array[i] = zufallszahl;

        }
        System.out.println(Arrays.toString(array));

        for (int name : array ) {
            int zufallszahl = rand.nextInt(101);
            System.out.print(name + ", ");
        }
    }
}