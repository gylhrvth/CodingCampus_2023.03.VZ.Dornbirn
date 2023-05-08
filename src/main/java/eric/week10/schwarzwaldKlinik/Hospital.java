package eric.week10.schwarzwaldKlinik;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hospital {
    private List<Department> department;

    public Hospital(List<Department> department) {
        this.department = department;
    }

    public void getPatient(Patient patient){
        for (Department department : department) {
            if (department.canPatientRecover(patient)){

            }
        }
    }
}
