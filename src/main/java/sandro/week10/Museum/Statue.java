package sandro.week10.Museum;

public class Statue extends Kunstwerk {
    private String material;
    private String figure;

    public Statue(String name, String herkunft, int alter, double wert, String material, String figure) {
        super(name, herkunft, alter, wert);
        this.material = material;
        this.figure = figure;
    }
}
