package ayguen.week04;

import java.util.ArrayList;
import java.util.Arrays;

public class AufgabeEmailRegex {

    public static void main(String[] args) {

        String regex = "[a-z]+(1\\.1[a-z]+|\\.[a-z]+)?@[a-z]+\\.[a-z]{2,}";

        System.out.println("alfons@drlue.at".matches(regex));
        System.out.println("rambina.alfons@drlue.at".matches(regex));
        System.out.println("rambina1.1alfons@drlue.at".matches(regex));
        System.out.println("@drlue.at".matches(regex));
        System.out.println("drlue.at".matches(regex));
        System.out.println("asdf@drlue".matches(regex));
        System.out.println("asdf@microsoft.c".matches(regex));

        System.out.println("---");

        regex = "[a-z]+[1-9]+[a-z]+(1)?(@|\\.)?(1)?[a-z]+(@)?([1-9]+)?[a-z]+(\\.)?(@)?([a-z]+)?(\\.)?[a-z][a-z]+";

        System.out.println("alf124ons@drl14ue.at".matches(regex));
        System.out.println("ram132bina.alf521ons@drlue.at".matches(regex));
        System.out.println("ra123mbina1.1alfons@drlue.at".matches(regex));
        System.out.println("@drlue.at".matches(regex));
        System.out.println("drlue.at".matches(regex));
        System.out.println("1asdf@drlue".matches(regex));
        System.out.println("asdf@microsoft.c".matches(regex));

    }
}
