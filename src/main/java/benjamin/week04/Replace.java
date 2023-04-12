package benjamin.week04;

public class Replace {
    public static void main(String[] args) {
        String text = "Heute wird ein guter Tag! Heute wird ein noch guterer Tag! Heute wird ein spitzen guter Tag!";

        String war = text.replace("wird", "war");
        String ist = text.replace("wird", "ist");

        System.out.println(war);
        System.out.println(ist);

        System.out.println("----------");

        String big = text.replaceAll("[A-Z]", "");
        String small = text.replaceAll("[a-z]", "");
        String space = text.replaceAll("[ ]", "");
        String sign = text.replaceAll("[!]", "");

        System.out.println(small);
        System.out.println(big);
        System.out.println(space);
        System.out.println(sign);

        System.out.println("---------");

        String numbers = "749813247132984712039487123049871204398712039487";

        String zeroToNine = numbers.replaceAll("[0-9]", "");
        String oneToNine = numbers.replaceAll("[1-9]", "");
        String twoToFour = numbers.replaceAll("[2-4]", "");
        String oneToThreeAndSixToNine = numbers.replaceAll("[1-36-9]", "");

        System.out.println(">" + zeroToNine + "<");
        System.out.println(">" + oneToNine + "<");
        System.out.println(">" + twoToFour + "<");
        System.out.println(">>" + oneToThreeAndSixToNine + "<<");
    }
}
