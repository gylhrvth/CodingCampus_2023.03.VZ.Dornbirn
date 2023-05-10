package eric.week10.schwarzwaldKlinik;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Schwarzwald Klinik", 1947);

        Station station = new Station("Station");
        Ambulance ambulance = new Ambulance("Notfall Ambulance", station, 7, 15, 50);


        Patient herald = new Patient("Herrald", "Gebrochener Fuß", 35);
        Patient gertrud = new Patient("Gertrud", "Lungen Krebs", 99);
        Patient thomas = new Patient("Thomas", "Geprellte Rippen", 40);
        Patient hilde = new Patient("Hilde", "Husten", 15);
        Patient otto = new Patient("Otto", "Sprunggelenk gerissen", 75);

        Room room1 = new Room(1);
        Room room2 = new Room(2);
        Room room3 = new Room(3);
        Room room4 = new Room(4);
        Room room5 = new Room(5);
        Room room6 = new Room(6);

        station.addRoom(room1);
        station.addRoom(room2);
        station.addRoom(room3);
        station.addRoom(room4);
        station.addRoom(room5);
        station.addRoom(room6);


        hospital.addDepartment(ambulance);
        hospital.addDepartment(station);

        ambulance.addPatient(herald);
        ambulance.addPatient(gertrud);
        ambulance.addPatient(thomas);
        ambulance.addPatient(hilde);
        ambulance.addPatient(otto);

        for (int tag = 1; tag <= 10 ; tag++) {
            System.out.println("Day [" + tag + "]");
            hospital.dailyRoutine();
        }
    }
}
