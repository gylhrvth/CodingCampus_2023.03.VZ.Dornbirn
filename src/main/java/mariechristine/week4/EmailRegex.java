package mariechristine.week4;

public class EmailRegex {
    public static void main(String[] args) {

/*        String test = "j7";
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
        String regex4 = "!+[a-z]";
        System.out.println("Test auf Sonderz. und kleing. Wort: " + test4.matches(regex4));

        String test5 = "!n8";
        String regex5 = "[!][a-z][0-9]";
        System.out.println("Test auf Sonderz. und kleing. Wort und Zahl: " + test5.matches(regex5));

        String email1 = "alfons@drlue.at";
        String regex1 = "[a-z]*@?[a-z]*.?[a-t]+";
        System.out.println("Ausgabe wahr: " + email1.matches(regex1));

        String email2 = "rambina.alfons@drlue.at";
        String regex2 = "[a-z]*.?[a-z]*@?[a-z]*.?[a-t]+";
        System.out.println("Ausgabe wahr: " + email2.matches(regex2));

        String email3 = "rambina1.1alfons@drlue.at";
        String regex3 = "[a-z]*?[0-9]?.?[0-9]?[a-z]*@?[a-z]*.?[a-z]+";
        System.out.println("Ausgabe wahr: " + email3.matches(regex3));

        System.out.println("\n====================================\n");
*/

        String regex = "[^@1][a-z]*1?\\.?@?1?[a-z]*@[a-z]*\\.[a-z]{2}";

        System.out.println("alfons@drlue.at".matches(regex)); //Wahr

        System.out.println("rambina.alfons@drlue.at".matches(regex)); //Wahr

        System.out.println("rambina1.1alfons@drlue.at".matches(regex)); //Wahr

        System.out.println("1rambina1.alfons@drlue.at".matches(regex)); //Falsch

        System.out.println("@drlue.at".matches(regex)); //Falsch

        System.out.println("drlue.at".matches(regex)); //Falsch

        System.out.println("asdf@drlue".matches(regex)); //Falsch

        System.out.println("asdf@microsoft.c".matches(regex)); //Falsch

        System.out.println("---");


        regex = "[^.0-9][a-z0-9]*.?[a-z0-9]*@[a-z0-9]*\\.[a-z]{2,3}";

        System.out.println("alfons@drlue.at".matches(regex)); //Wahr

        System.out.println("ramb1ina.alfo3ns@drl2ue.com".matches(regex)); //Wahr

        System.out.println("rambina1.2alfons@drlue.at".matches(regex)); //Wahr

        System.out.println("1rambina1.alfons@drlue.at".matches(regex)); //Falsch

        System.out.println("@drlue.at".matches(regex)); //Falsch

        System.out.println("drlue.at".matches(regex)); //Falsch

        System.out.println("asdf@drlue".matches(regex)); //Falsch

        System.out.println("asdf@microsoft.c".matches(regex)); //Falsch
    }

}
