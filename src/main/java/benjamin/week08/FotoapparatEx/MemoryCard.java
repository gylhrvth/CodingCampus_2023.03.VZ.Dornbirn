package benjamin.week08.FotoapparatEx;

public class MemoryCard {
    private int freeSpace;
    private int memoryCard;

    public MemoryCard(int memoryCard, int freeSpace){
        this.memoryCard = memoryCard;
        this.freeSpace = freeSpace;

    }

    public void saveData(int size){
        freeSpace -= size;
    }


    @Override
    public String toString() {
        return "Capacity:    " + memoryCard + "mB" + "\nFreespace:   " + freeSpace + "mB\n";
    }
}

