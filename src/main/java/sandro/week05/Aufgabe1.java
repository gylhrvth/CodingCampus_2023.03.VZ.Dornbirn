package sandro.week05;


import lukas.week03.day4.Colors;

public class Aufgabe1 {

    //todo is there a other way to merge Strings, with text1+text2, and why cant you use Colors if you merge Strings???
    public static void main(String[] args) {
        System.out.println("orginal text");
        String stringToReplace = "Heute der 19.10.2021 wird ein sehr guter Tag. Zwar gibt es sowas wie einen Test, den 14 Leute schreiben, aber das ist doch egal!";
        System.out.println(stringToReplace);

        //  a bis c durch X
        //  f bis z durch Y
        //  1 bis 5 durch a
        //  4 bis 9 durch b

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

        String newTextf = stringToReplace.replaceAll("[a-c]", "X");
        String newText2f = newTextf.replaceAll("[f-z]", "Y");
        String newText3f = newText2f.replaceAll("[1-5]", "a");
        String newText4f = newText3f.replaceAll("[4-9]", "b");
        System.out.println(newText4f);


    }


}

