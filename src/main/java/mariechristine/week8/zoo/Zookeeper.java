package mariechristine.week8.zoo;

import java.util.Vector;

public class Zookeeper {
    private String name;
    private Vector<Gehege> enclosureList;

    public Zookeeper(String name){
        this.name = name;
        this.enclosureList = new Vector<>();
    }

    public String getName() {
        return name;
    }

    public void printStructure(){
        System.out.println("            | Zuständigkeit: " + name);
        if (enclosureList.isEmpty()) {
            System.out.println("            | Keine Zuständigkeit");
        }
    }


    @Override
    public String toString() {
        return name;
    }
}
