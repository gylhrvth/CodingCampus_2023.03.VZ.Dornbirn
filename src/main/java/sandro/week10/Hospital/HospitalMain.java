package sandro.week10.Hospital;

public class HospitalMain {
    public static void main(String[] args) {

        Hospital sacredHeart = new Hospital("Sacred Heart Hospital", 1991);

        Patient pat1 = new Patient("Mike","van Dyke", 36,3);
        Patient pat2 = new Patient("Susi", "Hamolt", 29,1);
        Patient pat3 = new Patient("Steve", "Blocks", 54, 2);

        Department ambulance = new Department("Ambulance");
        Department station = new Department("Station");
        sacredHeart.addDepartment(ambulance);
        sacredHeart.addDepartment(station);

        Ambulance amb1 = new Ambulance("Ambulance 1", 6, 18, 7, 13);
        ambulance.addAmbulance(amb1);
        WaitingRoom wr1 = new WaitingRoom("Room 1", 30);
        amb1.addWaitingRoom(wr1);
        WaitingRoom wr2 = new WaitingRoom("Room 2", 20);
        amb1.addWaitingRoom(wr2);
        amb1.addPatient(pat1);
        amb1.addPatient(pat2);


        Ambulance amb2 = new Ambulance("Emergency 1", 18,6,14,7);
        ambulance.addAmbulance(amb2);
        WaitingRoom wr3 = new WaitingRoom("Emergency Room 1",5);
        amb2.addWaitingRoom(wr3);
        WaitingRoom wr4 = new WaitingRoom("Emergency Room 2", 5);
        amb2.addWaitingRoom(wr4);
        amb2.addPatient(pat3);

        Station sta1 = new Station("Level A");
        station.addStation(sta1);
        Room room1 = new Room(01, 3);
        sta1.addRoom(room1);
        Room room2 = new Room(02, 4);
        sta1.addRoom(room2);
        Room room3 = new Room(03, 2);
        sta1.addRoom(room3);
        Room room4 = new Room(04, 1);
        sta1.addRoom(room4);

        Station sta2 = new Station("Level B");
        station.addStation(sta2);
        Room room1b = new Room(01, 3);
        sta2.addRoom(room1b);
        Room room2b = new Room(02, 4);
        sta2.addRoom(room2b);
        Room room3b = new Room(03, 2);
        sta2.addRoom(room3b);
        Room room4b = new Room(04, 1);
        sta2.addRoom(room4b);
        Room room5b = new Room(01, 3);
        sta2.addRoom(room5b);
        Room room6b = new Room(02, 4);
        sta2.addRoom(room6b);
        Room room7b = new Room(03, 2);
        sta2.addRoom(room7b);
        Room room8b = new Room(04, 1);
        sta2.addRoom(room8b);

        Station sta3 = new Station("Level C");
        station.addStation(sta3);
        Room room1c = new Room(01, 3);
        sta3.addRoom(room1c);
        Room room2c = new Room(02, 4);
        sta3.addRoom(room2c);
        Room room3c = new Room(03, 2);
        sta3.addRoom(room3c);
        Room room4c = new Room(04, 1);
        sta3.addRoom(room4c);
        Room room5c = new Room(01, 3);
        sta3.addRoom(room5c);
        Room room6c = new Room(02, 4);
        sta3.addRoom(room6c);
        Room room7c = new Room(03, 2);
        sta3.addRoom(room7c);



        sacredHeart.printHospitalStructure();


    }
}
