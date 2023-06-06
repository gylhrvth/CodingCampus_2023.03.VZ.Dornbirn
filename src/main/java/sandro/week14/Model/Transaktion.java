package sandro.week14.Model;

import java.math.BigDecimal;
import java.util.Date;

public class Transaktion {

    private int rechnungsNummer;

    private BigDecimal betrag;

    private Date datum;

    private Konto zielKonto;
    private Konto quelleKonto;

    public Transaktion(int rechnungsNummer, BigDecimal betrag, Date datum, Konto zielKonto, Konto quelleKonto) {
        this.rechnungsNummer = rechnungsNummer;
        this.betrag = betrag;
        this.datum = datum;
        this.zielKonto = zielKonto;
        this.quelleKonto = quelleKonto;
    }


    @Override
    public String toString() {
        return "Transaktion{" +
                "rechnungsNummer=" + rechnungsNummer +
                ", betrag=" + betrag +
                ", datum=" + datum +
                ", zielKonto=" + zielKonto +
                ", quelleKonto=" + quelleKonto +
                '}';
    }
}
