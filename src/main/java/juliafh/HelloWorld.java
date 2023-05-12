package juliafh;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        Scanner scanner = new Scanner(System. in);
        String inputString = "";
        while (!inputString.equals("1")) {
            System.out.println("Do you want to say something?");
            inputString = scanner.nextLine();
            System.out.println("Simon says: " + inputString);
            if (inputString.length() < 2) {
                System.out.println("Just so much? Eh...");
            }
        }

        System.out.println("Bye bye");
    }
}
