package eric.week08.photoClass;

public class Camera {

    private String model;
    private String producer;
    private int megaPixel;
    private MemoryCard mc;
    private Lens lens;

    //    public PhotoData(/*String minFocalLengthPossible, String maxFocalLengthPossible,*/ String modelName,
//                     String manufacturer, /*double megaPixel,*/ int photosTaken/*, float storage*/)
    public Camera(String modelName, String manufacturer){
        this.model = modelName;
        this.producer = manufacturer;
        this.megaPixel = 24;

//        this.minFocalLength = minFocalLengthPossible;
//        this.maxFocalLength = maxFocalLengthPossible;
//        this.megaPixel = megaPixel;
//        this.photosTaken = photosTaken;
//        this.availableStorage = storage;
    }
    public void setMc(MemoryCard mc) {
        this.mc = mc;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public void takePhoto() {
        double mpSize = megaPixel * 0.3;
        if (mc != null && lens != null){
            boolean saved = mc.savePhoto(mpSize);
            if (saved) {
                System.out.println("Picture was shot!");
            }
        } else {
            System.out.println("Certain components are missing!");
        }
    }

    public String toString() {
        return "Model Name: " + model + "\nManufactured by: " + producer + "\nMega Pixel: " + megaPixel + "\nMemory card used: " + mc + "\nLens used: " + lens;
    }
}
