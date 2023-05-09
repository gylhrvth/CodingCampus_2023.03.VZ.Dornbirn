package sandro.week10.Hospital;

import java.util.Vector;

public class WaitingRoom {
    private String name;
    private int seats;

    private Vector<Patient> patientList;


    public WaitingRoom (String name,int seats){
        this.name =name;
        this.seats = seats;
        this.patientList = new Vector<>();
    }

    public void addPatient(Patient pat){
        // if waitingroom has empty seat

        if (!patientList.contains(pat)){
            patientList.add(pat);
        }
    }
    public int getSeats() {
        return seats;
    }


    public void printHospitalStructure (){
    System.out.println("│   │   │   ├── WaitingRoom: " +name + ", SeatCapacity: "+ seats);
    }
}
