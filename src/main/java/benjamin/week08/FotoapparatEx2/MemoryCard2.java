package benjamin.week08.FotoapparatEx2;

public class MemoryCard2 {
    private String producer;
    private int capacity;
    private int usedMemory;
    private int pics;


    public MemoryCard2(String producer, int usedMemory, int capacity, int pics){
        this.producer = producer;
        this.capacity = capacity;
        this.usedMemory = usedMemory;
        this.pics = pics;
    }

    public int getCapacity() {
        return capacity;
    }

    public void deleteMemory(){
        usedMemory = 0;
        pics = 0;
    }

    public void saveData(int sizeMb){
        if(sizeMb > capacity - usedMemory){
            System.out.println("Memory card is full!");
            return;
        }
        usedMemory += sizeMb;
        pics++;
    }

    @Override
    public String toString() {
        return "Producer :" + producer + "\nMemory :" + usedMemory + "/" + capacity + "\nPics: " + pics + "\n";
    }
}
