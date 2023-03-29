package mert.Week04;

import data.Texts;

public class Buchstabenzaehlen {
    public static void main(String[] args) {
        String text = Texts.getSimpleText();
        int[] count = zaehlen(text);

        char[] letter = new char[count.length];
        for (char c = 0; c < letter.length; c++) {
            letter[c] = c;
        }
        parallelSort(count, letter);


        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(letter[i] + " = " + count[i]);
            }
        }

    }

    public static void parallelSort(int[] value, char[] letter){
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value.length - 1 -i; j++) {
                if (value[j] < value[j + 1]){
                    int temp = value[j];
                    value[j] = value[j +1];
                    value[j + 1] = temp;

                    char cTemp = letter[j];
                    letter[j] = letter[j + 1];
                    letter[j + 1] = cTemp;
                }
            }
        }
    }


    public static int[] zaehlen(String text) {
        int[] count = new int[Character.MAX_VALUE];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            count[c]++;
        }
        return count;
    }
}


