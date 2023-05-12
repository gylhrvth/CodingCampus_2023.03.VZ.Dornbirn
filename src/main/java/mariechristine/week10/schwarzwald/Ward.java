package mariechristine.week10.schwarzwald;

import java.util.Vector;

public class Ward extends Department{

    private Vector<Room> roomList;


    public Ward(String name){
        super(name);
    }


    public void addRoom(Room room) {
        if (!roomList.contains(room)) {
            roomList.add(room);
        }
    }

    public void printStructure() {
        System.out.println("_________________________________\nWard: " + getName());

    }
}
