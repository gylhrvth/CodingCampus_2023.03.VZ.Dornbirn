package sandro.week08.digitalCamera;

import lukas.week03.day4.Colors;

public class Lens {
    private String model;
    private int minFol;
    private int maxFol;

    public Lens(String model, int minFocallength, int maxFocallength) {
        this.model = model;
        this.minFol = minFocallength;
        this.maxFol = maxFocallength;
    }


    @Override
    public String toString() {
        return Colors.COLORS[3] + model + " with Focal length from: " + minFol + "mm" + " to: " + maxFol + "mm" + Colors.RESET;
    }

}
