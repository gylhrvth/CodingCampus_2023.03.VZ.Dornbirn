package benjamin.week08.FotoapparatEx2;

import lukas.week03.day4.Colors;

public class Camera2 {

    private MemoryCard2 memoryCard2;
    private Objective2 objective2;
    private String model;
    private String producer;
    private int megapixel;
    private int photosTaken;
    private double sizePerMegapixel;


    public Camera2(String model, String producer, int megapixel) {
        this.model = model;
        this.producer = producer;
        this.megapixel = megapixel;
        this.memoryCard2 = null;
        this.objective2 = null;
        this.photosTaken = 0;
        this.sizePerMegapixel = 0.3;
    }


    public boolean insertMemorycard(MemoryCard2 mc) {
        if (this.memoryCard2 != null) {
            System.out.println("There is already a memory card inside.");
            return false;
        } else {
            this.memoryCard2 = mc;
            System.out.println(Colors.COLORS[5] + "Memory card inserted." + Colors.RESET);
            return true;
        }
    }

    public MemoryCard2 removeMemoryCard() {
        MemoryCard2 mc = this.memoryCard2;
        System.out.println(Colors.COLORS[1] + "Memomory card is removed." + Colors.RESET);
        this.memoryCard2 = null;
        return mc;
    }

    public boolean putOnObjective(Objective2 ob) {
        if (this.objective2 != null) {
            System.out.println("There is already a objective on the camera.");
            return false;
        } else {
            System.out.println(Colors.COLORS[4] + "Objectiv attached." + Colors.RESET);
        }
        this.objective2 = ob;
        return true;
    }

    public Objective2 removeObjective() {
        Objective2 ob = this.objective2;
        System.out.println(Colors.COLORS[1] + "Objectiv is removed." +  Colors.RESET);
        this.objective2 = null;
        return ob;
    }

    public void takePhoto() {
        if (memoryCard2 == null) {
            System.out.println(Colors.COLORS[1] + "No memory card no photo\n" + Colors.RESET);
        } else if (objective2 == null) {
            System.out.println(Colors.COLORS[1] + "No objective no photo\n" + Colors.RESET);
        } else {
            int dataSize = (int) (this.sizePerMegapixel * this.megapixel);
            if (memoryCard2.saveData(dataSize)) {
                System.out.println(Colors.COLORS[3] + "\n<<<KLICK>>>\n" + Colors.RESET);
                photosTaken++;
            } else {
                System.out.println("Not enough memory to take photo.");
            }
        }
    }

    public int getPhotosTaken() {
        System.out.println(Colors.COLORS[2] + photosTaken +  " photos taken" + Colors.RESET);
        return photosTaken;
    }


    @Override
    public String toString() {
        return "The Camera: "+Colors.COLORS[2] + model + " " + producer + " with " + megapixel + "MPx\n"+ Colors.RESET +
                (memoryCard2 != null ?  memoryCard2 : "No memory card inside\n")
                + (objective2 != null ?  objective2 : "No objective attached");
    }
}
