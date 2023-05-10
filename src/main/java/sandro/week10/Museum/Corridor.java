package sandro.week10.Museum;

public class Corridor extends Room {

    public Corridor(String name) {
        super(name);

    }

    public void printStructure() {
        System.out.println("------- Corridor: " +getName()+" / connected to: "+ getNeighborRooms());

    }
    public void printMap() {
        System.out.println("Corridor: " +getName() +"\nPeople here: " +getHumanInRoomList()
        //        + "\nGuard: "
        //        + "\nGuest: "
        //        + "\nThief: "
        );
    }

    @Override
    public String toString() {
        return "Corridor: " + getName();
    }
}
