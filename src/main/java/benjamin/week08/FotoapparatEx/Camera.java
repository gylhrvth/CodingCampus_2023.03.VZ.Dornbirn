package benjamin.week08.FotoapparatEx;

public class Camera {

    private String model;
    private String producer;
    private int megapixel;
    private int photosTaken;
    private int freeSpace;
    private int memory;
    private MemoryCard memoryCard;
    private double size;

    private Objective objective;


    public Camera(String model, String producer, int megapixel, double size) {

        this.model = model;
        this.producer = producer;
        this.megapixel = megapixel;
        this.memoryCard = null;
        this.memory = 0;
        this.photosTaken = 0;
        this.freeSpace = 0;
        this.size = size * megapixel;
        this.objective = null;

    }

    public void setPhotosTaken(int photosTaken) {
        this.photosTaken = photosTaken;
    }


    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getPhotosTaken() {
        return photosTaken;

    }

    public boolean insertMemoryCard(MemoryCard mc){
        if (this.memoryCard != null){
            System.out.println("There is already a card inside");
            return false;
        }
        this.memoryCard = mc;
        return true;
    }

    public boolean putOnObjective(Objective ob){
        if(this.objective != null){
            System.out.println("There is already a objective on the camera");
            return false;
        }
        this.objective = ob;
        return true;
    }

    public Objective removeObjective(){
        Objective ob = this.objective;
        this.objective = null;
        return ob;
    }

    public MemoryCard removeMemoryCard(){
        MemoryCard mc = this.memoryCard;
        this.memoryCard = null;
        return mc;
    }


    public void takePhoto() {
        if (memoryCard == null){
            System.out.println("No memory card inside.");
            return;
        } else if (objective == null){
            System.out.println("No objective on the Camera.");
        } else {
            System.out.println("\nNice photo <(._.)> !\n");
            memoryCard.saveData((int) this.size);
        }
    }

    @Override
    public String toString() {
        return "Producer:    " + producer + "\nModel:       " +
                model + "\nMegapixel:   " + megapixel + "mp\n"
                +(memoryCard != null ? "with memory card:\n" + memoryCard :"without memory card\n")
                +(objective != null ? "with objective:\n" + objective :"without objective\n");

    }

}








