package sandro.week08.photo;

import java.util.Date;

public class PhotoCam2 {

    private String model;
    private String hersteller;
    private int megapixel;
    private int size;
    private MemoryCard memoryCard;
    private Objective objective;


    public PhotoCam2(String hersteller, String model, int megapixel, int size) {
        this.model = model;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
        this.size = (int) ((size * 0.01) * megapixel);
        this.memoryCard = null;
        this.objective = null;
    }

    public boolean mountObjective(Objective obj) {
        if (this.objective != null) {
            System.out.println("there is already an Objective mounted");
        }
        this.objective = obj;
        System.out.println("objective " + this.objective + " is mounted");
        return true;
    }

    public Objective dismountObjective() {
        Objective obj = this.objective;
        System.out.println("objective " + this.objective + " has been dismounted");
        this.objective = null;
        return obj;
    }

    public boolean insertMemoryCard(MemoryCard mc) {
        if (this.memoryCard != null) {
            System.out.println("there is already a MemoryCard insert");
            return false;
        }
        this.memoryCard = mc;
        System.out.println("memory card " + this.memoryCard + " has been insert");
        return true;
    }

    public MemoryCard removeMemoryCard() {
        MemoryCard mc = this.memoryCard;
        System.out.println("Memory Card " + this.memoryCard + " has been removed");
        this.memoryCard = null;
        return mc;
    }

    public void deleteMem(){
        memoryCard.deleteMemory();
    }

    public void takePhoto() {

        if (memoryCard == null) {
            System.out.println("Take photo without memory card is not allowed.");
            return;
        } else if (objective == null) {
            System.out.println("Please mount an Objectiv before you take a picture.");
            return;
        }

        System.out.println("Klick!!!");
        boolean saved = memoryCard.saveData(this.size);
        if (saved) {
            System.out.println("   ()_()   ");
            System.out.println("   (0.o)   ");
            System.out.println(" '(\") (\")' ");
        }
    }


    @Override
    public String toString() {
        return "PhotoCam " + hersteller + " " + model + "\n"
                + (memoryCard != null ? "with " + memoryCard : "without memory card")
                + "\n"
                + (objective != null ? "with " + objective : "without objective");

    }
}
