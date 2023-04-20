package joachim.week07;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Who are you?");
            String text = scanner.nextLine();
            File file = new File("assets/bank/" + text + ".txt");
            file.getParentFile().mkdirs();
            long kontostand = 100;
            if (file.exists()) {
                Scanner filescanner = new Scanner(file);
                kontostand = filescanner.nextLong();
            }
            FileOutputStream fos = new FileOutputStream(file, false);
            PrintStream ps = new PrintStream(fos);
            ps.println(questionary(kontostand));
            ps.close();

        } catch (IOException ioe) {
            System.err.println("Does not exist");

        }

    }

    public static long questionary(long kontostand) {
        Scanner scanner = new Scanner(System.in);
        long reserves;
        boolean ask = true;
        while (ask) {

            try {
                System.out.println("Kontostand: " + kontostand);
                System.out.println("Would you like to deposite or withdraw money?");
                String answer = scanner.nextLine().toLowerCase();
                if (answer.contains("deposite")) {
                    System.out.println("How much Money would you like to deposite?");
                    reserves = scanner.nextInt();
                    kontostand = kontostand + reserves;
                    System.out.println("You have deposited " + reserves + " Euro.");
                    System.out.println("Your new balance is " + kontostand);
                    ask = false;
                }
                if (answer.contains("withdraw")) {
                    System.out.println("How much Money would you like to withdraw?");
                    reserves = scanner.nextInt();
                    kontostand = kontostand - reserves;
                    System.out.println("You have withdrawn " + reserves + " Euro.");
                    System.out.println("Your new balance is " + kontostand);
                    ask = false;
                }

            } catch (InputMismatchException ime) {
                System.err.println("a number you DIMWIT!");

            }

        }

        return kontostand;
    }
}