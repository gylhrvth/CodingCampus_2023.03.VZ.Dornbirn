package eric.week04;

import java.util.Scanner;

public class LongestString {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bitte gib ein Satz ein!");
        String userInput = sc.nextLine();

        System.out.println("Bitte gib einen Zweiten Satz ein!");
        String userInput2 = sc.nextLine();


    }


//    public static int longestsubString(String userInput, String userInput2) {
//        int[][] inputLength = new int[userInput.length()][userInput2.length()];
//        char maxlength = userInput.length() + userInput2.length();
//        char maxlength = new char (userInput.length()+userInput2.length());
//        for (int i = 0; i < inputLength.length; i++) {
//            for (int j = 0; j < inputLength.length - i; j++) {
//                if (userInput.charAt(i) != userInput2.charAt(i)) {
//                    inputLength[i][j] = maxlength;
//                }
//                else if (inputLength[i][j] > maxlength) {
//                    maxlength = inputLength[i][j];
//                }
//            }
//        }
//        System.out.println("der längste SubString ist: " + maxlength);
//        return maxlength;
//    }

//    public static int greatestLengthInputString(String userInput, String userInput2) {
//        String[] arr = new String[userInput.length() + userInput2.length()];
//        int maxLength = userInput.length() + userInput2.length();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr.length =  ){
//
//            }
//        }
//    }
}
