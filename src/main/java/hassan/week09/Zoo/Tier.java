package hassan.week09.Zoo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tier {
    private String name;
    private String gattung;
    private HashMap<Futter,Double> futterbedarf;
    private boolean hungrig;
    private int gesundheit;
    private int maxGesundheit;
    private int biss;

    public Tier(String name, String gattung, int maxGesundheit, int biss){
        this.name = name;
        this.gattung = gattung;
        this.futterbedarf = new HashMap<>();
        this.hungrig = true;
        this.maxGesundheit = maxGesundheit;
        this.biss = biss;
    }
    public void fressen() {
        if (hungrig) {
            System.out.println(name + " frisst.");
            hungrig = false;
        } else {
            System.out.println(name + " hat keinen Hunger.");
        }
    }

    public int getGesundheit() {
        return gesundheit;
    }

    public void setGesundheit(int gesundheit) {
        this.gesundheit = gesundheit;
    }

    public int getMaxGesundheit() {
        return maxGesundheit;
    }

    public int getBiss() {
        return biss;
    }
    public void reduziereGesundheit(int biss) {
        gesundheit = Math.max(0, gesundheit - biss);
        if (gesundheit == 0) {
            System.out.println(name + " ist gestorben.");
        }
    }
    public boolean kannBeissen() {
        return (Math.random() < 0.4) && (gesundheit > 0);
    }
    public void beissen(Tier opfer) {
        opfer.reduziereGesundheit(biss);
        System.out.println(name + " hat " + opfer.getName() + " gebissen.");
    }
    public boolean isTot() {
        return gesundheit <= 0;
    }
    public void addFutterbedarf(Futter futter, double menge) {
        futterbedarf.put(futter, menge);
    }
    public String getName(){
        return name;
    }

    public String getGattung() {
        return gattung;
    }
    public HashMap<Futter, Double> getFutterbedarf() {
        return futterbedarf;
    }
    public static void simulate(List<Tier> tiere) {
        // Schleife über alle Tiere
        for (Tier tier : tiere) {
            // 40% Wahrscheinlichkeit, dass das Tier einen Nachbarn beißt
            if (Math.random() < 0.4) {
                // Nachbarn suchen
                List<Tier> nachbarn = new ArrayList<>();
                for (Tier andererTier : tiere) {
                    if (andererTier != tier && andererTier.getGattung().equals(tier.getGattung())) {
                        nachbarn.add(andererTier);
                    }
                }

                // Einen zufälligen Nachbarn auswählen und beißen
                if (!nachbarn.isEmpty()) {
                    Tier nachbar = nachbarn.get((int) (Math.random() * nachbarn.size()));
                    System.out.println(tier.getName() + " beißt " + nachbar.getName() + ".");
                    if (nachbar.getGesundheit() > 0) {
                        nachbar.setGesundheit(nachbar.getGesundheit() - tier.getBiss());
                        System.out.println(nachbar.getName() + " hat jetzt " + nachbar.getGesundheit() + " Gesundheit.");
                    }
                }
            }

            // Tier prüfen, ob tot
            if (tier.isTot()) {
                System.out.println(tier.getName() + " ist tot.");
            }
        }

        // Tote Tiere entfernen
        tiere.removeIf(Tier::isTot);
    }

    public void printStruktur(){
        System.out.println("│   │   ├── " + name + ", " + gattung);
    }
}
