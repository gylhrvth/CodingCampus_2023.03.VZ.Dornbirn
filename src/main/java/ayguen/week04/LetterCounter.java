package ayguen.week04;

public class LetterCounter {
    public static void main(String[] args) {
        String Text = data.Texts.getSimpleText();
        int[] textCharCount = countLetters(Text);

        char[] letter = new char[textCharCount.length];
        for (char c = 0; c < letter.length; c++) {
            letter[c] = c;
        }
        bubblesort(textCharCount, letter);

        for (int i = 0; i < textCharCount.length; i++) {
            if (textCharCount[i] > 0) {
                System.out.println(letter[i] + " = " + textCharCount[i]);
            }
        }

    }


    public static int[] countLetters(String text) {

        int[] charCount = new int[Character.MAX_VALUE];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            charCount[ch]++;
        }

        return charCount;
    }


    public static void bubblesort(int[] arr, char[] letter) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;


                }
                char tempc = letter[j];
                letter[j] = letter[j + 1];
                letter[j + 1] = tempc;

            }
        }
    }
}