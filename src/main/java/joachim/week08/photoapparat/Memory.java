package joachim.week08.photoapparat;

public class Memory {
    private int verwendeteSpeicher;
    private int kapazitaet;
    private String model;
    private String hersteller;
    private int photos;

    public Memory(String hersteller, String model, int kapazitaet, int photos, int verwendeteSpeicher) {
        this.hersteller = hersteller;
        this.model = model;
        this.kapazitaet = kapazitaet;
        this.photos = photos;
        this.verwendeteSpeicher = verwendeteSpeicher;
    }

    public void speicher(int groesse){
        if (groesse > kapazitaet - verwendeteSpeicher){
            System.out.println("!!! Karte Voll !!!");
            return;
        }

        ++photos;
        verwendeteSpeicher += groesse;
    }

    public String getModel() {
        return model;
    }

    public String getHersteller() {
        return hersteller;
    }

    @Override
    public String toString() {
        return  hersteller +" " + model + " (Speicher " + verwendeteSpeicher + "/" + kapazitaet + " MByte)";
    }
}

