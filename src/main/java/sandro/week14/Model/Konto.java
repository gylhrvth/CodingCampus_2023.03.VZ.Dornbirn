package sandro.week14.Model;

public class Konto {
    private int kontoNummer;
    private int kontostand;


    public Konto (int kontoNummer, int kontostand){
        this.kontoNummer = kontoNummer;
        this.kontostand = kontostand;
    }

    public int getKontoNummer() {
        return kontoNummer;
    }

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
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
