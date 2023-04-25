package sandro.week08.photo;

public class MemoryCard {
    private String model;
    private int capacity;
    private int usedMB;

    public MemoryCard(String model, int capacity, int usedMB){
        this.model = model;
        this.capacity = capacity;
        this.usedMB = usedMB;
    }


    public void saveData(int size){
        usedMB += size;
    }

    @Override
    public String toString() {
        return "MemoryCard " + model + " with " + usedMB + "/" + capacity + " MB used/capacity";
    }
}
