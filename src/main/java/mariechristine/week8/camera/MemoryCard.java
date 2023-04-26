package mariechristine.week8.camera;

public class MemoryCard {
    private String model;
    private int capacity;
    private int usedMB;

    public MemoryCard(String model, int capacity, int usedMB) {
        this.model = model;
        this.capacity = capacity;
        this.usedMB = usedMB;
    }

    @Override
    public String toString() {
        return "Memory Card: " + model + " with " + usedMB + "/" + capacity + " MB used data.";
    }

    public void saveData(int mb) {
        usedMB += mb;

    }

    public void capacity() {
        if (usedMB > capacity) {
            System.out.println("No storage left.");
        }
    }
}
