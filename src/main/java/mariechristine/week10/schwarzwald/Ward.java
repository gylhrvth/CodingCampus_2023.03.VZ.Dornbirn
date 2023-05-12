package mariechristine.week10.schwarzwald;

public class Ward extends Department{


    public Ward(String name){
        super(name);
    }

    @Override
    public void printStructure() {
        System.out.println("Ward: " + getName());
    }
}
