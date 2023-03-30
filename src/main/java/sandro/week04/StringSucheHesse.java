package sandro.week04;

import data.Texts;

public class StringSucheHesse {
    public static void main(String[] args) {
        String text = Texts.HESSE;
        System.out.println(text);

        int[] count = counthesse(text);
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0){
                System.out.println(count[i]);
            }
        }


    }

    public static int[] counthesse(String input){
        int[] count = new int[Character.MAX_VALUE];
        for (int i = 0; i < input.length(); i++) {
            ++count[input.charAt(i)];
        }
        return count;
    }



}
