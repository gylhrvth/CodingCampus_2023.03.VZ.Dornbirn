package joachim.week08.photoapparat;

public class PhotoapparatEinstellungen {

    private int brennweite;
    private String model;
    private String hersteller;
    private int megapixel;

    public PhotoapparatEinstellungen(int brennweite, String model, String hersteller, int megapixel) {
        this.brennweite = brennweite;
        this.model = model;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
    }

    public void setStatBrennweite(int brennweite) {
        this.brennweite = brennweite;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public void setMegapixel(int megapixel) {
        this.megapixel = megapixel;
    }

    @Override
    public String toString() {
        return "Brennweite: " + brennweite  + "\nModel: " + model + "\nHersteller: " + hersteller + "\nMegapixel: " + megapixel;
    }
}
