package mariechristine.week10.schwarzwald;

import java.util.Vector;

public class Department {
    private String name;
    private boolean full = true;
    private Vector<Disease> diseasesList;
    private Vector<Ward> wardList;

    public Department(String name) {
        this.name = name;
        diseasesList = new Vector<>();

    }

    public String getName() {
        return name;
    }

    public void addWard(Ward wardList){
    }


    public boolean isFullyOccupied() {
        return full;
    }

    public void printStructure(){
        System.out.println("\n_________________________________\nDepartment: " + getName());
    }
}
