package eric.week04;


public class ReplaceExercise {
    public static void main(String[] args) {
        String text = "Heute wird ein guter Tag! Heute wird ein noch besserer Tag! Heute wird ein spitzen guter Tag!";
        System.out.println(text);

        System.out.println("---");
        System.out.println();

        System.out.println("Replace All, 'wird' replace with 'war' and 'is'");
        String replaceWas = text.replace("wird", "war");
        System.out.println(replaceWas);
        String replaceIs = text.replace("wird", "ist");
        System.out.println(replaceIs);

        System.out.println("---");
        System.out.println();

        System.out.println("Replace All, Lösche alle kleinbuchstaben");
        String deleteSmall = text.replaceAll("[a-z]", " ");
        System.out.println(deleteSmall);
        System.out.println("---");


        System.out.println("Replace All, Lösche alle Großbuchstaben");
        String deleteCapital = text.replaceAll("[A-Z]", " ");
        System.out.println(deleteCapital);
        System.out.println("---");


        System.out.println("Replace All, Lösche alle Leerzeichen");
        String deleteSpace = text.replaceAll("[ ]", "");
        System.out.println(deleteSpace);
        System.out.println("---");


        System.out.println("Replace All, Lösche alle Ausrufezeichen");
        String deleteEx = text.replaceAll("[!]", " ");
        System.out.println(deleteEx);
        System.out.println("---");

        System.out.println("Replace All 3");
        String numbers = "7498132471329847120394587123049871204398712039487";

        System.out.println("Lösche Alle Zahlen 0-9");
        String deleteAll = numbers.replaceAll("[0-9]", "~");
        System.out.println(deleteAll);
        System.out.println("---");

        System.out.println("Lösche Alle Zahlen 1-9");
        String deleteOne = numbers.replaceAll("[1-9]","~");
        System.out.println(deleteOne);
        System.out.println("---");

        System.out.println("Lösche Alle Zahlen 2-4");
        String deleteTwo = numbers.replaceAll("[2-4]", "~");
        System.out.println(deleteTwo);
        System.out.println("---");

        System.out.println("Lösche Alle Zahlen 1-3 und 6-9");
        String deleteThree = numbers.replaceAll("[1-36-9]","~");
        System.out.println(deleteThree);
        System.out.println("---");


    }
}
