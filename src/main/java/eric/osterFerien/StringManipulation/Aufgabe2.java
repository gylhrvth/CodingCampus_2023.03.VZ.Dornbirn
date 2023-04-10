package eric.osterFerien.StringManipulation;

public class Aufgabe2 {
    public static void main(String[] args) {
        String regex = "[a-z]{3,}[1-9]\\d{1}[0-9]{1}[A-Z]+";

        System.out.println("abc100A".matches(regex));           //Ausgabe          true
        System.out.println("Abc100A".matches(regex));           //Ausgabe          false
        System.out.println("luke010A".matches(regex));          //Ausgabe          false
        System.out.println("test101ABCDE".matches(regex));      //Ausgabe          true
        System.out.println("test1ABCDE".matches(regex));        //Ausgabe          false

    }
}
