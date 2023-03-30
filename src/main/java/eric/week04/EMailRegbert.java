package eric.week04;

public class EMailRegbert {

    public static void main(String[] args) {
        String regex = "[^0-9][a-zA-Z0-9]+(\\.)?[0-9a-zA-Z0-9]+@{1}+[a-zA-Z0-9]+\\.{1}[a-zA-Z]{2}";

        System.out.println("alfons@drlue.at".matches(regex));                       //Ausgabe          true

        System.out.println("rambina.alfons@drlue.at".matches(regex));               //Ausgabe          true

        System.out.println("rambina1.1alfons@drlue.at".matches(regex));             //Ausgabe          true

        System.out.println("1rambina1.alfons@drlue.at".matches(regex));             //Ausgabe          false

        System.out.println("@drlue.at".matches(regex));                             //Ausgabe          false

        System.out.println("drlue.at".matches(regex));                              //Ausgabe          false

        System.out.println("asdf@drlue".matches(regex));                            //Ausgabe          false

        System.out.println("asdf@microsoft.c".matches(regex));                      //Ausgabe          false

    }
}
