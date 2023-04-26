package ayguen.week08.photocam;

public class PhotoCamera {

    private int objektiv;
    private String model;
    private String hersteller;
    private double megapixel;

    private MemoryCard memoryCard;


    public PhotoCamera(String hersteller, String model, double megapixel, int objektiv) {
        this.objektiv = objektiv;
        this.model = model;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
        this.memoryCard = null;
    }

    public double getMegapixel() {
        return megapixel;
    }

    public int getObjektiv() {
        return objektiv;
    }


    public String getHersteller() {
        return hersteller;
    }

    public String getModel() {
        return model;
    }

    public boolean takePhoto(){
        System.out.println("Klick!!!");
        return memoryCard.saveData((int)(megapixel * 0.3));

    }

    public void insertMemoryCard(MemoryCard mc){
        if (mc == null){
            System.out.println("Nix kann man nicht einfügen");
            return;
        }
        if (this.memoryCard != null){
            System.out.println("Es ist schon ein MemoryCard in Slot");
            return;
        }
        this.memoryCard = mc;
        System.out.println("Memory Card " + mc.getModel() + " wurde erfolgreich zugefügt");
    }

    public MemoryCard removeMemoryCard(){
        if (memoryCard == null){
            System.out.println("Es gibt kein Memory Card mehr im Slot");
        }
        MemoryCard mc = this.memoryCard;
        this.memoryCard = null;
        return mc;
    }


    public String toString() {
        return hersteller + " " + model + " with " + megapixel + " MP\n"
                + "    " + (memoryCard != null?"mit " + memoryCard.getModel():"Ohne Speicherkarte");
    }

}


