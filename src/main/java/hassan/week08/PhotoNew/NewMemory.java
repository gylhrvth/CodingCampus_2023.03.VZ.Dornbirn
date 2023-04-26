package hassan.week08.PhotoNew;

public class NewMemory {

    private String model;
    private int capacity;
    private int usedMB;

    public NewMemory(String model, int capacity, int usedMB) {
        this.model = model;
        this.capacity = capacity;
        this.usedMB = usedMB;
    }

    public void saveData(int size) {
        usedMB += size;
    }

    public int getAvailableSpace() {
        return capacity - usedMB;
    }

    public int getUsedSpace() {
        return usedMB;
    }


    @Override
    public String toString() {
        return "MemoryCard " + model + " mit " + getUsedSpace() + "/" + capacity + "MB used/capacity. " +
                "Verfügbarer Speicherplatz: " + getAvailableSpace() + "MB";
    }


}
