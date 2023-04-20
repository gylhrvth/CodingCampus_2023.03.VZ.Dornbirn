package benjamin.week07;


import java.io.*;
import java.util.Scanner;

public class FileReadAndWrite {
    public static void main(String[] args) {
        String name = readAccountName("Insert your Name here:");
        File accountFile = new File("assets/bank/" + name + ".text");
        accountFile.getParentFile().mkdirs();
        int balance = readAccountBalance(accountFile, 100);
        System.out.println("Your account balance is " + balance + "€");

        int request = readValue("For Deposit write 1 \nFor Withdraw write 2 ", 1, 2);
        int amount = readValue("Enter the ammount:", 0, 10000);
        int newBalance = balance + (3 - request * 2) * amount;

        writeAccountBalance(accountFile, newBalance);
        System.out.println("Your account balance is now: " + newBalance + " €");

    }

    public static int readAccountBalance(File f, int amount) {
        int value = amount;
        try {
            FileInputStream fis = new FileInputStream(f);
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                value = Integer.valueOf(line);
            }
            sc.close();
        } catch (FileNotFoundException fnfe) {
        }
        return value;
    }

    public static void writeAccountBalance(File f, int newValue) {
        int input = newValue;
        try {
            FileOutputStream fos = new FileOutputStream(f, false);
            PrintStream ps = new PrintStream(fos);
            ps.println(input);
            ps.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println(f.getAbsolutePath() + " not reachable.");
        }
    }

    public static String readAccountName(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }

    public static int readValue(String message, int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean numberIsValid = false;
        while (!numberIsValid) {
            System.out.println(message);
            try {
                String line = sc.nextLine();
                value = Integer.valueOf(line);
                if ((value >= minValue) && (value <= maxValue)) {
                    numberIsValid = true;
                } else {
                    System.out.println("Choose " + minValue + " or " + maxValue);
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return value;
    }


}
