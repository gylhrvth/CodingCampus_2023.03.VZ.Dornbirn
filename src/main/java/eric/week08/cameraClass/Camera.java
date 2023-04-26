package eric.week08.cameraClass;

import lukas.week03.day4.Colors;

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
    public boolean insertMemoryCard(MemoryCard mc){
        if (this.mc != null){
            System.out.println("There is already a memory card inserted.\n");
            return false;
        } else {
            this.mc = mc;
            System.out.println("Memory card inserted\n");
            return true;
        }
    }

    public MemoryCard removeMemoryCard(){
        MemoryCard mc = this.mc;
        System.out.println("Memory card has been removed\n");
        this.mc = null;
        return mc;
    }

    public boolean putLensOn(Lens lens){
        if (this.lens != null){
            System.out.println("There is already an objectiv attached to the camera\n");
            return false;
        } else {
            System.out.println("Objectiv was attached to the camera\n");
        }
        this.lens = lens;
        return true;
    }
    public Lens removeLens(){
        Lens lens = this.lens;
        System.out.println("Objectiv has been removed\n");
        this.lens = null;
        return lens;
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
            boolean saved = mc.saveData(dataSize);
            if (saved) {
                System.out.println(Colors.COLORS[4] + "KLICK" + Colors.RESET);
            }
        } else {
            System.out.println("Some components are missing!\n");
        }
    }

    public String toString() {
        return "Camera Info: " + "\nManufactured by: " + brandName + "\nModel: " + modelName + "\nMega Pixel: " + megaPixel +
                "\n\nMemory Card info: " + mc + "\n\nLens Info: \n" + lens;
    }
}
