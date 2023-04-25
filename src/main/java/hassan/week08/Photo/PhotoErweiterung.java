package hassan.week08.Photo;

import sandro.week08.photo.Objective;

public class PhotoErweiterung {
    private String objektive;
    private String model;
    private String hersteller;
    private int megapixel;
    private double size;
    private int memory;
    private int anzahlBilder;
    private MemoryCard memoryCard;
    private Objektiv lens;


    public PhotoErweiterung(String hersteller,String model,int megapixel,double size){
        this.model = model;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
        this.size = size * megapixel;
        this.memory = 10000;
        this.anzahlBilder = 0;
        this.lens = null;
        this.memoryCard = null;
    }

    public boolean mountObjective(Objektiv obj) {
        if (this.lens != null) {
            System.out.println("Eine Linse ist bereits montiert");
        }
        this.lens = obj;
        System.out.println("Linse " +this.lens );
        return true;
    }
    public Objektiv dismountObjective() {
        Objektiv obj = this.lens;
        System.out.println("Linse " + this.lens + " wurde montiert");
        this.lens = null;
        return obj;
    }
    public boolean insertMemoryCard(MemoryCard mc) {
        if (this.memoryCard != null) {
            System.out.println("es befindet sich schon eine memory card drinnen");
            return false;
        }
        this.memoryCard = mc;
        System.out.println(this.memoryCard + " ist jetzt drinnen");
        return true;
    }
    public MemoryCard removeMemoryCard() {
        MemoryCard mc = this.memoryCard;
        System.out.println("Memory Card " + this.memoryCard + " ist entfert worden");
        this.memoryCard = null;
        return mc;
    }


    @Override
    public String toString() {
        return "PhotoCam " + hersteller + " " + model + "\n"
                + (memoryCard != null ? "with " + memoryCard : "without memory card")
                + "\n"
                + (lens != null ? "with " + lens : "without objective");

    }

    public void setObjektive(String objektive){
        this.objektive = objektive;
    }
    public void setMemory(int memory){
        this.memory = memory;
    }

    public void setAnzahlBilder(int anzahlBilder){
        this.anzahlBilder = anzahlBilder;
    }

    public int getVerfuegbarerSpeicherplatz(){
        return (int)(this.memory - (this.anzahlBilder * this.size));
    }
    public void takePhoto() {
        if (memoryCard == null) {
            System.out.println("Take photo without memory card is not allowed.");
            return;
        } else if (this.lens == null) {
            System.out.println("Please mount an Objectiv before you take a picture.");
            return;
        }
        System.out.println("Klick!!!");
        memoryCard.saveData((int)this.size);
    }


    public Objektiv getLens() {
        return lens;
    }

    public void setLens(Objektiv lens) {
        this.lens = lens;
    }
}
