package sandro.week04;

import lukas.week03.day4.Colors;

public class StringReplacePrintDelete {
    public static void main(String[] args) {
        System.out.println("Text replace");
        String text = "\"Heute wird ein guter Tag! Heute wird ein noch guterer Tag! Heute wird ein spitzen guter Tag!\"";

        String search = "wird";
        String replaceWord1 = Colors.COLORS[1] + "war" + Colors.RESET;
        String replaceWord2 = Colors.COLORS[2] + "ist" + Colors.RESET;

        String newText1 = text.replaceAll(search, replaceWord1);
        String newText2 = text.replaceAll(search, replaceWord2);

        System.out.println(text);
        System.out.println(newText1);
        System.out.println(newText2);


        String noabc = text.replaceAll("[a-z]", "");
        System.out.println(noabc);

        String noABC = text.replaceAll("[A-Z]", "");
        System.out.println(noABC);

        String noSpace = text.replaceAll("[ ]", "");
        System.out.println(noSpace);

        String noCallsign = text.replaceAll("[!]", "");
        System.out.println(noCallsign);


        System.out.println("Numbers replace");
        String numbers = "749813247132984712039487123049871204398712039487";

        String noZeroToNine = numbers.replaceAll("[0-9]", "");
        System.out.println(">>>" + noZeroToNine + "<<<");
        String noOneToNine = numbers.replaceAll("[1-9]", "");
        System.out.println(">>>" + noOneToNine + "<<<");
        String noTwoToFour = numbers.replaceAll("[2-4]", "");
        System.out.println(">>>" + noTwoToFour + "<<<");
        String noOneToThreeandSixToNine = numbers.replaceAll("[1-36-9]","");
        System.out.println(">>>" + noOneToThreeandSixToNine + "<<<");

    }


}
