package benjamin.week04;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        System.out.println("Willkommen zum Reverseprogramm!!!111");
        System.out.print(">>>> ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char[] arr = text.toCharArray();

        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length -1 - i];
            arr[arr.length -1 - i] = temp;
        }

        String reverse = new String(arr);
        System.out.println(reverse);
    }
}
