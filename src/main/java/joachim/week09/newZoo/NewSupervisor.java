package joachim.week09.newZoo;


import java.util.List;
import java.util.Vector;

public class NewSupervisor {
    private String name;
    private List<NewHabitat> habitatList;

    public NewSupervisor(String name, NewZoo zoo, String... tasks) {
        this.name = name;
        habitatList = new Vector<>();
        for (String s : tasks) {
            habitatList.add(zoo.findOrCreateHabitat(s));
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}