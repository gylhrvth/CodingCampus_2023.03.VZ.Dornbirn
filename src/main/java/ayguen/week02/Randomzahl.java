package ayguen.week02;

import gyula.week02.ConsoleInputNumber;

import java.util.Arrays;
import java.util.Random;

public class Randomzahl {
    static Random rand = new Random();

    public static void main(String[] args) {


        int size = ConsoleInputNumber.readNumber_v5("Wie oft?", 1, 1000);
        int[] array1 = new int[size];

        for (int i = 0; i < array1.length; i++) {
            int zufallsZahl = rand.nextInt(100);
            array1[i] = zufallsZahl;



        }System.out.println(Arrays.toString(array1));
    }
}
