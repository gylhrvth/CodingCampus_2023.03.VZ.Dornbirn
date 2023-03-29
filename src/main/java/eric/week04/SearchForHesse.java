package eric.week04;

import data.Texts;

public class SearchForHesse {

    public static String input = Texts.HESSE;
    public static void main(String[] args) {
        System.out.print("Hesse kommt im Text: ");
        findHesse();
    }

    public static void findHesse() {
        String searchFor = "Hesse";
        int count = 0;
        int lastIndex = input.indexOf(searchFor);
        while (lastIndex != -1) {
            count++;
            System.out.println("Hesse wurde im text an Stelle: " + lastIndex + " gefunden!");
            lastIndex = input.indexOf(searchFor, lastIndex + 1);
        }
        System.out.println("Das Wort Hesse kommt im Text: " + count + " mal vor!");
    }

    public static void  replaceHesse(){
        String searchFor = "Hesse";
        String replaceWith = "HESSE";
        String replaceHesse = input.replaceAll(searchFor, replaceWith);
//        int indexOfHesse = replaceHesse.indexOf();
//        while (){
    }
}