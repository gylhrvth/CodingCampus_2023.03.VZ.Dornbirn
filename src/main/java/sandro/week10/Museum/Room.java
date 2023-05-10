package sandro.week10.Museum;

import lukas.week03.day4.Colors;

import java.util.Vector;

public class Room {
    private String name;

    private Vector<Human> humanInRoomList;

    private Vector<Room> neighborRooms;

    public Room(String name) {
        this.name = name;
        this.neighborRooms = new Vector<>();
        this.humanInRoomList = new Vector<>();
    }





    public void addDoorToRoom(Room r) {
        if (!neighborRooms.contains(r)) {
            neighborRooms.add(r);
        }
        if (!r.neighborRooms.contains(this)) {
            r.neighborRooms.add(this);
        }
    }

    public void stepIn(Human h) {
        System.out.println(h.getColor() + h.getName() + Colors.RESET+ " enters in " + name);
        if (!humanInRoomList.contains(h)) {
            humanInRoomList.add(h);
        }
    }

    public void stepOut(Human h) {
        if (humanInRoomList.contains(h)) {
            humanInRoomList.remove(h);
        }

    }
    //public void move (int i){}

    public void printStructure() {

    }

    public void printMap() {

    }

    protected Vector<Human> getHumanInRoomList() {
        return humanInRoomList;
    }

    protected Vector<Room> getNeighborRooms() {
        return neighborRooms;
    }

    public int getCountOfVisitorsInRoom(){
        int count = 0;
        for (Human h: humanInRoomList) {
            if (!(h instanceof Guard)){
                ++count;
            }
        }
        return count;
    }

    public String getName() {
        return name;
    }


    public Room getRandomNextRoom(){
        if (neighborRooms.isEmpty()){
            return this;
        }
        return neighborRooms.get(Museum.random.nextInt(neighborRooms.size()));
    }


}
