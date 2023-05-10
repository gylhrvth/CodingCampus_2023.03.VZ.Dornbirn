package mariechristine.week10.schwarzwald;

import java.util.Vector;

public class Department {
    private String name;
    private boolean full = true;
    private Vector<Disease> diseasesList;

    public Department(Hospital hospital, String name) {
        this.name = name;
        diseasesList = new Vector<>();
        hospital.addDepartment(this);
    }

    public String getName() {
        return name;
    }

    public boolean isFullyOccupied() {
        return full;
    }

    public void printStructure(){
    }
}
