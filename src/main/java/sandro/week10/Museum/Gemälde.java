package sandro.week10.Museum;

public class Gemälde extends Kunstwerk {
    private String zeichenart;
    private String zeichenstil;

    public Gemälde(String name, String herkunft, int alter, double wert, String zeichenart, String zeichenstil) {
        super(name, herkunft, alter, wert);
        this.zeichenart = zeichenart;
        this.zeichenstil = zeichenstil;
    }
}
