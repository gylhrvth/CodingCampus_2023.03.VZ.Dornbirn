package mert.week09;

public class ZooMain {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Tiergarten Dornbirn", 2023);

        Gehege alpenwiese = new Gehege("Alpenwiese");
        Gehege ried = new Gehege("Ried");
        Gehege terrarium = new Gehege("Terrarium (warm)");

        Tier kuh = new Tier("Rijska", "Kuh", 100, 110);
        Tier kuh1 = new Tier("Muh", "Kuh", 100, 110);
        Tier storh = new Tier("Garmond", "Storh", 100, 40);
        Tier storh2 = new Tier("Hugo", "Storh", 100, 40);
        Tier storh3 = new Tier("Idaxis", "Storh", 100,40);
        Tier fisch = new Tier("Fufu", "Fisch", 100,40);

        Pfleger pfleger = new Pfleger("Mert");
        Pfleger pfleger1 = new Pfleger("Ayguen");



        zoo.addGehege(alpenwiese);
        zoo.addGehege(ried);
        zoo.addGehege(terrarium);


        alpenwiese.addTiere(kuh);
        alpenwiese.addTiere(kuh1);
        ried.addTiere(storh);
        ried.addTiere(storh2);
        ried.addTiere(storh3);
        terrarium.addTiere(fisch);

        zoo.addPfleger(pfleger);
        zoo.addPfleger(pfleger1);


        pfleger.addGehegeList(ried);
        pfleger1.addGehegeList(terrarium);
        pfleger1.addGehegeList(alpenwiese);


        zoo.printZoo();
        System.out.println();


        for (int tage = 1; tage <= 5; tage++) {
            zoo.simulateTage(tage);

        }
    }
}
