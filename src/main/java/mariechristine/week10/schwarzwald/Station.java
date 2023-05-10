package mariechristine.week10.schwarzwald;

public class Station extends Department{


    public Station(Hospital hospital, String name){
        super(hospital, name);
    }

    @Override
    public void printStructure() {
        System.out.println("     Station: " + getName());
    }
}
