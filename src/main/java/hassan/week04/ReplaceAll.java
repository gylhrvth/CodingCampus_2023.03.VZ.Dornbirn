package hassan.week04;

public class ReplaceAll {

    public static void main(String[] args) {

        String text = "Heute wird ein guter Tag! Heute wird ein noch guterer Tag! Heute wird ein spitzen guter Tag!";

        String replacedtext = text.replace("wird", "war und ist");
        System.out.println(replacedtext);

        System.out.println("----------");
        String output = text.replaceAll("[a-z]", "");
        System.out.println("Ohne Kleinbuchstaben: " + output);

        System.out.println("-----------");
        String output2 = text.replaceAll("[A-Z]", "");
        System.out.println("Ohne Großbuchtsaben: " + output2);

        System.out.println("------------");
        String outout3 = text.replaceAll(" ", "");
        System.out.println("Ohne Leerzeichen: " + outout3);

        System.out.println("-------------");
        String output4 = text.replaceAll("!", "");
        System.out.println("Ohne Rufezeichen: " + output4);


        System.out.println("------------------------------------------------------------");


        String text2 = "749813247132984712039487123049871204398712039487";

        String num = text2.replaceAll("[0-9]", "");
        System.out.println("Ohne 0 - 9 : " + num);

        System.out.println("--------------");
        String num2 = text2.replaceAll("[1-9]", "");
        System.out.println("Ohne 1 - 9: " + num2);

        System.out.println("---------------");
        String num3 = text2.replaceAll("[2-4]", "");
        System.out.println("Ohne 2 - 4: " + num3);

        System.out.println("----------------");
        String num4 = text2.replaceAll("[1-36-9]", "");
        System.out.println("Ohne 1 -3 und 6 - 9: " + num4);

    }
}
