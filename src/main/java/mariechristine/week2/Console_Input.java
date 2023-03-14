package mariechristine.week2;


import java.util.Scanner;

public class Console_Input {
    public static void main(String[] args) {
        String text = erstFrage("Wie heisst Du?");
        System.out.println("Ich bin " + text + ".");
    }
    public static String erstFrage(String text){
        Scanner scotty = new Scanner(System.in);
        System.out.println(text);
        return scotty.nextLine();
    }
}

