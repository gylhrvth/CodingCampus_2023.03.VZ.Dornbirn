package mert.week08.Foto;

public class Fotoapparat {
    private int brennweite;
    private String model;
    private String hersteller;
    private int megapixel;
    private SpeicherKarte speicherkarte;
    private String linse;


    Fotoapparat(String model, String hersteller, int megapixel) {
        this.brennweite = 50;
        this.model = model;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
        this.speicherkarte = null;
    }

    public boolean speicherEinfuegen(SpeicherKarte sk) {
        if (this.speicherkarte != null) {
            System.out.println("es befindet sich eine speicherkarte");
            return false;
        }
        this.speicherkarte = sk;
        System.out.println(speicherkarte);
        return true;


    }


    public void takePhoto() {
        System.out.println("Foto aufgenommen!!");
    }
}
