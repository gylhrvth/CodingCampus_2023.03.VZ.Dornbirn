package mert.Week04;

public class ReplaceAll {
    public static void main(String[] args) {
        String text = "Heute wird ein guter Tag! Heute wird ein noch guterer Tag! Heute wird ein spitzen guter Tag!";


        String replace = text.replace("wird", "war und ist");
        System.out.println(replace);

        System.out.println("Ohne Kleinbuchstaben");
        String replace2 = text.replaceAll("[a-z]", "");
        System.out.println(replace2);

        System.out.println("Ohne Großbuchstaben");
        String replace3 = text.replaceAll("[A-Z]", "");
        System.out.println(replace3);

        System.out.println("Ohne Ausrufezeichen !");
        String replace4 = text.replaceAll("!", "");
        System.out.println(replace4);


        String numbers = "749813247132984712039487123049871204398712039487";
        System.out.println(numbers);

        System.out.println("Ohne 0-9");
        String rep = numbers.replaceAll("[0-9]","");
        System.out.println(rep);

        System.out.println("Ohne 1-9");
        String rep2 = numbers.replaceAll("[1-9]", "");
        System.out.println(rep2);

        System.out.println("Ohne 2-4");
        String rep3 = numbers.replaceAll("[2-4]", "");
        System.out.println(rep3);

        System.out.println("Ohne 1-3, 6-9");
        String rep4 = numbers.replaceAll("[1-3, 6-9]", "");
        System.out.println(rep4);
    }
}
