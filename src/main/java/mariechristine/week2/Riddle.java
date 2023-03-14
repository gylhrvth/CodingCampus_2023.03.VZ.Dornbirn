package mariechristine.week2;

import java.util.Scanner;
import java.util.Random;

public class Riddle {
    static Random ran = new Random();

    public static void main(String[] args) {

        System.out.println("Willkommen beim super coolen Zahlen Ratespiel!\nErrate die Zahl zwischen 0 und 100!\nWas ist deine Zahl?");
        int x = ran.nextInt(101);
        System.out.println();


    }

}

