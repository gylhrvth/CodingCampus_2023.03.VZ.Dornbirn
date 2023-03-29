package eric.week04;

import data.Texts;

public class SearchForHesse {
    public static void main(String[] args) {
        String input = Texts.HESSE;
        System.out.println("Hessen ist im Text: ");
        findHesse(input);
    }

    public static void findHesse(String input){
        int count = 0;
        int lastIndex = 0;
        while (lastIndex != -1){
            lastIndex = input.indexOf("Hessen", lastIndex);
            if (lastIndex != -1){
                count++;
                lastIndex += "Hessen".length();
            }
        }
    }
}
