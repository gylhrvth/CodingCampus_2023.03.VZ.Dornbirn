package benjamin.week04;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte gib Wort 1 ein:");
        System.out.print(">>>> ");
        String word1 = sc.nextLine();
        System.out.println("Bitte gib Wort 2 ein:");
        System.out.print(">>>> ");
        String word2 = sc.nextLine();

        String[] result1 = word1.split("\\s");
        String[] result2 = word2.split("\\s");


        for (int i = 0; i <= result1.length; i++) {
            for (int j = 0; j <= result2.length; j++) {





//        String result1 = word1.substring(0,10);
//        String result2 = word2.substring(0,10);

//        System.out.println(result1 + result2);


            }
        }
    }
}


