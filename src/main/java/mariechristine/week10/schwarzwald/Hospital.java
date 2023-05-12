package mariechristine.week10.schwarzwald;

import lukas.week03.day4.Colors;

import java.util.Vector;

public class Hospital {
    private String name;
    private Vector<Patient> patientList;
    private Vector<Department> departmentList;

    public Hospital(String name) {
        this.name = name;
        this.patientList = new Vector<>();
        this.departmentList = new Vector<>();
    }

    public void addDepartment(Department department) {
        if (!departmentList.contains(department)) {
            departmentList.add(department);
        }
    }

    public String getName() {
        return name;
    }

    public void setNewDay() {
        for (Department department : departmentList) {
            department.isFullyOccupied();
        }
    }

    public void printStructure() {
        System.out.println("***** " + Colors.COLORS[4] + name + Colors.RESET + " *****" + Colors.COLORS[4] + "\n            ENTRANCE" + Colors.RESET);
        for (Department department : departmentList) {
            department.printStructure();
        }

    }

    public void simulate() {
        System.out.println("***** " + Colors.COLORS[4] + name + Colors.RESET + " *****" + Colors.COLORS[4] + "\n            ENTRANCE" + Colors.RESET);


    }
}
