package eric.week10.schwarzwaldKlinik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Room {
    private List<Patient> patientList;
    private int roomNumber;
    private int getHP;
    private boolean restorePatient;
    private Department department;

    public Room(int roomNumber, Department responsibleDepartment) {
        this.roomNumber = roomNumber;
        this.patientList = new ArrayList<>();
        this.getHP = 10;
        this.restorePatient = false;
        this.department = responsibleDepartment;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void admittedPatient(Patient patient) {
        patientList.add(patient);
    }

    public void treatPatient() {
        Iterator<Patient> it = patientList.iterator();
        while (it.hasNext()) {
            Patient p = it.next();
            p.treat();
            if (p.isHealed()) {
                department.removePatient(p);
                it.remove();
            }
        }
    }
}
