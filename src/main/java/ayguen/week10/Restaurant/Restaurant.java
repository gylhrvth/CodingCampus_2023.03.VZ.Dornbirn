package ayguen.week10.Restaurant;

import java.util.Random;
import java.util.Vector;

public class Restaurant {
    static Random rand = new Random();
    private String name;
    Vector<Kellner> kellnerList;
    Vector<Raum> raumlist;

    private HauptKellner hauptkellner;
    private int count = 1;

    public Restaurant(String name, HauptKellner hauptKellner) {
        this.name = name;
        this.kellnerList = new Vector<>();
        this.hauptkellner = hauptKellner;
        this.raumlist = new Vector<>();

    }

    public void addRaum(Raum raum) {
        raumlist.add(raum);
    }

    public String getName() {
        return name;
    }

    public void printRestaurant() {
        System.out.println("Der Hauptkellner ist " + name);
        System.out.println("├── " + name);

    }

    public void bringGroup(Gruppe gruppe) {
        for (Raum r : raumlist) {
            for (Tisch t : r.tischlist) {
                if (!t.isBesetzt() && t.getSitzPlatz() >= gruppe.getAnzahlGuest()) {
                    System.out.println(hauptkellner.getName() + " bringt die gäste " + gruppe.getGruppe() + " zum  " + r.getRaumName() + " zum " + t.getName());
                    t.setBesetzt(true);
                    return;

                }

            }
        }
        System.out.println("Leider kein platz verpiss dich!! " + gruppe.getGruppe());
    }


    public void greetGroup(Gruppe gruppe) {
        System.out.println("Der Hauptkellner " + hauptkellner.getName() + " grüßt " + gruppe.getGruppe() + " mit " + gruppe.getAnzahlGuest() + " Leuten!");
    }

    public void tickSimulation() {

        if (rand.nextInt(100) < 10) {
            Gruppe gruppe = new Gruppe("Gruppe: " + count);
            count++;
            greetGroup(gruppe);
            bringGroup(gruppe);
            System.out.println();
        }
    }
}
