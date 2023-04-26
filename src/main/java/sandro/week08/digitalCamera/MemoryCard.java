package sandro.week08.digitalCamera;

import lukas.week03.day4.Colors;

public class MemoryCard {
    private String model;
    private int capacity;
    private int usedMB;
    private int pics;

    public MemoryCard(String model, int capacity, int pics, int usedMB) {
        this.model = model;
        this.capacity = capacity;
        this.pics = pics;
        this.usedMB = usedMB;
    }

    public void deleteMemory() {
        usedMB = 0;
        pics = 0;
    }

    public boolean saveData(int size) {
        if (size > capacity - usedMB) {
            System.out.println("!!! MEMORY CARD FULL !!!");
            return false;
        }
        usedMB += size;
        ++pics;
        return true;
    }

    @Override
    public String toString() {
        return Colors.COLORS[3] + model + " - " + Colors.RESET + usedMB + "/" + capacity + Colors.COLORS[3] + " MB used/capacity - " + Colors.RESET + pics + Colors.COLORS[3] + " images" + Colors.RESET;
    }

}
