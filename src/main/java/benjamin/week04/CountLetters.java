package benjamin.week04;

public class CountLetters {
    public static void main(String[] args) {

        String text = data.Texts.getSimpleText();
        int[] chars = countChars(text);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 0) {
                char c = (char) i;
                System.out.println(c + " " + chars[i]);
            }
        }
        System.out.println(text);
    }

    public static int[] countChars(String text) {
        int[] count = new int[Character.MAX_VALUE];
        for (char i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            count[c]++;
        }
        return count;
    }
}


