package mariechristine.Week1;

import java.util.Scanner;

public class ReviewExercises {
    public static void main(String[] args) {
//        greeting();
        inputNumber("Please enter a number!");
    }

    public static void greeting() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = sc.nextLine();
        System.out.println("Hello Mrs./Mr. " + userName + "!");
    }

    public static void inputNumber(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);

        int number = 0;
        boolean inputIsValid = false;
        while (!inputIsValid) {
            try {
                String line = sc.nextLine();
                number = Integer.parseInt(line);
                if (number < 100) {
                    inputIsValid = true;
                } else {
                    System.out.println("hjkl");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Only numbers are accepted.");
            }

        }


    }
}
