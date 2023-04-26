package joachim.week08.Photoapparat2;

public class Kamera {
    private String model;
    private String hersteller;
    private float megaPixel;
    private Memory memory;
    private Objectiv objectiv;

    public Kamera(String hersteller, String model, int megaPixel) {
        this.model = model;
        this.hersteller = hersteller;
        this.megaPixel = megaPixel;
        this.memory = null; //Memory socket
        this.objectiv = null; //Objectiv socket

    }

    public void memoryEinfuegen(Memory mc) { //Hier wird die Karte eingeteckt und nach möglichen Fehlern kontrolliert.
        if (memory != null) {
            System.out.println("Der Socket ist besetzt");
        } else if (mc == null) {
            System.out.println("Wo ist die Karte?");
        } else {
            System.out.println(mc + " wurde eingefügt");
            memory = mc;
        }
    }

    public void objectivEinfuegen(Objectiv ob) {
        if (objectiv != null) {
            System.out.println("Es ist bereits ein Objectiv montiert");
        } else if (ob == null) {
            System.out.println("Bitte ein Objectiv in die Hand nehmen");
        } else {
            System.out.println(ob + " wurde montiert.");
            objectiv = ob;
        }
    }

    public Memory memoryEntfernen() {
        if (memory == null) {
            System.out.println("Keine Karte vorhanden.");
            return null;
        }

        System.out.println(this.memory + " wurde entfernt.");
        Memory mc = this.memory;
        this.memory = null;
        return mc;
    }

    public int getFreeMemory() {
        if (memory == null) {
            return 0;
        }

        return memory.getFreeMemory();
    }

    public void takeAPhoto() { //Nachfrage ob die Memorycard eingefügt wird
        if (memory == null) {
            System.out.println("Bitte eine Memorycard einfügen");
            return;
        }

        memory.saveAPhoto((int) (megaPixel * 0.3));
        System.out.println("Click!!! Rest: " + memory.getFreeMemory());
    }


    @Override
    public String toString() {
        return hersteller + "  " + model + " with " + megaPixel + " MP Sensor";
    }


}
