package eric.week10.schwarzwaldKlinik;

import java.util.ArrayList;
import java.util.List;

public class Station extends Department{

    private List<Room> roomList;

    public Station(String stationName) {
        super(stationName);
        roomList = new ArrayList<>();
    }

    public void addRoom(Room room) {
        roomList.add(room);
    }

    @Override
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