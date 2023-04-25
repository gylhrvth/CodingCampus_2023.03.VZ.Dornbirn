package eric.week08.cameraClass;

public class Camera {
    private String brandName;
    private String modelName;
    private int megaPixel;
    private MemoryCard mc;
    private Lens lens;

    public Camera(String brandName, String modelName) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.megaPixel = 34;
    }

    public void setMc(MemoryCard mc) {
        this.mc = mc;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public void takePhoto() {
        int dataSize =(int) (megaPixel * 0.3);
        if (mc != null && lens != null) {
            boolean saved = mc.savePhoto(dataSize);
            if (saved) {
                System.out.println("Photo was shot!");
            }
        } else {
            System.out.println("Some components are missing!");
        }
    }

    public String toString() {
        return "Camera Info: " + "\nManufactured by: " + brandName + "\nModel: " + modelName + "\nMega Pixel: " + megaPixel +
                "\n\nMemory Card info: " + mc + "\n\nLens Info: \n" + lens;
    }
}
