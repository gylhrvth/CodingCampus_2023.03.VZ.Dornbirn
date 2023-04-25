package benjamin.week08.FotoapparatEx2;

public class Camera2 {

    private MemoryCard2 memoryCard2;
    private Objective2 objective2;
    private String model;
    private String producer;
    private int megapixel;
    private int photosTaken;
    private int usedMemory;
    private double sizeMb;


    public Camera2(String model, String producer, int megapixel) {
        this.model = model;
        this.producer = producer;
        this.megapixel = megapixel;
        this.memoryCard2 = null;
        this.objective2 = null;
        this.photosTaken = 0;
        this.usedMemory = 0;
        this.sizeMb = 0.3;
    }


    public boolean insertMemorycard(MemoryCard2 mc) {
        if (this.memoryCard2 != null) {
            System.out.println("There is already a memory card inside");
            return false;
        }
        this.memoryCard2 = mc;
        return true;
    }

    public MemoryCard2 removeMemoryCard() {
        MemoryCard2 mc = this.memoryCard2;
        this.memoryCard2 = null;
        return mc;
    }

    public boolean putOnObjective(Objective2 ob) {
        if (this.objective2 != null) {
            System.out.println("There is already a objective on the camera");
            return false;
        }
        this.objective2 = ob;
        return true;
    }

    public Objective2 removeObjective() {
        Objective2 ob = this.objective2;
        this.objective2 = null;
        return ob;
    }

    public void takePhoto() {
        if (memoryCard2 == null) {
            System.out.println("No memory card inside");
        } else if (objective2 == null) {
            System.out.println("No objective on the camera");
        } else {
            System.out.println("\n<<<KLICK>>>\n");
            memoryCard2.saveData((int) (this.sizeMb * this.megapixel));
        }
    }

    @Override
    public String toString() {
        return "Model:    " + model + "\nProducer: " + producer + "\nMegapixel: " + megapixel + "\n" +
                (memoryCard2 != null ? "Memory card:\n" + memoryCard2 : "No memory card\n")
                + (objective2 != null ? "Objective:\n" + objective2 : "No objective\n");
    }
}
