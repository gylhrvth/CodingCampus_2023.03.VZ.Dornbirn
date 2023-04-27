package ayguen.week08.photocam;

public class TestPhotoCamera {
    //Hersteller
    //Model
    //Pixel
    private String hersteller;
    private String marke;
    private double pixel;
    private TestMemoryCard memoryCard;

    public TestPhotoCamera(String hersteller, String marke, double pixel) {
        this.hersteller = hersteller;
        this.marke = marke;
        this.pixel = pixel;
        this.memoryCard = null;

    }

    public String getHersteller() {
        return hersteller;
    }

    public String getMarke() {
        return marke;
    }

    public double getPixel() {
        return pixel;
    }

    public boolean takePhoto() {
        System.out.println("KLICK*");
        return memoryCard.save((int) (pixel * 0.3));
    }

    public void insertMemoryCard(TestMemoryCard tmc) {
        if (tmc == null) {
            System.out.println("Nix kann man nicht einfügen");
            return;
        }
        if (this.memoryCard != null) {
            System.out.println("Es isch schon ein MemoryCard in Slot");
            return;
        }
        this.memoryCard = tmc;
        System.out.println("Memory Card " + tmc.getMarke() + " wurde erfolgreich zugefügt");
    }

    public TestMemoryCard removeMemory (){
        if (memoryCard == null){
            System.out.println("Es gibt kein Memory Card mehr!");
        }
        TestMemoryCard tmc = this.memoryCard;
        this.memoryCard =null;
        return tmc;
    }

    public String toString() {
        return "Hersteller: " + hersteller + " "
                + "Model: " + marke + " "
                + "Pixel: " + pixel + " " +
                (memoryCard != null ? "mit " + memoryCard.getMarke() : "Ohne Speicherkarte ");

    }

}
