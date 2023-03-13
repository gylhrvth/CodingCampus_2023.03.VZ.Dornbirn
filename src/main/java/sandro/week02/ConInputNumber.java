package sandro.week02;


import java.util.Scanner;

public class ConInputNumber {
    public static void main(String[] args) {
        String text = ConInputText.readtext("mit welchem Buchstaben?");
        int size = readNumber("wie groß soll skalliert werden", 3, 30);

        sandro.week01.Funktionen.printRhombus2(text, size);
    }

    public static int readNumber(String message, int minValue, int maxValue) {
        Scanner sc = new Scanner(System.in);
        int value = 0;
        boolean numberIsValid = false;
        while (!numberIsValid) {
            System.out.println(message);
            try {
                String line = sc.nextLine();
                value = Integer.valueOf(line);
                sc.nextLine();
                if
                ((value >= minValue) && (value <= maxValue)) {
                    numberIsValid = true;
                } else {
                    System.out.println("Die Zahl muss zwischen " + minValue + " und " + maxValue + " sein.");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Es ist keine gültige Zahl");
                sc.nextLine();
            }
        }
        return value;
    }
}
