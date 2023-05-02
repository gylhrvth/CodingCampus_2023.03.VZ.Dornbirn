package mert.week08.Foto;

public class SpeicherKarte {
    private int kapazitaet;
    private int benutzteMb;


    public SpeicherKarte (int kapazitaet, int benutzteMb){
        this.kapazitaet = kapazitaet;
        this.benutzteMb = benutzteMb;
    }
    public void speichern (int size){
        benutzteMb += size;
    }
    public int speicherRechnen (){
        return benutzteMb - kapazitaet;
    }
    public int verbrauchterSpeicher(){
        return benutzteMb;
    }

    @Override
    public String toString() {
        return "Speicher: " + speicherRechnen() + "\n" +
                "Verfügbar: " + verbrauchterSpeicher();
    }
}
