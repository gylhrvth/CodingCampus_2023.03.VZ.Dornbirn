package sandro.week04;

import java.sql.SQLOutput;

public class StringEmailCheckRegex {
    public static void main(String[] args) {


//        regexproof("a@b.c");
//        regexproof("1gyula.horvath.dcv");
//        regexproof("gyula.hor3vath@");
//
//
//        regexproof(".gyula.horvath.dcv");
//        regexproof("gyula.horvath@");
//        regexproof("sandro.Boso@");
//        regexproof("sandro_Boso@");
//        regexproof("gyula.horvath@dcv");
//        regexproof("gyula.horvath@dcv.");
//        regexproof("world5");
//        regexproof("gyula.horvath@dcv.dornbirn");
//        regexproof("gyula.horvath@dcv.dornbirn1890.at");
//        regexproof("sandro@blalb.c2om");

        System.out.println("---true---");
        regexproof("alfons@drlue.at");
        regexproof("rambina.alfons@drlue.at");
        regexproof("rambina1.1alfons@drlue.at");
        System.out.println("---false---");
        regexproof("rambina1..1alfons@drlue.at");
        regexproof("1rambina1.alfons@drlue.at");
        regexproof("@drlue.at");
        regexproof("drlue.at");
        regexproof("asdf@drlue");
        regexproof("asdf@microsoft.c");


    }

    public static void regexproof(String email) {
//        String regex = "[A-Za-z][A-Za-z0-9]*((\\.)[A-Za-z][A-Za-z0-9]*)*@[A-Za-z0-9]*([.][A-Za-z])*";
        String regex = "[A-Za-z][A-Za-z0-9]*([.][A-Za-z0-9][A-Za-z0-9]*)*@[A-Za-z0-9]+([.][A-Za-z0-9]{2,})";
        System.out.println(email + " ---> " + email.matches(regex));
    }
}
