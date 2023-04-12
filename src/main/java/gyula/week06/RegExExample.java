package gyula.week06;

import lukas.week03.day4.Colors;

public class RegExExample {
    public static void main(String[] args) {
        System.out.println("orginal text");
        String stringToReplace = "Heute der 19.10.2021 wird ein sehr guter Tag. Zwar gibt es sowas wie einen Test, den 14 Leute schreiben, aber das ist doch egal!";
        System.out.println(stringToReplace);

        String newText = stringToReplace.replaceAll("[a-c]", Colors.COLORS[1] + "X" + Colors.RESET);
        String newText2 = stringToReplace.replaceAll("[f-z]", Colors.COLORS[2] + "Y" + Colors.RESET);
        String newText3 = stringToReplace.replaceAll("[1-5]", Colors.COLORS[3] + "a" + Colors.RESET);
        String newText4 = stringToReplace.replaceAll("[4-9]", Colors.COLORS[4] + "b" + Colors.RESET);
        System.out.println("newText");
        System.out.println(newText);
        System.out.println(newText2);
        System.out.println(newText3);
        System.out.println(newText4);
        System.out.println("________________________________________");

        String newTextf = stringToReplace.replaceAll("[a-c]", "__COLOR_ONE__X__COLOR_RESET__");
        String newText2f = newTextf.replaceAll("[f-z]", "__COLOR_TWO__Y__COLOR_RESET__");
        String newText3f = newText2f.replaceAll("[1-5]", "__COLOR_THREE__a__COLOR_RESET__");
        String newText4f = newText3f.replaceAll("[4-9]", "__COLOR_FOUR__b__COLOR_RESET__");

        System.out.println(newText4f
                .replaceAll("__COLOR_ONE__", Colors.COLORS[1])
                .replaceAll("__COLOR_TWO__", Colors.COLORS[2])
                .replaceAll("__COLOR_THREE__", Colors.COLORS[3])
                .replaceAll("__COLOR_FOUR__", Colors.COLORS[4])
                .replaceAll("__COLOR_RESET__", Colors.RESET)
        );
    }
}
