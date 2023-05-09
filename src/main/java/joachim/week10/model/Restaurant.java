package joachim.week10.model;

import java.util.List;
import java.util.Vector;

public class Restaurant {
    private List<Room> roomList;


    public Restaurant(){
        this.roomList = new Vector<Room>();
    }
    public void addRoom(Room r){
        roomList.add(r);
    }
    public List<Room> getRoomList() {
        return roomList;
    }
}
