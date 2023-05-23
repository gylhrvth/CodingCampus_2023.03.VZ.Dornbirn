package joachim.week10.restaurante;

import lukas.week03.day4.Colors;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class Restaurant {
    private Vector<Room> rooms;
    private String name;
    Random rand = new Random();

    public Restaurant(String name) {
        this.name = name;
        this.rooms = new Vector<>();
    }

    public void addRooms(Room... rooms) {
        this.rooms.addAll(Arrays.asList(rooms));
    }

    public Vector<Room> getRooms() {
        return rooms;
    }

    public void arrival(ChefWaiter james) {
        for (int i = 0; i <= rand.nextInt(4,5); i++) {
            Collections.shuffle(rooms);
            int indexRoom = 0;
            boolean tableFound = false;
            while (!tableFound && indexRoom < rooms.size()) {
                Room room = rooms.get(indexRoom);
                tableFound = room.tableArrive(false, james);
                ++indexRoom;
            }
        }
    }
}
