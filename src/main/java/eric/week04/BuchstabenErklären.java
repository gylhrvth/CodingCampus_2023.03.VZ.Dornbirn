package eric.week04;

public class BuchstabenErklären {
    public static void main(String[] args) {
        String input = data.Texts.getSimpleText();
        textMoreThanOne(input);
        System.out.println(input);
    }

    public static void textMoreThanOne(String input) {
        int[] textMore = countChars(input);
        for (int i = 0; i < textMore.length; i++) {
            if (textMore[i] > 0) {
                System.out.println((char)i + " " + textMore[i] + " " + i);
            }
        }
    }

    public static int[] countChars(String input) {
        int[] charCount = new int[Character.MAX_VALUE];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            charCount[ch]++;
        }
        return charCount;
    }
}
