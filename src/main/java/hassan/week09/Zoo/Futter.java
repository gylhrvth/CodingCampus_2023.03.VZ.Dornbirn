package hassan.week09.Zoo;

import java.util.List;

public class Futter {
    private String name;
    private String einheit;
    private double preis;
    public Futter(String name, String einheit, double preis){
        this.name = name;
        this.einheit = einheit;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public String getEinheit() {
        return einheit;
    }

    public double getPreis() {
        return preis;
    }

    public void futterbedarf(List<Tier> tiere){
        double gesamtbedarf = 0.0;
        for (Tier tier : tiere) {
            for (Futter futter : tier.getFutterbedarf().keySet()) {
                double menge = tier.getFutterbedarf().get(futter);
                double kosten = menge * futter.getPreis();
                System.out.println(tier.getName() + " benötigt " + menge + " " + futter.getEinheit()
                        + " " + futter.getName() + " pro Tag. Kosten: " + kosten + "$");
                gesamtbedarf += kosten;
            }
        }
        System.out.println("Kosten pro Tag: " + gesamtbedarf + " $$$$$");
    }

    @Override
    public String toString(){
        return name + " (" + einheit + ") - " + preis + "$/" + einheit;
    }
}
