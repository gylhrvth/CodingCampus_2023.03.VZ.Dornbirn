package eric.week08.photoClass;

public class Lens {
    private int focalLengthMax;
    private int focalLengthMin;
    private int focalLengthNow;

    public Lens() {
        this.focalLengthMax = 55;
        this.focalLengthMin = 16;
        this.focalLengthNow = 24;
    }
    public String toString(){
        return focalLengthMin + "mm - " + focalLengthMax + "mm\nFocal length set: " + focalLengthNow + "mm";
    }
}
