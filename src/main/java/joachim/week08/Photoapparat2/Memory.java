package joachim.week08.Photoapparat2;

public class Memory {
    private String hersteller;
    private String model;
    private int speicher;
    private int besetzt;


    public Memory(String hersteller, String model, int speicher,int besetzt){
        this.hersteller = hersteller;
        this.model = model;
        this.speicher=speicher;
        this.besetzt = besetzt;

        }
    public void saveAPhoto(int fileSize) {
        if (fileSize > speicher - besetzt){
            System.out.println("!!! Speicher Voll !!!");
            return;
        }

        besetzt += fileSize;
    }

    public int getFreeMemory(){
        return speicher - besetzt;
    }



    @Override
    public String toString() {
        return hersteller + "  " + model + " with " + (double)speicher/(1024*1024) + "GB";
    }
}
