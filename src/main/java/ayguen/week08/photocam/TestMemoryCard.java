package ayguen.week08.photocam;

public class TestMemoryCard {

    private String marke;
    private int speicherplatz;
    private int gebrauchteMb;

    public TestMemoryCard (String marke, int speicherplatz, int gebrauchteMb){

        this.marke = marke;
        this.speicherplatz = speicherplatz;
        this.gebrauchteMb = gebrauchteMb;
    }

    public String getMarke() {
        return marke;
    }
    public boolean save (int datenmaenge){
        if (datenmaenge > speicherplatz - gebrauchteMb){
            System.out.println("!!!SPEICHER VOLL");
            return false;
        }
        gebrauchteMb += datenmaenge;
        return true;
    }
    @Override
    public String toString() {
        return "Marke von Speicherkarte: " + marke + "\n" + "Speicherkapazität: " + speicherplatz + " mb" + "\n" + "gebrauchte kapazität :" + gebrauchteMb + "mb";
    }
}
