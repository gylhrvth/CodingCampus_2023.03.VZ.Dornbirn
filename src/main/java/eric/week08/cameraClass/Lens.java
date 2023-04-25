package eric.week08.cameraClass;

public class Lens {
    private int focalLengthMax;
    private int focalLengthMin;
    private int focalLengthSet;

    public Lens(){
        this.focalLengthMax = 70;
        this.focalLengthMin = 12;
        this.focalLengthSet = 32;
    }
    public String toString(){
        return "Focal Length: " + focalLengthMin + "mm - " + focalLengthMax + "mm" + "\nFocal Length is set to: " + focalLengthSet + "mm";
    }
}
