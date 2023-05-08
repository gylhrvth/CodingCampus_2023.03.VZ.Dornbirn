package eric.week10.schwarzwaldKlinik;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("Schwarzwald Klinik", 1947);

        Patient patient = new Patient(33);

        Ambulance ambulance = new Ambulance(7, 17, 30);

    }
}
