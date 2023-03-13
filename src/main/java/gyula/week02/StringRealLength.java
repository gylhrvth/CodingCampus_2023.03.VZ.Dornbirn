package gyula.week02;

import java.util.Scanner;

public class StringRealLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie ein Text ein:");
        String text = sc.nextLine();

        System.out.println("lenght       : " + text.length());
        System.out.println("lenght (real): " + text.codePointCount(0, text.length()));

    }
}
