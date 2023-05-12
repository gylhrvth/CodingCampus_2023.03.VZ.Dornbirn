package mariechristine.week10.schwarzwald;

import java.util.Vector;

public class Department {
    private String name;
    private boolean full = true;
    private Vector<Patient> patientList;


    public Department(String name) {
        this.name = name;


    }

    public String getName() {
        return name;
    }

    public boolean isFullyOccupied() {
        return full;
    }

    public void printStructure(){
        System.out.println("_________________________________\n" + getName());
    }
}
