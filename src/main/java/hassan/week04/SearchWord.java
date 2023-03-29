package hassan.week04;

import data.Texts;

public class SearchWord {
    public static void main(String[] args) {
        String text = Texts.HESSE;


        String searchString = "Hesse";

        int count = 0;
        int index = text.indexOf(searchString);
        while (index!= -1){
            count++;
            System.out.println("Das Wort Hesse gefunden an Stelle" + index);
            index = text.indexOf(searchString,index + 1);
        }
        System.out.println("Das Wort Hesse kommt "+ count + "Mal im text vor");
    }



}
