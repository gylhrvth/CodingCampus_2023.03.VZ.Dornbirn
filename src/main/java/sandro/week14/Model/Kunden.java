package sandro.week14.Model;

import sandro.week10.Geometry.inter.Haus;

import java.util.HashMap;

public class Kunden {
    private int kundenNummer;
    private String name;

    HashMap<Konto, String> kontos;

    public Kunden (int kundenNummer, String name){
        this.kundenNummer = kundenNummer;
        this.name = name;
        kontos = new HashMap<>();
    }

    public void addKontoRolle(Konto konto, String rolle){
        kontos.put(konto, rolle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKundenNummer() {
        return kundenNummer;
    }

    @Override
    public String toString() {
        return "Kunden{" +
                "kundenNummer=" + kundenNummer +
                ", name='" + name + '\'' +
                ", kontos=" + kontos +
                '}';
    }
}
