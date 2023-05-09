package ayguen.week09.Zoo;

import lukas.week03.day4.Colors;

import java.awt.*;
import java.util.Random;

public class ZooMain {

    public static void main(String[] args) {

        Zoo zoo = new Zoo("Tiergarten Dornbirn", 2022);

        Enclouser alpenwiese = new Enclouser("Alpenwiese");
        Enclouser ried = new Enclouser("Ried");
        Enclouser terrarium = new Enclouser("Terrarium (warm)");

        Tier rijska = new Tier("Risjka", "Kuh",100,74);

        Tier garmond = new Tier("Garmond", "Storh",80, 80);
        Tier hugo = new Tier("Hugo", "Storh", 50, 40);
        Tier idaxis = new Tier("Idaxis", "Storh", 80, 100);

        Tier Aboubakar = new Tier("Abubakar", "Schwein", 90, 30);

        Pfleger pfleger1 = new Pfleger("Aygün");
        Pfleger pfleger2 = new Pfleger("Mert");
        Pfleger pfleger3 = new Pfleger("Tuni");


        zoo.addEnclosure(alpenwiese);
        alpenwiese.addTier(rijska);
        alpenwiese.addPfleger(zoo, pfleger1);
        System.out.println();


        zoo.addEnclosure(ried);
        ried.addTier(garmond);
        ried.addTier(hugo);
        ried.addTier(idaxis);
        ried.addPfleger(zoo, pfleger2);

        terrarium.addPfleger(zoo, pfleger3);
        terrarium.addTier(Aboubakar);
        zoo.addEnclosure(terrarium);


        zoo.printStructure();

        System.out.println();
        for (int day = 1; day <= 5; day++) {
            zoo.simulateDay(day);
        }
        zoo.printStructure();



        //BEOBACHTEN

    }
}
