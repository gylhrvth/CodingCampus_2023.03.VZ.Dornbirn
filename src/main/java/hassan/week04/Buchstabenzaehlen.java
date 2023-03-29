package hassan.week04;

public class Buchstabenzaehlen {

    public static void main(String[] args) {
        String simpleText = data.Texts.getSimpleText();
        int[] charCount = countChars(simpleText);

        System.out.println("Anzahl der Buchstaben und Zeichen im Text:");

        for (int i = 0; i < charCount.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < charCount.length; j++) {
                if (charCount[j] > charCount[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (charCount[maxIndex] > 0) {
                char ch = (char) maxIndex;
                System.out.printf("%s %3d\n", ch, charCount[maxIndex]);
            }

            int temp = charCount[i];
            charCount[i] = charCount[maxIndex];
            charCount[maxIndex] = temp;
        }
    }


    public static int[] countChars(String text) {
        int[] charCount = new int[Character.MAX_VALUE];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            charCount[ch]++;
        }
        return charCount;
    }
}
