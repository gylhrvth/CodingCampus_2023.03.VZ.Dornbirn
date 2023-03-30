package benjamin.week04;

public class EmailRegex {
    public static void main(String[] args) {

        myMagicFunction("a@b.c");
        myMagicFunction("alfons@drlue.at");
        myMagicFunction("rambina.alfons@drlue.at");
        myMagicFunction("rambina1.1alfons@drlue.at");
        myMagicFunction("1rambina1.alfons@drlue.at");
        myMagicFunction("@drlue.at");
        myMagicFunction("drlue.at");
        myMagicFunction("asdf@drlue");
        myMagicFunction("asdf@microsoft.c");

        myMagicFunction("a@drlue.a");
        myMagicFunction(".a@drlue.a");
        myMagicFunction("a@a@drlue.a");
        myMagicFunction("a@drlue.at");
        myMagicFunction("james.bond007@drlue.at");
        myMagicFunction("rambina18@drlue.at");



    }

    public static void myMagicFunction(String email){
        String regex = "[a-zA-Z]*@?1?(\\.?)1?[a-zA-Z0-9]+@[a-zA-Z]+(\\.)[a-z]";
        System.out.println(email + " ==> " + email.matches(regex));
    }
}
