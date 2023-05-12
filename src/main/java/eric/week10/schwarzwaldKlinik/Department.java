package eric.week10.schwarzwaldKlinik;

import java.util.ArrayList;
import java.util.Iterator;
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

    public void removePatient(Patient patient){
        if (patientList.contains(patient)){
            patientList.remove(patient);
        }
    }

    public void dailyRoutine(){
        Iterator<Patient> it = patientList.iterator();
        while(it.hasNext()) {
            Patient p = it.next();
            if(treatment(p)) {
                it.remove();
            }
        }
    }

    /**
     *
     * @param patient
     * @return True if patient should be removed, otherwise false
     */
    protected boolean treatment(Patient patient){
        return false;
    }

}


