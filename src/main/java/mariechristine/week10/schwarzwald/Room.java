package mariechristine.week10.schwarzwald;

import java.util.Vector;

public class Room {
    private int roomNumber;
    private int bedsAvailable;
    private Vector<Patient> patientList;

    public Room(int roomNumber, int bedsAvailable) {
        this.roomNumber = roomNumber;
        this.bedsAvailable = bedsAvailable;
        this.patientList = new Vector<>();
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBedsAvailable() {
        return bedsAvailable;
    }

    public void setBedsAvailable(int bedsAvailable) {
        this.bedsAvailable = bedsAvailable;
    }
}
