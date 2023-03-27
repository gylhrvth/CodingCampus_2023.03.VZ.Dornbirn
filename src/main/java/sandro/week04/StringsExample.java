package sandro.week04;

public class StringsExample {
    public static void main(String[] args) {

        String[] names = new String[]{"Joachim", "Mert", "Eric", "Marie Christine", "Benjamin", "Sandro", "Aygün", "Hassan", "Svitlana", "Lukas", "Gyula" };

        String leer = " ";
        String name = "Sandro";
//        String nameFromArr = names[6];


        System.out.println(name);
//        System.out.println(nameFromArr);
//
//        System.out.printf("]>%s<[\n", name);            //%s = ? bedeutung
//        System.out.printf("]>%20s<[\n", nameFromArr);       //rechts bündig
//        System.out.printf("]>%-20s<[\n", nameFromArr);      //links bündig
//                                                        //zentriert auf eine Zeilenlänge von 20 z.B?
//
//        System.out.println(nameFromArr.length());
//        System.out.println((20 - nameFromArr.length()) / 2);
//        System.out.println(20 - ((20 - nameFromArr.length()) / 2) - nameFromArr.length());

        int maxLen = 0;
        for (String nameFromArr: names) {
            if (nameFromArr.length() > maxLen){
                maxLen = nameFromArr.length();
            }
        }

        for (String nameFromArr: names) {
            System.out.printf(
                    "] %s%s%s [\n",
                    " ".repeat((maxLen - nameFromArr.length()) / 2),
                    nameFromArr,
                    " ".repeat(maxLen - ((maxLen - nameFromArr.length()) / 2) - nameFromArr.length()));
        }

        System.out.println();

    }





}
