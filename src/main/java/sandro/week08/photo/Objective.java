package sandro.week08.photo;

public class Objective {
    private String model;
    private int focallength;

    public Objective(String model, int focallength) {
        this.model = model;
        this.focallength = focallength;
    }


    @Override
    public String toString() {
        return "Objective " + model + " with " + focallength + "mm";
    }
}
