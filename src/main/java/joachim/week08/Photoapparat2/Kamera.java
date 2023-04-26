package joachim.week08.Photoapparat2;

public class Kamera {
    private String model;
    private String hersteller;
    private float megaPixel;
    private Memory memory;

    public Kamera(String hersteller, String model, int megaPixel) {
        this.model = model;
        this.hersteller = hersteller;
        this.megaPixel = megaPixel;
        this.memory = null; //Memory socket

    }

    public void memoryEinfuegen(Memory mc) { //Hier wird die Karte eingeteckt und nach möglichen Fehlern kontrolliert.
        if (memory != null) {
            System.out.println("Der Socket ist besetzt");
        } else if (mc == null) {
            System.out.println("Wo ist die Karte?");
        } else {
            memory = mc;
        }
    }

    public Memory memoryEntfernen() {
        if (memory == null) {
            System.out.println("Keine Karte vorhanden.");
            return null;
        }

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
        System.out.println("Click");
    }

    @Override
    public String toString() {
        return hersteller + "  " + model + " with " + megaPixel + " MP Sensor";
    }


}
