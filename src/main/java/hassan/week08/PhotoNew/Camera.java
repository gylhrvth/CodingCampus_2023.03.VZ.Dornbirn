package hassan.week08.PhotoNew;

import hassan.week08.Photo.MemoryCard;
import hassan.week08.Photo.Objektiv;

public class Camera {
    private int brennweite;
    private String model;
    private String hersteller;
    private int megapixel;
    private double size;
    private NewMemory memory;
    private Lens lens;
    private int anzahlBilder;

    public Camera(String model, String hersteller, int megapixel, double size) {
        this.brennweite = 35;
        this.model = model;
        this.hersteller = hersteller;
        this.megapixel = megapixel;
        this.size = size;
        this.memory = null;
        this.lens = null;

    }
    public boolean mountObjective(Lens lens) {
        if (this.lens != null) {
            System.out.println("Eine Linse ist bereits montiert");
        }
        this.lens = lens;
        System.out.println("Linse " + this.lens + " wurde montiert");
        return true;
    }

    public Lens dismountObjective() {
        Lens lens1 = this.lens;
        System.out.println("Linse " + this.lens + " WURDE ENTFERNT");
        this.lens = null;
        return lens1;
    }
    public boolean insertMemoryCard(NewMemory mc) {
        if (this.memory != null) {
            System.out.println("es befindet sich schon eine memory card drinnen");
            return false;
        }
        this.memory = mc;
        System.out.println(this.memory);
        return true;
    }
    public NewMemory removeMemoryCard() {
        NewMemory mc = this.memory;
        System.out.println(this.memory + " WURDE ENTFERNT" );
        this.memory = null;
        return mc;
    }



    public void setBrennweite(int brennweite) {
        if (brennweite < 18 || brennweite > 135) {
            System.out.println("Brennweite ist nicht gültig");
        } else {
            this.brennweite = brennweite;
        }
    }

    public void takePhoto() {
        if (memory == null) {
            System.out.println("Take photo without memory card is not allowed.");
            return;
        } else if (this.lens == null) {
            System.out.println("Please mount an Objectiv before you take a picture.");
            return;
        }
        System.out.println("Klick!!!");
        memory.saveData((int)this.size);
    }
    @Override
    public String toString() {
        return "FOTOAPPARAT \n" +
                "Brennweite   : " + brennweite + "\n" +
                "Model        : " + model + "\n" +
                "Hersteller   : " + hersteller + "\n" +
                "Megapixel    : " + megapixel + "\n" +
                "FotoGröße    : " + size + "\n"
                ;

    }
}
