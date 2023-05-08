package sandro.week10.Hospital;

import java.util.Vector;

public class Station {
    private String name;

    private Vector<Room> roomList;


    public Station (String name){
        this.name = name;
        this.roomList = new Vector<>();

    }

    public void addRoom(Room r) {
        if (!roomList.contains(r)) {
            roomList.add(r);
        }
    }

    public int bedCap (){
        int cap = 0;
        for (Room r:roomList) {
            cap += r.getBed();
        }


        return cap;
    }



    public void printHospitalStructure(){
        System.out.println("│   │   ├── Station: " + name + ", Total-Bed Capacity: " +bedCap());
        for (Room r:roomList) {
            r.printHospitalStructure();
        }

    }
}
