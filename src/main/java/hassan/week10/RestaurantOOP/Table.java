package hassan.week10.RestaurantOOP;

import hassan.week10.RestaurantOOP.Guest;

public class Table {
    private int number;
    private int capacity;
    private Guest seatedGuest;
    private int state = 0; // 0 = frei, 1 = bestellt, 2 = serviert, 3 = abgerechnet


    public Table(int tableNumber, int capacity) {
        this.number = tableNumber;
        this.capacity = capacity;
        this.seatedGuest = null;
    }

    public void assignGuest(Guest guest) {
        this.seatedGuest = guest;
        System.out.println("Gast " + guest.getName() + " wurde Tisch " + number + " zugewiesen.");
    }
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Guest getSeatedGuest() {
        return seatedGuest;
    }

    public int getNumber() {
        return number;
    }

    public boolean isAvailable() {
        return seatedGuest == null;
    }

    public int getCapacity() {
        return capacity;
    }
}
