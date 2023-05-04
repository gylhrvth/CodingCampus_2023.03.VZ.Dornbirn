package hassan.week09.Zoo;

import java.util.ArrayList;
import java.util.List;

public class ZooMain {
    public static void main(String[] args) {
        ZooData zoo = new ZooData("Tiergarten Dornbirn", 2022);

        //Gehege
        Gehege alpenwiese = new Gehege("Alpenwiese");
        zoo.addGehege(alpenwiese);
        Gehege ried = new Gehege("Ried");
        zoo.addGehege(ried);
        Gehege terrarium = new Gehege("Terrarium");
        zoo.addGehege(terrarium);


        //Tiere
        Tier rijska = new Tier("Rijska", "Kuh",100,20);
        //zoo.addTierToGehege(rijska, alpenwiese);
        alpenwiese.addTier(rijska);
        Tier garmond = new Tier("Garmond", "Stroh",100,25);
        ried.addTier(garmond);
        alpenwiese.addTier(garmond);
        Tier hugo = new Tier("Hugo", "Stroh",100,10);
        ried.addTier(hugo);
        Tier idaxis = new Tier("Idaxis", "Stroh",150,50);
        ried.addTier(idaxis);
        Tier fisch = new Tier("Goldfisch","fisch",20,1);
        terrarium.addTier(fisch);


        //Futter
        Futter gras = new Futter("Gras", "kg", 15);
        Futter fleisch = new Futter("Fleisch", "kg", 2.50);
        Futter insekten = new Futter("Insekten", "g", 0.09);
        Futter heu = new Futter("Heu", "kg", 10);

        // futterbedarf
        rijska.addFutterbedarf(gras, 15);
        garmond.addFutterbedarf(insekten, 150);
        hugo.addFutterbedarf(insekten, 300);
        idaxis.addFutterbedarf(insekten,225);

        List<Tier> tiere = new ArrayList<>();
        tiere.addAll(alpenwiese.getTiere());
        tiere.addAll(ried.getTiere());
        tiere.addAll(terrarium.getTiere());

        //pfleger
        Pfleger pfleger1 = new Pfleger("Eric");
        Pfleger pfleger2 = new Pfleger("Boso");
        Pfleger pfleger3 = new Pfleger("Hassan");

        zoo.addPfleger(pfleger1);
        zoo.addPfleger(pfleger2);
        zoo.addPfleger(pfleger3);

        alpenwiese.addPflegerToGehege(pfleger1);
        ried.addPflegerToGehege(pfleger3);
        terrarium.addPflegerToGehege(pfleger2);

        zoo.printPflegerListe();
        System.out.println();


        zoo.printStruktur();


        System.out.println();
        //System.out.println("FUTTERBEDARF");
       // gras.futterbedarf(tiere);


        System.out.println("+++++++++++");
        System.out.println("Simulation");

        zoo.simulate();

    }




}


