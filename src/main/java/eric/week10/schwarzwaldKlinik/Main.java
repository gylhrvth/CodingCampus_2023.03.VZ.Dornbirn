package eric.week10.schwarzwaldKlinik;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Schwarzwald Klinik", 1947);

        Station station = new Station("Station");
        Ambulance ambulance = new Ambulance("Notfall Ambulance", station, 7, 15, 50);


        Patient herald = new Patient("Herrald", "Gebrochener Fuß", 50, 100);
        Patient gertrud = new Patient("Gertrud", "Lungen Krebs", 20, 100);
        Patient thomas = new Patient("Thomas", "Geprellte Rippen", 60, 100);
        Patient hilde = new Patient("Hilde", "Husten", 90,100);
        Patient otto = new Patient("Otto", "Wasser in der Lunge", 5,100);

        Room room1 = new Room(1, station);
        Room room2 = new Room(2, station);
        Room room3 = new Room(3, station);
        Room room4 = new Room(4, station);
        Room room5 = new Room(5, station);
        Room room6 = new Room(6, station);

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

        for (int tag = 1; tag <= 7 ; tag++) {
            System.out.println("\nDay [" + tag + "]");
            hospital.dailyRoutine();
        }
    }
}
