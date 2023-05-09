package sandro.week10.Hospital;

public class Room {
    private int roomNr;
    private int bed;


    public Room(int roomNr, int bed){
        this.roomNr = roomNr;
        this.bed = bed;
    }

    public int getBed() {
        return bed;
    }




    public void printHospitalStructure (){
        System.out.println("│   │   │   ├── RoomNumber: " +roomNr + ", BedCapacity: "+ bed);
    }
}
