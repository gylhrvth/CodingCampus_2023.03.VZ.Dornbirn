package eric.week10.schwarzwaldKlinik;

import java.util.ArrayList;
import java.util.List;

public class Station extends Department{

    private List<Room> roomList;
//    private List<Patient> patientList;
//    private List<Ambulance> ambulanceList;

    public Station(String stationName) {
        super(stationName);
        roomList = new ArrayList<>();
//        patientList = new ArrayList<>();
//        ambulanceList = new ArrayList<>();
    }

    public void addRoom(Room room) {
        roomList.add(room);
    }

//    public void addPatientFromAmbulance(Patient patient) {
//        patientList.add(patient);
//    }


    public void dailyRoutine(){
        if (roomList.isEmpty()) {
            System.out.println("There is currently no room available ");
        }
        for (Room room : roomList) {
            room.treatPatient();
        }
    }

    public void sendPatientToRoom(Patient patient) {
        if (roomList.isEmpty()) {
            System.out.println("There is currently no room available ");
            return;
        }
        roomList.get(0).admittedPatient(patient);
    }
}