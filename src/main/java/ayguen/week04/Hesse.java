package ayguen.week04;

import data.Texts;

import java.lang.module.FindException;

public class Hesse {


    public static void main(String[] args) {


        String text = Texts.HESSE;

        String suchtext = "Hesse";

        int count = 0;
        int index = text.indexOf(suchtext);
        while (index != -1) {
            count++;
            System.out.println("Hesse wurde an der stelle " + index + "gefunden.");
            index = text.indexOf(suchtext, index + 1);


        }

        System.out.println("Hesse kommt: " + count + " mal vor.");


    }
}

