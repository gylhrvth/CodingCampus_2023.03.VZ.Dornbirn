package mert.week09;

import java.util.Arrays;

public class ZooMain {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Tiergarten Dornbirn", 2023);

        Gehege alpenwiese = new Gehege("Alpenwiese");
        Gehege ried = new Gehege("Ried");
        Gehege terrarium = new Gehege("Terrarium (warm)");

        Tier kuh = new Tier("Rijska", "Kuh");
        Tier storh = new Tier("Garmond", "Storh");
        Tier storh2 = new Tier("Hugo", "Storh");
        Tier storh3 = new Tier("Idaxis", "Storh");

        Pfleger pfleger = new Pfleger("Mert");
        Pfleger pfleger1 = new Pfleger("Ayguen");




        zoo.addGehege(alpenwiese);
        zoo.addGehege(ried);
        zoo.addGehege(terrarium);


        alpenwiese.addTiere(kuh);
        ried.addTiere(storh);
        ried.addTiere(storh2);
        ried.addTiere(storh3);

        zoo.addPfleger(pfleger);
        zoo.addPfleger(pfleger1);

        pfleger.addGehegeList(ried);
        pfleger1.addGehegeList(alpenwiese);








        zoo.printZoo();

    }
}
