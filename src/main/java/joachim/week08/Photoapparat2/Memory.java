package joachim.week08.Photoapparat2;

public class Memory {
    private String hersteller;
    private String model;
    private int speicher;
    private int besetzt;


    public Memory(String hersteller, String model, int speicher,int bestetzt){
        this.hersteller = hersteller;
        this.model = model;
        this.speicher=speicher;
        this.besetzt = bestetzt;

        }

    public int getFreeMemory(){
        return speicher - besetzt;
    }

    @Override
    public String toString() {
        return hersteller + "  " + model + " with " + speicher/(1024*1024) + "GB";
    }
}
