package sandro.week10.Hospital;

import java.util.Vector;

public class Department {
    private String name;
    private Vector<Ambulance> ambulanceList;
    private Vector<Station> stationList;

    public Department(String name){
        this.name = name;
        this.ambulanceList = new Vector<>();
        this.stationList = new Vector<>();
    }

    public void addAmbulance(Ambulance amb) {
        if (!ambulanceList.contains(amb)) {
            ambulanceList.add(amb);
        }
    }
    public void addStation(Station st) {
        if (!stationList.contains(st)) {
            stationList.add(st);
        }
    }


    public void printHospitalStructure(){
        System.out.println("│   ├── " + "Department: " + name);
        for (Ambulance amb:ambulanceList) {
            amb.printHospitalStructure();
        }

        for (Station st:stationList) {
            st.printHospitalStructure();
        }
    }
}
