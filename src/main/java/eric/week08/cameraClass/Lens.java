package eric.week08.cameraClass;

public class Lens {
    private int focalLengthMax;
    private int focalLengthMin;
    private int focalLengthSet;

    public Lens(int focalLengthMin, int focalLengthMax){
        this.focalLengthMax = focalLengthMax;
        this.focalLengthMin = focalLengthMin;
        this.focalLengthSet = focalLengthMin;
    }

    public boolean setFocalLengthSet(int setFocalLength) {
        if (setFocalLength >= focalLengthMin && setFocalLength <= focalLengthMax){
            focalLengthSet = setFocalLength;
            System.out.println("Focal length is set to: " + setFocalLength + "mm");
            return true;
        } else {
            if (setFocalLength < focalLengthMin){
                System.out.println("Focal length must be set above " + focalLengthMin + "mm!");
                return false;
            }
            if (setFocalLength > focalLengthMax){
                System.out.println("Focal length must be set underneath " + focalLengthMax + "mm!");
                return false;
            }
        }
        return false;
    }


    public String toString(){
        return "Focal Length: " + focalLengthMin + "mm - " + focalLengthMax + "mm" + "\nFocal Length is set to: " + focalLengthSet + "mm";
    }
}
