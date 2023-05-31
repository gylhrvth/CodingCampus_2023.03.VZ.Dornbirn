package hassan.week12.Car;

public class Car {
    public enum Antriebstart {BENZIN, DIESEL, GAS, STROM}

    private String hersteller;
    private String modell;
    private int kW;
    private double tankinhalt;
    private Antriebstart antriebstart;
    private double gewicht;
    int drivenDistance;

    public Car(String hersteller, String modell, int kW, double tankinhalt, Antriebstart antriebstart, double gewicht) {
        this.hersteller = hersteller;
        this.modell = modell;
        this.kW = kW;
        this.tankinhalt = tankinhalt;
        this.antriebstart = antriebstart;
        this.gewicht = gewicht;
        this.drivenDistance = 0;
    }

    public String getHersteller() {
        return hersteller;
    }

    public int getkW() {
        return kW;
    }

    public double getTankinhalt() {
        return tankinhalt;
    }

    public double getGewicht() {
        return gewicht;
    }

    public String getModell() {
        return modell;
    }

    public int drive(int kilometer) {
        double verbrauch = kilometer / (kW * gewicht / 100.0);
        if (verbrauch <= tankinhalt) {
            tankinhalt -= verbrauch;
            drivenDistance += kilometer;
            System.out.println("Das Auto ist " + kilometer + " km gefahren.");
            return kilometer;
        } else {
            double gefahreneStrecke = tankinhalt * (kW * gewicht / 100.0);
            tankinhalt = 0;
            drivenDistance += gefahreneStrecke;
            System.out.println("Das Auto ist nur " + gefahreneStrecke + " km gefahren, da der Tank leer ist.");
            return (int) gefahreneStrecke;
        }
    }

    public void refillTank(double fuelAmount) {
        tankinhalt += fuelAmount;
        System.out.println("Der Tank wurde um " + fuelAmount + " Liter aufgefüllt. Aktueller Tankinhalt: " + tankinhalt + " Liter");
    }

    public int getDrivenDistance() {
        return drivenDistance;
    }
}
