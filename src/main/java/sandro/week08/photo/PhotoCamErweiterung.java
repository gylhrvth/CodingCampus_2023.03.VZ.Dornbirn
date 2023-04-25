package sandro.week08.photo;

import java.util.Date;

public class PhotoCamErweiterung {
    private int objektive;
    private String model;
    private String hersteller;
    private int megapixel;
    private Date datum;
    private double size;
    private int memory;
    private int pics;
    private MemoryCard memoryCard;


    public PhotoCamErweiterung(String hersteller, String model, int megapixel, double size) {
        this.objektive = 0;
        this.model = model;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
        this.datum = new Date(); // new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        this.size = size * megapixel;
        this.memory = 0;
        this.pics = 0;
        this.memoryCard = null;
    }
//    public int getPics (int pics){
//        return this.pics = pics;
//    }
    public void setPicsCounter(int pics) {
        this.pics = pics;
    }

    public void setObjektive(int objektive) {
        this.objektive = objektive;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public boolean insertMemoryCard(MemoryCard mc){
        if (this.memoryCard != null){
            System.out.println("Es gibt schon eine Karte drin.");
            return false;
        }
        this.memoryCard = mc;
        return true;
    }

    public MemoryCard removeMemoryCard(){
        MemoryCard mc = this.memoryCard;
        this.memoryCard = null;
        return mc;
    }



    public void takePhoto(){
        if (memoryCard == null) {
            System.out.println("Take photo without memory card is not allowed.");
            return;
        }
        System.out.println("Klick!!!");
        memoryCard.saveData(10);
    }



    @Override
    public String toString() {
        return "PhotoCam " + hersteller + " " + model + "\n"
                + (memoryCard != null ?"with " + memoryCard:"without memory card");

    }
}
