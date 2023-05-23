package gyula.week10.emergency;

public class Ambulance extends EmergencyGroup {
    private String name;

    public Ambulance(String name){
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println(name + " starts an emergency response and try to help people.");
        inAction = true;
    }

    @Override
    public void returnToBase() {
        System.out.println(name + " returns to the base.");
        inAction = false;
    }

    @Override
    public String toString() {
        return "Ambulance " + name;
    }
}
