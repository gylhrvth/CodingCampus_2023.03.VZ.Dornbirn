package ayguen.week08.photocam;

public class MemoryCard {
    private String model;
    private int capacity;
    private int usedMB;


    public MemoryCard(String model, int capacity, int usedMB){
        this.model = model;
        this.capacity = capacity;
        this.usedMB = usedMB;
    }

    public String getModel() {
        return model;
    }

    public boolean saveData(int sizeMB){
        if (sizeMB > capacity - usedMB){
            System.out.println("!!! Speicher Voll !!!");
            return false;
        }
        usedMB += sizeMB;
        return true;
    }

    @Override
    public String toString() {
        return "MemoryCard{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                ", usedMB=" + usedMB +
                '}';
    }
}
