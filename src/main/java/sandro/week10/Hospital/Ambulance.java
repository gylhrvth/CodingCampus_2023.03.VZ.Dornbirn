package sandro.week10.Hospital;

import java.util.Vector;

public class Ambulance {
    private String name;
    private int weeklyOpeningHourStart;
    private int weeklyOpeningHourEnd;
    private int otherOpeningHourStart;
    private int otherOpeningHourEnd;
    private Vector<WaitingRoom> waitingRoomList;
    private Vector<Patient> patientList;


    public Ambulance(String name, int weeklyOpeningHourStart, int weeklyOpeningHourEnd, int otherOpeningHourStart, int otherOpeningHourEnd) {
        this.name = name;
        this.weeklyOpeningHourStart = weeklyOpeningHourStart;
        this.weeklyOpeningHourEnd = weeklyOpeningHourEnd;
        this.otherOpeningHourStart = otherOpeningHourStart;
        this.otherOpeningHourEnd = otherOpeningHourEnd;
        this.waitingRoomList = new Vector<>();
        this.patientList = new Vector<>();
    }

    public void addPatient(Patient pat){
        if (!patientList.contains(pat)){
            patientList.add(pat);
        }
    }

    public void addWaitingRoom(WaitingRoom wr) {
        if (!waitingRoomList.contains(wr)) {
            waitingRoomList.add(wr);
        }
    }

    public void patientTreatment (){
        for (Patient pat:patientList) {

        }
    }

    public int waitingRoomCap() {
        int cap = 0;
        for (WaitingRoom wr : waitingRoomList) {
            cap += wr.getSeats();
        }
        return cap;
    }

    public void printHospitalStructure() {
        System.out.println("│   │   ├── Ambulance: " + name + " Total-WaitingRoom Capacity:" + waitingRoomCap() +
                "\n│   │   │   │Open at --> Mon-Fri: " + weeklyOpeningHourStart + ":00\\" + weeklyOpeningHourEnd + ":00   Sat-Sun: " + otherOpeningHourStart + ":00\\" + otherOpeningHourEnd + ":00");
        for (WaitingRoom wr : waitingRoomList) {
            wr.printHospitalStructure();
        }
    }
}
