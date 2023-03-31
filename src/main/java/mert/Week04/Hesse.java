package mert.Week04;

import data.Texts;

public class Hesse {
    public static void main(String[] args) {
        String text = Texts.HESSE;
        String word = "Hesse";
        System.out.println(text);

        int count = 0;
        int search = text.indexOf(word);
        while (search != -1) {

            count++;
            System.out.println("Hesse kommt an der Stelle " + search + " vor");
            search = text.indexOf(word, search + 1);
        }
        System.out.println("Das Wort Hesse kommt insgesamt " + count + " mal vor");


    }

}


