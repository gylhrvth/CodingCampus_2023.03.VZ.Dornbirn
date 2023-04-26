package mariechristine.week8.camera;

public class CameraExtended {
    private String model;
    private String manufacturer;
    private int resolution;
    private MemoryCard memoryCard;
    private ObjectiveLens objectiveLens;

    public CameraExtended(String manufacturer, String model, int resolution, int lens) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.resolution = resolution;
        this.memoryCard = null;
        this.objectiveLens = null;
    }

    public void takePhoto() {
        if (memoryCard == null) {
            System.out.println(manufacturer + " " + model + ": Take photo without memory card is not possible.");
            return;
        }
        if (objectiveLens == null) {
            System.out.println(manufacturer + " " + model + " without objective lens. Not possible to take photos.");
            return;
        }

        memoryCard.saveData(10);
        System.out.println("Congrats! You took a photo of a banana!");


    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getResolution() {
        return resolution;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }


    public void insertMemoryCard(MemoryCard memoryCard) {
        if (this.memoryCard != null) {
            System.out.println("There is a memory card in the slot!!!");
            return;
        }

        this.memoryCard = memoryCard;
        System.out.println("Memory card has been inserted successfully");
    }

    public MemoryCard removeMemoryCard() {
        if (this.memoryCard == null) {
            System.out.println("The slot is empty, there is nothing to remove");
        }
        MemoryCard mc = this.memoryCard;
        this.memoryCard = null;
        return mc;

    }

    public void attachObjectiveLens(ObjectiveLens objectiveLens) {
        if (this.objectiveLens != null) {
            System.out.println("Objective lens is already attached.");
            return;
        }

        this.objectiveLens = objectiveLens;
        System.out.println("Objective lens has been attached successfully.");
    }

    public ObjectiveLens removeObjectiveLens() {
        if (this.objectiveLens == null) {
            System.out.println("Objective lens is already removed.");
        }

        ObjectiveLens ol = this.objectiveLens;
        this.objectiveLens = null;
        return ol;
    }

    public String toString() {
        return "Camera " + manufacturer + " " + model
                + (memoryCard != null ? " with " + memoryCard : " without memory card");
    }
}
