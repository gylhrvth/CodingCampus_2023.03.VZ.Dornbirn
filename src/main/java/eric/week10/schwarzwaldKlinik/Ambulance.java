package eric.week10.schwarzwaldKlinik;

import lukas.week03.day4.Colors;

import java.util.ArrayList;
import java.util.List;

public class Ambulance extends Department {
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
    protected boolean treatment(Patient patient) {
        if (patient.getCurrentHP() < 50) {
            System.out.println(Colors.COLORS[1] + "The patient " + Colors.RESET + patient.getName() + Colors.COLORS[1] + " is not in a condition to leave and will be admitted to the station" + Colors.RESET);
            responsibleStation.sendPatientToRoom(patient);
//            if (patient.getCurrentHP() == 100){
//                removePatient(patient);
//            }
            return true;
        } else {
            System.out.println(Colors.COLORS[2] + "The patient " + Colors.RESET + patient.getName() + Colors.COLORS[2] + " was treated in the Ambulance and will leave shortly after" + Colors.RESET);
            patient.treat();
            if(patient.isHealed()) {
                return true;
            }
        }
        return false;
    }
}
