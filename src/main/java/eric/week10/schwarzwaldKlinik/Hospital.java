package eric.week10.schwarzwaldKlinik;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hospital {
    private static Random rand =  new Random();
    private String name;
    private int foundedYear;
    private List<Patient> patientList;
    private List<Ambulance> ambulanceList;
    private List<Station> stationList;

    public Hospital(String name, int foundedYear) {
        this.name = name;
        this.foundedYear = foundedYear;
        patientList = new ArrayList<>();
        ambulanceList = new ArrayList<>();
        stationList = new ArrayList<>();
    }

    public void getRandomPatient(){
        if (patientList.size() > rand.nextInt(70)){
            System.out.println("Patient has been assigned to a Stationary Room");
        }
    }
}
