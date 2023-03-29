package gyula.week04;
import data.Texts;


public class CountLetters {
    public static void main(String[] args) {
        String input = Texts.getSimpleText();
/*
        int[] count = new int[Character.MAX_VALUE];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            ++count[c];
        }

        for (char c = 0; c < count.length; c++) {
            if (count[c] > 0) {
                System.out.println(c + " " + (int) c + " " + count[c]);
            }
        }
*/
        char lastChar = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) > lastChar){
                lastChar = input.charAt(i);
            }
        }
        for (char c = 0; c <= lastChar; c++) {
            int counter = 0;
            for (int i = 0; i < input.length(); i++) {
                if (c == input.charAt(i)){
                    ++counter;
                }
            }
            if (counter > 0){
                System.out.println(c + " " + (int) c + " " + counter);
            }
        }


        System.out.println(input);
    }
}
