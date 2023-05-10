package eric.week10.schwarzwaldKlinik;

import java.util.ArrayList;
import java.util.List;

public class Ambulance extends Department{
    private int openingTime;
    private int closingTime;
    private int amountOfSeats;
    private Station responsibleStation;

    public Ambulance(String name, Station responsibleStation, int openingTime, int closingTime, int amountOfSeats) {
        super(name);
        this.responsibleStation = responsibleStation;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.amountOfSeats = amountOfSeats;
    }


    @Override
    protected void treatment(Patient patient) {
        if (patient.getPainMeter() > 40) {
            System.out.println("The patient " + patient.getName() + " is not in a condition to leave and will be admitted to the station");
            responsibleStation.sendPatientToRoom(patient);
        } else {
            System.out.println("Handle " + patient.getName() + "... and hope the best.");
        }
    }

}
