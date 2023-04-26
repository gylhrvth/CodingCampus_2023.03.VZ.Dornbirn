package joachim.week08.photoapparat;

public class Objectiv {

    private boolean on;

    public Objectiv(boolean on) {
        this.on = on;
    }
    public void check(){
        if(!on){
            System.err.println("Bitte füge das Objektiv hinzu");
        }else {
            System.out.println("Kamera bereit");
        }
    }

    @Override
    public String toString() {
        return "Objektiv Noname";
    }
}
