package mariechristine.week4;

public class EmailRegex {
    public static void main(String[] args) {

        String test = "j7";
        String regex = "[a-z]+[1-9]";
        System.out.println("Test auf Kleinbuchstabe und Zahl: " + test.matches(regex));

        String test1 = "!";
        String regex1 = "[^abc]";
        System.out.println("Test auf alles außer a,b,c: " + test1.matches(regex1));

        String test2 = "!";
        String regex2 = "[^A-Z]";
        System.out.println("Test auf alles außer A-Z: " + test2.matches(regex2));

        String test3 = "A";
        String regex3 = "[^!?@]";
        System.out.println("Test auf alles außer '!?@': " + test3.matches(regex3));

        String test4 = "!n";
        String regex4 = "[!a-z]";
        System.out.println("Test auf Sonderz. und kleing. Wort: " + test4.matches(regex4));



    }
}
