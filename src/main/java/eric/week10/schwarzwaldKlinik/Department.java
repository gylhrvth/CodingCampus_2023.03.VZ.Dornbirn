package eric.week10.schwarzwaldKlinik;

import java.util.List;

public class Department {
    private List<Patient> patient;

    public Department(List<Patient> patient) {
        this.patient = patient;
    }
    public boolean canPatientRecover(Patient patient){
        return true;
    }
    public void patientReceived(Patient patient){

    }
}
