package eric.week10.schwarzwaldKlinik;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    protected List<Patient> patientList;


    public Department(String name) {
        this.name = name;
        patientList = new ArrayList<>();

    }

    public void addPatient(Patient patient){
        if (!patientList.contains(patient)){
            patientList.add(patient);
        }
    }

    public void dailyRoutine(){
        for (Patient p : patientList) {
            treatment(p);
        }
    }

    protected void treatment(Patient patient){
    }

}


