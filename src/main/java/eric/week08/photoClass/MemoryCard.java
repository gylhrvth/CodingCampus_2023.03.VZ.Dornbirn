package eric.week08.photoClass;

public class MemoryCard {
    private int photosSaved;
    private int availableStorage;
    private String manufacturer;

    public MemoryCard(String creator){
        photosSaved = 20;
        availableStorage = 1000;
        manufacturer = creator;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public boolean savePhoto(double photoSize) {
        if (photoSize <= availableStorage) {
            photosSaved++;
            availableStorage -= photoSize;
            return true;
        } else {
            System.out.println("Not enough storage available!");
            return false;
        }
    }
    public String toString() {
        return manufacturer + "\nPictures saved: " + photosSaved + "\nStorage available: " + availableStorage + "MB/1000MB";
    }
}
