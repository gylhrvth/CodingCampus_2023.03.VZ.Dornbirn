package sandro.week04;

import data.Texts;

public class StringSucheHesse {
    public static void main(String[] args) {
        String text = Texts.HESSE;
        System.out.println(text);

        String search = "Hesse";

        int count = 0;
        int indexHesse = text.indexOf(search);
        while (indexHesse != -1) {

            count++;
            System.out.println("Hesse kommt beim Index " + indexHesse + " vor");
            indexHesse = text.indexOf(search, indexHesse + 1);
        }
        System.out.println("Hesse kommt insgesamt" + count + "vor");


    }
}
