package sandro.week07;

import java.io.*;
import java.util.Scanner;

public class FileBankkonto {
    public static void main(String[] args) {
        String name = readinput("Please enter your Name: ");
        File userAccount = new File("assets/bank/" + name + ".txt");
        userAccount.getParentFile().mkdirs();
        int value = readFileValue(userAccount, 100);
        System.out.println("your account has: " + value);
        int choose = readInt("Enter 1 for Deposit: \nEnter 2 for Withdraw: ", 1, 2);
        int ammount = readInt("Enter the Amount: ", 0, 10000);

        int newValue = value + (3 - choose*2) * ammount;
        writeInFile(userAccount, newValue);
        System.out.println("your account has now: " + newValue);
    }

    public static int readFileValue(File account, int defaultValue) {
        int value = defaultValue;
        try {
            FileInputStream fis = new FileInputStream(account);
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

    public static void writeInFile(File account, int newValue) {
        int input = newValue;

        try {
            FileOutputStream fos = new FileOutputStream(account, false);
            PrintStream ps = new PrintStream(fos);
            ps.println(input);
            ps.close();
            System.out.println("File schreiben war erfolgreich");
        } catch (FileNotFoundException fnfe) {
            System.out.println(account.getAbsolutePath() + " ist nicht erreichbar.");
        }
    }

/*

    public static void openOrMakeFile(String name) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\ossdr\\OneDrive\\Desktop\\" + name + ".txt");
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
            }
            sc.close();
        } catch (FileNotFoundException fnfe) {

            System.out.println("Datei wurde nicht gefunden.");
            System.out.println("....");
            System.out.println("Datei wird erstellt");
            System.out.println("....");

            File f = new File("C:\\Users\\ossdr\\OneDrive\\Desktop\\" + name + ".txt");

            try {

                FileOutputStream fos = new FileOutputStream(f, false);
                PrintStream ps = new PrintStream(fos);
                ps.println("100");
                ps.close();

                System.out.println("files completed");
            } catch (FileNotFoundException fnfe2) {
                fnfe.printStackTrace();
                System.out.println(f.getAbsoluteFile() + " path is not valid");
            }
        }
    }
*/

    public static int readInt(String message, int minValue, int maxValue) {
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
                System.out.println("Input is not valid");
            }
        }
        return value;
    }

    public static String readinput(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String text = sc.nextLine();
        return text;
    }
}


