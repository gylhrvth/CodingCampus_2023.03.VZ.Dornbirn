package eric.week10.schwarzwaldKlinik;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private int foundingYear;

    private List<Department> departmentList;

    public Hospital(String name, int foundingYear) {
        this.name = name;
        this.foundingYear = foundingYear;
        departmentList = new ArrayList<>();
    }


    public void addDepartment(Department department){
        departmentList.add(department);
    }

    public void dailyRoutine(){
        for (Department department: departmentList){
            department.dailyRoutine();
        }
    }

}
