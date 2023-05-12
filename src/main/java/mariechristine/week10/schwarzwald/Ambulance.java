package mariechristine.week10.schwarzwald;

import lukas.week03.day4.Colors;

public class Ambulance extends Department {

    private String openingHours;
    private int seatsAvailable;



    public Ambulance(String name, String openingHours, int seatsAvailable) {
        super(name);
        this.openingHours = openingHours;
        this.seatsAvailable = seatsAvailable;
    }

    public void printStructure() {
        System.out.println(Colors.COLORS[1] + "_________________________________\n☛ AMBULANCE: " + getName() + Colors.RESET);
    }
}
