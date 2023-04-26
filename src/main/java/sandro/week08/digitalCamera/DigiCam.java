package sandro.week08.digitalCamera;

import lukas.week03.day4.Colors;
import sandro.week08.photo.Objective;

public class DigiCam {
    private String manufacturer;
    private String model;

    private int focallenght;
    private int megapixel;
    private int size;
    private MemoryCard memoryCard;
    private Lens lens;

    public DigiCam(String manufacturer, String model, int focallenght, int megapixel, int size) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.focallenght = focallenght;
        this.megapixel = megapixel;
        this.size = (int) (size * 0.01 * megapixel);
        this.memoryCard = null;
        this.lens = null;
    }

    public boolean mountLens(Lens lens) {
        if (this.lens != null) {
            System.out.println("there is already a Lens mounted");
        }
        this.lens = lens;
        System.out.println("Lens: " + this.lens + "   #" + Colors.COLORS[1] + " is mounted" + Colors.RESET);
        return true;
    }

    public boolean insertMemory(MemoryCard memoryCard) {
        if (this.memoryCard != null) {
            System.out.println("there is already a Memory Card in your Cam");
            return false;
        }
        this.memoryCard = memoryCard;
        System.out.println("Memory Card: " + this.memoryCard + "   #" + Colors.COLORS[1] + " has been insert" + Colors.RESET);
        return true;
    }

    public Lens dismountLens() {
        Lens lens = this.lens;
        System.out.println("Lens: " + this.lens + "   #" + Colors.COLORS[1] + " has been dismounted" + Colors.RESET);
        this.lens = null;
        return lens;
    }

    public MemoryCard removeMemoryCard() {
        MemoryCard memoryCard = this.memoryCard;
        System.out.println("Memory Card: " + this.memoryCard + "   #" + Colors.COLORS[1] + " has been removed" + Colors.RESET);
        this.memoryCard = null;
        return memoryCard;
    }

    public void deleteMem() {
        memoryCard.deleteMemory();
    }

    public void setFocallenght(int focallenght) {

        this.focallenght = focallenght;
    }

    public void takePhoto() {

        if (memoryCard == null) {
            System.out.println("Take photo without memory card is not allowed.");
            return;
        } else if (lens == null) {
            System.out.println("Please mount an Lens before you take a picture.");
            return;
        }

        System.out.println("Klick!!!");
        System.out.println();
        boolean saved = memoryCard.saveData(this.size);
        if (saved) {
            System.out.println("***************");
            System.out.println("*   (.)_(.)   *");
            System.out.println("*    ) . (    *");
            System.out.println("*   (  Y  )   *");
            System.out.println("***************");
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "\n" + Colors.COLORS[2] + manufacturer + " " + model + Colors.RESET + "\n"
                + (memoryCard != null ? "with " + memoryCard : "without Memory Card")
                + "\n"
                + (lens != null ? "with " + lens : "without Lens")
                + "\n";

    }

}





