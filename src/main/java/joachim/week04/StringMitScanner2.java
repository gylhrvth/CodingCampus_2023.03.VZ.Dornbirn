package joachim.week04;

import java.util.Random;
import java.util.Scanner;


public class StringMitScanner2 {
    public static Random rand = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Geben Sie bitte ein Wort ein das in reverse ausgegeben wird.");
//        String word = scanner.nextLine();
//        System.out.println(reverse(word));
//        System.out.println(ramdom(word));
        textWork();

/*
        String testString = "Hello World!";
        for (int i = 0; i < testString.length(); i++) {
            char c = testString.charAt(i);
            System.out.println(c + " " + (int) c);

        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<");
        for (char c = 0; c < Character.MAX_VALUE; c++) {
            System.out.print(c);
            if (c % 256 == 255) {
                System.out.println();
            }
        }
        System.out.println();
*/
    }

    public static String reverse(String text) {
        char[] letter = text.toCharArray();
        for (int i = 0; i < letter.length / 2; i++) {
            char temp = letter[i];
            letter[i] = letter[letter.length - 1 - i];
            letter[letter.length - 1 - i] = temp;
        }
        return new String(letter);
    }

    public static String ramdom(String text) {
        char[] letter = text.toCharArray();
        for (int i = 0; i < letter.length; i++) {
            int ra = rand.nextInt(letter.length);
            char temp = letter[i];
            letter[i] = letter[ra];
            letter[ra] = temp;
        }
        return new String(letter);
    }

    public static String ramdom2(String text) {
        char[] letter = text.toCharArray();
        for (int i = 0; i < 2 * letter.length + 3; i++) {
            int ra = rand.nextInt(letter.length);
            int ra2 = rand.nextInt(letter.length);
            char temp = letter[ra];
            letter[ra] = letter[ra2];
            letter[ra2] = temp;
        }
        return new String(letter);
    }

    public static void textWork() {
        String text = data.Texts.getSimpleText();
        int[] chars = counting(text);
        for (int i = 0; i < text.length(); i++) {
            if (chars[i] > 0) {
                char c = (char) i;
                System.out.println(c + " " + chars[i]);
            }
        }
    }

        public static int[] counting (String text){
            int[] count = new int[Character.MAX_VALUE];
            for (char c = 0; c < text.length(); c++) {
                char ca = text.charAt(c);
                count[ca]++;
            }
            return count;
        }
    }

