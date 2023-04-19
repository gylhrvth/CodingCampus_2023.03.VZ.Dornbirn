package benjamin.week07;


import java.io.*;
import java.util.Scanner;

public class FileReadAndWrite {
    public static void main(String[] args) {
        String name = readText("Geben sie Ihren Namen ein:");
        File accountUser = new File("assets/bank/" + name + ".text");
        accountUser.getParentFile().mkdirs();
        int value = valueFile(accountUser, 100);
        System.out.println("Your account balance is " + value + "€");
        int request = readValue("Deposit 1 \nWithdraw 2 ", 1, 2);
        int amount = readValue("Enter the ammount:", 0, 10000);

        int newValue = value + (3 - request * 2) * amount;
        writeInFile(accountUser, newValue);
        System.out.println("your account has now: " + newValue);

    }

    public static int valueFile(File f, int amount) {
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

    public static void writeInFile(File f, int newValue) {
        int input = newValue;
        try {
            FileOutputStream fos = new FileOutputStream(f, false);
            PrintStream ps = new PrintStream(fos);
            ps.println(input);
            ps.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println(f.getAbsolutePath() + " ist nicht erreichbar.");
        }
    }

    public static String readText(String message) {
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
                System.out.println("Keine gültige Zahl.");
                sc.nextLine();
            }
        }
        return value;
    }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Geben Sie Ihren Namen ein:");
//        String name = sc.nextLine();
//
//        int account = 100;
//        String filename = "assets/tmp/" + name +".text";
//
//        try{
//        File file = new File(filename);
//        if(file.exists()){
//            Scanner fileScan = new Scanner(file);
//            account = Integer.parseInt(fileScan.nextLine());
//            fileScan.close();
//            System.out.println("Hallo " + name + " your balance is " + account);
//        }
//
//        }catch (FileNotFoundException fnfe){
//            System.out.println("Datei wurde nicht gefunden.");
//        }
//    }
//    public static String readText(String message){
//        Scanner sc = new Scanner(System.in);
//        System.out.println(message);
//        return sc.nextLine();
//    }

//          try{
//            FileInputStream fis = new FileInputStream("C:\\Users\\Beni\\Desktop\\name.text.txt");
//            askForName("Enter your Name: ");
//            Scanner sc = new Scanner(fis);
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                System.out.println("Your current account balance is " + line + " €");
//            }
//            sc.close();
//        } catch (
//                FileNotFoundException fnfe) {
//            System.out.println("File is not available.");
//        }
//    }
//
//    public static String askForName(String message) {
//        Scanner sc = new Scanner(System.in);
//        String accountName = "Benjamin";
//        boolean validInput = false;
//        while (!validInput) {
//            System.out.println(message);
//
//            String line = sc.nextLine();
//            if (accountName.contains(line)) {
//                validInput = true;
//                System.out.println("Hello " + accountName);
//            } else {
//                System.out.println("Wrong Name, please try again!");
//            }
//        }
//        return accountName;
//    }

}
