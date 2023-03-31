package mert.Week04;

import java.util.Arrays;

public class SubString {
    public static void main(String[] args) {

        String a = "Hallo wie gehts dir? Ich bin ein Zugfahrer";
        String b = "Mir gehts gut. Zugfahren ist schön";

        String[] arr1 = a.split(" ");
        String[] arr2 = b.split(" ");

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println(arr1.equals(arr2));


    }
}
