package benjamin.week02;

import java.util.Scanner;

public class Taschenrechner {

    public static void main(String[] args) {

        taschenrechner();

    }

    public static void taschenrechner() {
        System.out.println("Was willst du rechnen?");
        float value = readNumber();
        String operator = readText("+,-,*,^,/");
        float value2 = readNumber();

        float wert = 0.0f;

        if (operator.equals("+")) {
            wert = value + value2;
            System.out.println("dein Ergenis ist " + wert);
            }


    }

    public static String readText(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextLine();
    }






    public static float readNumber (){
        Scanner sc = new Scanner(System.in);
        float value = 0.0f;
        boolean numberIsValid = false;
        while (!numberIsValid) {
            try {
                String line = sc.nextLine();
                value = Float.valueOf(line);
            } catch (NumberFormatException nfe) {
                System.out.println("Keine gültige Zahl.");
            }
        }
        return value;
    }
}


