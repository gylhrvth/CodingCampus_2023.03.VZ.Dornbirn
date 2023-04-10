package eric.osterFerien.StringManipulation;

public class Aufgabe1 {
    public static void main(String[] args) {

        String stringToReplace = "Heute der 19.10.2021 wird ein sehr guter Tag. Zwar gibt es sowas wie einen Test, den 14 Leute schreiben, aber das ist doch egal!";
//        String replaceAll = stringToReplace.replaceAll("[a-c]+[f-z]+[1-5]+[4-9]", "X" + "Y" + "a" + "b");
//        System.out.println(replaceAll);


        String replaceAll = stringToReplace
                .replaceAll("[a-c]", "X")
                .replaceAll("[f-z]", "Y")
                .replaceAll("[1-5]", "a")
                .replaceAll("[4-9]", "b");

        System.out.println(replaceAll);
    }
}
