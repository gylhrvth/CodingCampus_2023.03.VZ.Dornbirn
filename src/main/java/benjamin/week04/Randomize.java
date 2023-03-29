package benjamin.week04;

import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;
import java.util.Scanner;


public class Randomize {
    static Random rand = new Random();

    public static void main(String[] args) {

        System.out.println("Willkommen zum Zufallsshuffle Programm!!!111");
        System.out.print(">>>> ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] arr = text.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            int ra = rand.nextInt(arr.length - i - 1);
            char temp = arr[i];
            arr[i] = arr[i + ra];
            arr[i + ra] = temp;
        }
        String reverse = new String(arr);
        System.out.println(reverse);
    }
}

