package eric.week04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseString {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = " ";
        String scan = new String(s.toCharArray());
    }





    public static void eingabeScanner(char[] scan){
        System.out.println("Bitte gib ein Wort oder mehrere Zahlen deiner Wahl ein.");
        try{
            sc.nextInt();
        } catch (InputMismatchException ime){
            sc.nextLine();
        }
    }
}
