package joachim.week10.model;

import java.util.List;
import java.util.Vector;

public class Server {
    private List<Visitor> visitorList;
    private List<Room> roomList;
    public Server(String name){
        this.visitorList = new Vector<>();
        this.roomList = new Vector<>();
    }
    public void addVisitor(Visitor v){
        visitorList.add(v);
    }
    public void addRoom(Room r){
        roomList.add(r);
    }

    public List<Visitor> getVisitorList() {
        return visitorList;
    }

    public List<Room> getRoomList() {
        return roomList;
    }
}
