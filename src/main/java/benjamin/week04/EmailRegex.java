package benjamin.week04;

public class EmailRegex {
    public static void main(String[] args) {


        myMagicFunction("alfons@drlue.at");
        myMagicFunction("rambina.alfons@drlue.at");
        myMagicFunction("rambina1.1alfons@drlue.at");
        myMagicFunction("1rambina1.alfons@drlue.at");
        myMagicFunction("@drlue.at");
        myMagicFunction("drlue.at");
        myMagicFunction("asdf@drlue");
        myMagicFunction("asdf@microsoft.c");



    }

    public static void myMagicFunction(String email){
        String regex = "[a-zA-Z]+[a-zA-Z0-9]+@?\\.?[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z0-9]{2,}";
        System.out.println(email + " ==> " + email.matches(regex));
    }
}
