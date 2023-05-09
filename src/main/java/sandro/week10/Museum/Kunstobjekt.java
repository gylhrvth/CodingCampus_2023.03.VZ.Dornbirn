package sandro.week10.Museum;

public class Kunstobjekt extends Kunstwerk {
    private String thema;

    public Kunstobjekt(String name, String herkunft, int alter, double wert, String thema) {
        super(name, herkunft, alter, wert);
        this.thema = thema;
    }
}
