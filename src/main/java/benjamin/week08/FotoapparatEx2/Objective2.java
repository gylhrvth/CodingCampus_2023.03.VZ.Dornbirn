package benjamin.week08.FotoapparatEx2;

public class Objective2 {

    private int minFocalLength;
    private int maxFocalLength;
    private String producer;


    public Objective2(String producer, int minFocalLength, int maxFocalLength){

        this.producer = producer;
        this.minFocalLength = minFocalLength;
        this.maxFocalLength = maxFocalLength;
    }

    public void setMinFocalLength(int minFocalLength) {
        this.minFocalLength = minFocalLength;;
    }

    public void setMaxFocalLength(int maxFocalLength) {
        this.maxFocalLength = maxFocalLength;
    }

    @Override
    public String toString() {
        return "Producer: " + producer + "\nFocalLength: " + minFocalLength + "mm - " + maxFocalLength + "mm";
    }
}
