package mert.week13.bank;

public class Konto {
    private long kontoID;
    private double betrag;

    public double getBetrag() {
        return betrag;
    }

    public long getKontoID() {
        return kontoID;
    }

    public void setKontoID(long kontoID) {
        this.kontoID = kontoID;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    @Override
    public String toString() {
        return "Konto{" +
                "kontoID=" + kontoID +
                ", betrag=" + betrag +
                '}';
    }
}
