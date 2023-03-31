package mariechristine.week4;

import java.util.Arrays;

public class BuchstabenZaehlen {
    public static void main(String[] args) {
        String simpleText = data.Texts.getSimpleText();
        System.out.println(simpleText);

        textLength(simpleText);
        // charAt(int i) gibt den Buchstaben aus, der an Position i ist; bspw. Wort Marie i = 2 = r

    }

    public static void textLength(String simpleText) {
        char[] charArray = simpleText.toCharArray(); //Zerlegt den gesamten Text(String) in Einzelzeichen und gibt diese in einem Char Array zurück
        int[] charToCount = new int[10240]; //Initialisiert die Buchstaben/Ziffern, die zu zählen sind; Festlegen von ungefährer Zeichenanzahl des Textes

        for (int i = 0; i < simpleText.length(); i++) {
//            System.out.println(simpleText.charAt(i)); diesen Ausdruck braucht es nicht.
            char index = simpleText.charAt(i);
            ++charToCount[index];

        }
        for (char index = 0; index < charToCount.length; index++) {
            if (charToCount[index] > 0) {
                System.out.println(index + ": " + charToCount[index]);
            }

        }
    }
}
