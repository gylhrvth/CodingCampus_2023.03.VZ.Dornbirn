package eric.week08.cameraClass;

public class MemoryCard {
    private int photosSaved;
    private int storageAvailable;
    private int usedStorage;
    private String manufacturer;
    private int capacity;

    public MemoryCard(String manufacturer, int capacity, int usedMB, int usedFiles){
        this.manufacturer = manufacturer;
        this.photosSaved = usedFiles;
        this.storageAvailable = capacity - usedMB;
        this.capacity = capacity;
    }

    public boolean saveData(int dataVolume){
       if (dataVolume <= storageAvailable){
            photosSaved++;
            storageAvailable -= dataVolume;
            return true;
        } else {
            System.out.println("Not enough storage available\n");
            return false;
        }
    }
    public int showFreeMemory(){
        System.out.println(capacity - storageAvailable + "Mb/" + capacity + "Mb are currently being used");
        return capacity - storageAvailable;
    }
    public void clearMemory(){
        System.out.println("Memory has been cleared!\n");
        storageAvailable = this.capacity;
        photosSaved = 0;
    }

    public String toString(){
        return "\nManufactured by: " + manufacturer + "\nPhotos saved: " + photosSaved +
                "\nStorage available: " + storageAvailable + "Mb/" + capacity + "Mb";
    }
}
