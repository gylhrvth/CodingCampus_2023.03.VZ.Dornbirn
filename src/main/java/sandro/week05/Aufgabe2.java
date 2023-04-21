package sandro.week05;

public class Aufgabe2 {

    //todo regular expression are a thing, learn more and use them in diffrent ways
    public static void main(String[] args) {
        //    Drei oder mehr Kleinbuchstaben
        //    Eine Zahl größer als 0
        //    Zwei Zahlen
        //    Ein oder mehr Großbuchstaben

//        regexProof("ab");
//        regexProof("abc");
//        regexProof("abcd");
//        System.out.println();
//        regexProof("abc1");
//        regexProof("abc3");
//        regexProof("abc0");
//        System.out.println();
//        regexProof("abc105");
//        regexProof("abc35");
//        regexProof("abc090");
//        System.out.println();

        regexProof("abc100A");
        regexProof("ABC100A");
        regexProof("luke010A");
        regexProof("test101ABCDE");
        regexProof("test1ABCDE");
        regexProof("abc1000000AB");

    }

public static void regexProof (String test){
String regex = "([a-z]{3,})[1-9]([0-9]{2})[A-Z]+";
    System.out.println(test +"---->"+test.matches(regex));
}

}
