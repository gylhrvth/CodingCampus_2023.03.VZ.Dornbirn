package ayguen.week04;

public class ReplaceAll {

    public static void main(String[] args) {

        String satz = "Heute wird ein guter Tag!";
        String satz1 = "Heute wird ein noch guterer Tag";
        String satz2 = "Heute wird ein spitzen guter Tag!";

        String anderung = satz.replace("wird", "ist");
        String anderung1 = satz1.replace("wird", "was");
        String anderung2 = satz2.replace("wird", "ist");

        System.out.println(anderung);
        System.out.println(anderung1);
        System.out.println(anderung2);


        //ReplaceAll2

        String satzAll = "Heute wird ein guter Tag! Heute wird ein noch guterer Tag. Heute wird ein spitzen guter Tag!";

        String grossbuchstaben = satzAll.replaceAll("[a-z]","");
        System.out.println(grossbuchstaben);
        String kleinbuchstaben = satzAll.replaceAll("[A-Z]", "");
        System.out.println(kleinbuchstaben);
        String leerzeichen = satzAll.replaceAll(" ", "");
        System.out.println(leerzeichen);
        String rufezeichen = satzAll.replaceAll("!", "");


//ReplaceAll 3

        String zahlen = "749813247132984712039487123049871204398712039487";
        System.out.println(zahlen);

        System.out.println("_____________________________________");

        String zahlen0bis9 = zahlen.replaceAll("[0-9]", "");
        System.out.println(zahlen0bis9);
        String zahlen1bis9 = zahlen.replaceAll("[1-9]+", "");
        System.out.println(zahlen1bis9);
        String zahlen2bis4 = zahlen.replaceAll("[2-4]", "");
        System.out.println(zahlen2bis4);
        String zahlen1bis3und6bis9 = zahlen.replaceAll("[1-3][6-9]", "");
        System.out.println(zahlen1bis3und6bis9);


    }
}
