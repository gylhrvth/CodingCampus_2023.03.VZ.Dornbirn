package mert.week10.restaurant;

import lukas.week03.day4.Colors;

import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Restaurant {
    static Random random = new Random();
    private static int countGruppe = 1;
    private String name;

    private List<Raum> raumlist;
    private List<Kellner> kellnerList;
    private HauptKellner hauptKellner;

    public Restaurant(String name, HauptKellner hauptKellner) {
        this.name = name;
        this.raumlist = new Vector<>();
        this.kellnerList = new Vector<>();
        this.hauptKellner = hauptKellner;
    }

    public void addRaum(Raum raum) {
        if (!raumlist.contains(raum)) {
            raumlist.add(raum);
        }
    }

    public void addKellner(Kellner kellner) {
        kellnerList.add(kellner);
    }


    public void printRestaurant() {
        System.out.println("|-- Restaurant " + name);

        for (Raum raum : raumlist) {
            raum.printRestaurant();
        }
        System.out.println();
        hauptKellner.printHauptKellner();

        System.out.println();
        for (Kellner kellner : kellnerList) {
            kellner.printRestaurant();

        }
    }

    public void sitzenTisch(Kunde kunde) {
        for (Raum raum : raumlist) {
            for (Tisch tisch : raum.tischList) {
                if (!tisch.isBesetzt() && tisch.getSitzPlatz() >= kunde.getAnzahlKunden()) {
                    tisch.setBesetzt(true);
                    System.out.println(hauptKellner.getName() + " bringt die gäste " + kunde.getGruppe() + " zum " + raum.getName() + " zum : " + tisch.getName());

                    return;
                }

            }
        }
        System.out.println(Colors.COLORS[1] + "Leider ist kein freier Tisch verfügbar fuer: " + kunde.getGruppe() + Colors.RESET);

    }


    public void gibtSpeiseKarte(Kunde kunde) {
        for (Raum raum : raumlist) {
            for (Tisch tisch : raum.tischList) {
                if (!tisch.isBesetzt()) {
                }
            }
        }
        System.out.println(hauptKellner.getName() + " gibt der " + kunde.getGruppe() + " die Speisekarte");

    }

    private void eintreten(Kunde kunde) {
        System.out.println(hauptKellner.getName() + " grüsst die Gäste " + kunde.getGruppe() + "    Anzahl kunden:  " + kunde.getAnzahlKunden());
    }


    public void tickSimulation() {
        if (random.nextInt(100) < 10) {
            Kunde neu = new Kunde("Gruppe " + countGruppe);
            ++countGruppe;

            eintreten(neu);
            sitzenTisch(neu);
            gibtSpeiseKarte(neu);
            System.out.println();


        }
    }
}


