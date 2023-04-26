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

    public boolean savePhoto(int dataVolume){
       if (dataVolume <= storageAvailable){
            photosSaved++;
            storageAvailable -= dataVolume;
            return true;
        } else {
            System.out.println("Not enough storage available");
            return false;
        }
    }
    public String toString(){
        return "\nManufactured by: " + manufacturer + "\nPhotos saved: " + photosSaved +
                "\nStorage available: " + storageAvailable + "Mb/" + capacity + "Mb";
    }
}
