package sandro.week10.Museum;

public class Zeichen extends Kunstwerk {
    private String matrial;

    public Zeichen (String name, String herkunft, int alter, double wert, String matrial){
        super (name,herkunft,alter,wert);
        this.matrial = matrial;
    }


}
