package mariechristine.week10.schwarzwald;



public class HospitalMain {
    public static void main(String[] args) {
        Hospital bfh = new Hospital("BLACK FOREST HOSPITAL");
        Ward rad = new Ward("Radiology");
        Ward ger = new Ward("Geriatrics");
        Ward pul = new Ward("Pulmonology");

        Ambulance acc = new Ambulance("ACCIDENT","07:00 - 22:00",8);
        Ambulance pain = new Ambulance("PAIN", "07:00 - 22:00", 10);
        Ambulance sur = new Ambulance("SURGERY", "07:00 - 22:00", 4);

        Room a = new Room(1, 5);
        Room b = new Room(2, 3);
        Room c = new Room(3, 2);
        Room d = new Room(4, 6);
        Room e = new Room(5, 4);
        Room f = new Room(6, 7);
        Patient eva = new Patient("Eva", 15);
        Patient tim = new Patient("Tim", 5);
        Patient tom = new Patient("Tom", 60);
        Patient lui = new Patient("Lui", 38);
        Patient bob = new Patient("Bob", 22);
        Patient lia = new Patient("Lia", 70);
        Patient ben = new Patient("Ben", 45);
        Patient isa = new Patient("Isa", 57);

        bfh.addDepartment(rad);
        bfh.addDepartment(ger);
        bfh.addDepartment(pul);
        bfh.addDepartment(acc);
        bfh.addDepartment(pain);
        bfh.addDepartment(sur);

        bfh.printStructure();

//        for (int i = 0; i < 8; i++) {
//            bfh.setNewDay();
//        }



    }

}
