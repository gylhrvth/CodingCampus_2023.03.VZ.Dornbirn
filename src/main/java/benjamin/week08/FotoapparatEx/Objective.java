package benjamin.week08.FotoapparatEx;

public class Objective {

    private int focalLength;

    private String producer;

    public Objective(String producer, int focalLength) {

        this.producer = producer;
        this.focalLength = focalLength;
    }


    @Override
    public String toString() {
        return "Producer:    " + producer + "\nFocalLength: " + focalLength + "mm";
    }
}
