package joachim.week08.photoapparat;

public class Kamera {

    private Objectiv objectiv;
    private Memory memory;
    private String model;
    private String hersteller;
    private float megapixel;


    public Kamera(String hersteller, String model, int megapixel) {
        this.model = model;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
        this.objectiv = null;
        this.memory = null;

    }

    public void anschraubenObjektiv(Objectiv ob){
        objectiv = ob;
    }

    public void einsteckenSpeicherKarte(Memory mc){
        memory = mc;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public void setMegapixel(float megapixel) {
        this.megapixel = megapixel;
    }

    public void takeAPhoto() {
        if (objectiv == null){
            System.out.println("Objektiv wurde nicht angeschlossen. Kein Foto ist möglich");
            return;
        }
        if (memory == null){
            System.out.println("Speicherkarte fehlt. Kein Foto ist möglich");
            return;
        }

        System.out.println("Klick!!!");
        memory.speicher((int)(megapixel * 0.3));
    }

    public float getMegapixel() {
        return megapixel;
    }

    @Override
    public String toString() {
        return hersteller + " " + model + " with " + megapixel + " MP Sensor\n"
                + "    " + (objectiv != null?objectiv + " angeschlossen":"Ohne Objektiv") + "\n"
                + "    " + (memory != null?memory + " eingefügt":"Ohne Speicherkarte");
    }
}
