package benjamin.week08.FotoapparatEx2;

import lukas.week03.day4.Colors;

public class MemoryCard2 {
    private String producer;
    private int capacity;
    private int usedMemory;

    public MemoryCard2(String producer, int capacity){
        this.producer = producer;
        this.capacity = capacity;
        this.usedMemory = 0;

    }
    public boolean saveData(int dataSize){
        if(usedMemory + dataSize > capacity){
            System.out.println("Memory card is full!");
            return false;
        }
        usedMemory += dataSize;
        return true;
    }

    public int getFreeMemory() {
        System.out.println(capacity - usedMemory + " MB free\n");
        return capacity - usedMemory;
    }

    public void deleteMemory(){
        System.out.println(Colors.COLORS[1] + "Memory deleted." + Colors.RESET);
        usedMemory = 0;
    }

    @Override
    public String toString() {
        return "The Memory Card: " + Colors.COLORS[6] + producer + " with " + capacity + "MB : Used Memory " + usedMemory + "MB\n" + Colors.RESET;
    }
}
