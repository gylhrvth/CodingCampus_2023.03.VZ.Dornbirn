package sandro.week08.photo;

public class MemoryCard {
    private String model;
    private int capacity;
    private int usedMB;
    private int pics;

    public MemoryCard(String model, int capacity, int pics, int usedMB){
        this.model = model;
        this.capacity = capacity;
        this.pics = pics;
        this.usedMB = usedMB;
    }

    public void deleteMemory (){
        usedMB = 0;
        pics = 0;
    }


    public boolean saveData(int size){
        if (size > capacity - usedMB){
            System.out.println("!!! MEMORY FULL !!!");
            return false;
        }
        usedMB += size;
        ++pics;
        return true;
    }

    @Override
    public String toString() {
        return "MemoryCard " + model + " with " + usedMB + "/" + capacity + " MB used/capacity " + pics + " images";
    }
}
