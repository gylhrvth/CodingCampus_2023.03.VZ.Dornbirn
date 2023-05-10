package eric.week10.schwarzwaldKlinik;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private List<Patient> patientList;
    private int roomNumber;

    public Room(int roomNumber) {
        this.roomNumber =  roomNumber;
        this.patientList = new ArrayList<>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void admittedPatient(Patient patient){
        patientList.add(patient);
    }

    public void treatPatient(){
        if (!patientList.isEmpty()){
            System.out.println("There is currently no patient in this room");
        }
        for (Patient patient : patientList) {
            patient.getTreatment();
        }
    }
}
