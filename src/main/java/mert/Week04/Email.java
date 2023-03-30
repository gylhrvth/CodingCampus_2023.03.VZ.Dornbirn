package mert.Week04;

public class Email {
    public static void main(String[] args) {

        String regex = "[a-z]+\\d*.*[a-z]*@{1}[a-z]+.{1}[a-z]+";


        System.out.println("alfons@drlue.at".matches(regex));
        System.out.println("rambina.alfons@drlue.at".matches(regex));
        System.out.println("rambina1.1alfons@drlue.at".matches(regex));
        System.out.println("1rambina1.alfons@drlue.at".matches(regex));
        System.out.println("@drlue.at".matches(regex));
        System.out.println("drlue.at".matches(regex));
        System.out.println("asdf@drlue".matches(regex));
        System.out.println("asdf@microsoft.c".matches(regex));
        System.out.println("aaasdf@asdf.".matches(regex));

    }

//    haha fehler
}
