package ayguen.week09.Zoo;

public class ZooMain {

    public static void main(String[] args) {

        Zoo zoo = new Zoo("Tiergarten Dornbirn", 2022);

        Enclouser alpenwiese = new Enclouser("Alpenwiese");
        Enclouser ried = new Enclouser("Ried");
        Enclouser terrarium = new Enclouser("Terrarium (warm)");


        Tier rijska = new Tier("Rijska, Kuh");
        Tier garmond = new Tier("Garmond, Storh");
        Tier hugo = new Tier("Hugo, Storh");
        Tier idaxis = new Tier("Idaxis, Storh");


        Pfleger pfleger1 = new Pfleger("Aygün");
        Pfleger pfleger2 = new Pfleger("Mert");
        Pfleger pfleger3 = new Pfleger("Tuni");


        zoo.addEnclosure(alpenwiese);
        alpenwiese.addTier(rijska);
        alpenwiese.addPfleger(zoo, pfleger1);


        zoo.addEnclosure(ried);
        ried.addTier(garmond);
        ried.addTier(hugo);
        ried.addTier(idaxis);

        ried.addPfleger(zoo, pfleger1);
        ried.addPfleger(zoo, pfleger2);


        terrarium.addPfleger(zoo, pfleger2);

        zoo.addEnclosure(terrarium);


        ried.addPfleger(zoo, pfleger3);

        zoo.printStructure();

        System.out.println();
        for (int day = 1; day <= 5; day++) {
            zoo.simulateDay(day);
        }



    }


}
