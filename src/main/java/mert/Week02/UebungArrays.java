package mert.Week02;

import gyula.week02.ConsoleInputNumber;

import java.util.Arrays;
import java.util.Scanner;

public class UebungArrays {
    public static void main(String[] args) {
        int size = ConsoleInputNumber.readNumber_v5("Wie viele Elemente sollen erstellt werden?", 1, 1000);

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        int[] array2 = new int[size];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array2.length - i;
        }



        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        /*
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
         */

    }


}






