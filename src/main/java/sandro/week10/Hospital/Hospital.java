package sandro.week10.Hospital;

import sandro.week09.ZooTycoon.ZooKeeper;

import java.util.Vector;

public class Hospital {

    private String name;
    private int founding;

    private Vector<Department> departmentList;

    public Hospital (String name, int founding){
        this.name = name;
        this.founding = founding;
        this.departmentList = new Vector<>();
    }
    public void addDepartment(Department dep) {
        if (!departmentList.contains(dep)) {
            departmentList.add(dep);
        }
    }


    public void printHospitalStructure (){
        System.out.println("├── " + "Hospital: " + name + " " + "Since: " + founding);
        for (Department dep:departmentList) {
            dep.printHospitalStructure();
        }
    }
}
