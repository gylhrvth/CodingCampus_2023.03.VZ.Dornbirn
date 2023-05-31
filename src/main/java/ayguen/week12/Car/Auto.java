package ayguen.week12.Car;

public class Auto {

    private String hersteller;
    private String modell;
    private int ps;
    private int tankInhalt;
    private String antriebsart;
    private int gewicht;
    private double durchschnittverbrauch;

    public Auto(String hersteller, String modell, int ps, int tankInhalt, String antriebsart, int gewicht, double durchschnittverbrauch) {

        this.hersteller = hersteller;
        this.modell = modell;
        this.ps = ps;
        this.tankInhalt = tankInhalt;
        this.antriebsart = antriebsart;
        this.gewicht = gewicht;
        this.durchschnittverbrauch = durchschnittverbrauch;

    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public int getTankInhalt() {
        return tankInhalt;
    }

    public void setTankInhalt(int tankInhalt) {
        this.tankInhalt = tankInhalt;
    }

    public String getAntriebsart() {
        return antriebsart;
    }

    public void setAntriebsart(String antriebsart) {
        this.antriebsart = antriebsart;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public double getDurchschnittverbrauch() {
        return durchschnittverbrauch;
    }

    public void setDurchschnittverbrauch(double durchschnittverbrauch) {
        this.durchschnittverbrauch = durchschnittverbrauch;
    }

    public int drive2(int kilometer) {
        int reichweite;
        reichweite = (int) ((tankInhalt / durchschnittverbrauch) * 100);
        System.out.println("reichweite =" + reichweite);


        while (reichweite > kilometer) {
            reichweite--;

            System.out.println("Reichweite= " + reichweite);



            if (reichweite == kilometer + 100) {
                System.out.println("reserve");
            } else if (reichweite == kilometer) {
                System.out.println("tank leer");
                tanken(500, reichweite);
            }
        }

        return kilometer;
    }



    public void tanken(int menge, int reichweite) {
        reichweite += menge;
        System.out.println(reichweite);

//        System.out.println("Das auto wird getankt !");
//        menge -= tankInhalt;
//        System.out.println(menge);
//        if (tankInhalt > 30) {
//            System.out.println("das auto wurde getankt mit " + menge + " Liter");
//    }


    }


    @Override
    public String toString() {
        return "Auto{" +
                "hersteller='" + hersteller + '\'' +
                ", modell='" + modell + '\'' +
                ", ps=" + ps +
                ", tankInhalt=" + tankInhalt +
                ", antriebsart='" + antriebsart + '\'' +
                ", gewicht=" + gewicht +
                '}';
    }

    public void printCar() {
        System.out.println("Hersteller: " + hersteller + "\n" + "Modell: " + modell + "\n" + "ps: " + ps + "\n" + "tankinhalt: " + tankInhalt + "\n" + "Antriebsart: " + antriebsart + "\n" + "kg: " + gewicht + "\n" + "Durchschnittsverbrauch : " + durchschnittverbrauch);
    }
}
