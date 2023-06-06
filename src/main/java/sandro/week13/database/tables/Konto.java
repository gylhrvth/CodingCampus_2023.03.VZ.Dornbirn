package sandro.week13.database.tables;

public class Konto {
    private long kontoNummer;

    private double kontostand;


    public long getKontoNummer() {
        return kontoNummer;
    }

    public void setKontoNummer(long kontoNummer) {
        this.kontoNummer = kontoNummer;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "kontoNummer=" + kontoNummer +
                ", kontostand=" + kontostand +
                '}';
    }
}
