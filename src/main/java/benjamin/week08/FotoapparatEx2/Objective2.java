package benjamin.week08.FotoapparatEx2;

import lukas.week03.day4.Colors;

public class Objective2 {

    private int minFocalLength;
    private int maxFocalLength;

    private int currentFocalLength;
    private String producer;


    public Objective2(String producer, int minFocalLength, int maxFocalLength){

        this.producer = producer;
        this.minFocalLength = minFocalLength;
        this.maxFocalLength = maxFocalLength;
        this.currentFocalLength = minFocalLength;
    }

    public boolean setFocalLength(int newFocalLength) {
        if (newFocalLength >= minFocalLength && newFocalLength <= maxFocalLength) {
            currentFocalLength = newFocalLength;
            System.out.println(Colors.COLORS[3] + "FocalLength is set on " + newFocalLength + Colors.RESET);
            return true;
        } else if(newFocalLength > maxFocalLength){
            currentFocalLength = maxFocalLength;
            return true;
        } else {
            currentFocalLength = minFocalLength;
            return true;
        }
    }

    public String getProducer() {
        return producer;
    }

    public int getCurrentFocalLength() {
        System.out.println("Current Focal Length is " + currentFocalLength);
        return currentFocalLength;
    }

    @Override
    public String toString() {
        return "The Objectiv: "+ Colors.COLORS[4] + producer + "\n"
                + " with FocalLength of " + minFocalLength + "mm - "
                + maxFocalLength + "mm" + "\nCurrent Focal Length: "+ currentFocalLength + "mm" + Colors.RESET
                ;
    }
}
