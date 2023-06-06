package sandro.week13.database.tables;

import java.util.Date;

public class Transaktion {

    private long rechnungsNummer;

    private double betrag;

    private Date datum;

    private long konto_ZielkontoNummerFK;
    private long konto_QuellkontoNummerFK;

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public long getKonto_QuellkontoNummerFK() {
        return konto_QuellkontoNummerFK;
    }

    public void setKonto_QuellkontoNummerFK(long konto_QuellkontoNummerFK) {
        this.konto_QuellkontoNummerFK = konto_QuellkontoNummerFK;
    }

    public long getKonto_ZielkontoNummerFK() {
        return konto_ZielkontoNummerFK;
    }

    public void setKonto_ZielkontoNummerFK(long konto_ZielkontoNummerFK) {
        this.konto_ZielkontoNummerFK = konto_ZielkontoNummerFK;
    }

    public long getRechnungsNummer() {
        return rechnungsNummer;
    }

    public void setRechnungsNummer(long rechnungsNummer) {
        this.rechnungsNummer = rechnungsNummer;
    }


    @Override
    public String toString() {
        return "Transaktion{" +
                "rechnungsNummer=" + rechnungsNummer +
                ", betrag=" + betrag +
                ", datum=" + datum +
                ", konto_ZielkontoNummerFK=" + konto_ZielkontoNummerFK +
                ", konto_QuellkontoNummerFK=" + konto_QuellkontoNummerFK +
                '}';
    }
}
