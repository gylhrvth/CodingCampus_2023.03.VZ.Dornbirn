package sandro.week10.Museum;

import lukas.week03.day4.Colors;

import java.util.List;
import java.util.Vector;

public class Room {
    private String name;

    private List<Human> humanInRoomList;

    private List<Room> neighborRooms;

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
        System.out.println(h.getColor() + h.getName() + Colors.RESET + ": enters in " + name);
        if (!humanInRoomList.contains(h)) {
            humanInRoomList.add(h);
        }
    }

    public void stepOut(Human h) {
        humanInRoomList.remove(h);
    }
    public void printStructure() {

    }
    public void printMap() {

    }
    protected List<Human> getHumanInRoomList() {
        return humanInRoomList;
    }

    protected List<Room> getNeighborRooms() {
        return neighborRooms;
    }

    public int getCountOfVisitorsInRoom() {
        int count = 0;
        for (Human h : humanInRoomList) {
            if (!(h instanceof Guard)) {
                ++count;
            }
        }
        return count;
    }
    public List<Artwork> getArtworkList() {
        for (Room r:neighborRooms) {
            r.getArtworkList();
        }
        return getArtworkList();
    }
    public int getCountOfArtworkInRoom(){
        int count = 0;
        for (Room r : neighborRooms){
           count = r.getCountOfArtworkInRoom();
        }
        return count;
    }
    public String getName() {
        return name;
    }
    public Room getRandomNextRoom() {
        if (neighborRooms.isEmpty()) {
            return this;
        }
        return neighborRooms.get(Museum.random.nextInt(neighborRooms.size()));
    }

    public String getColor(){
        return "";
    }
}
