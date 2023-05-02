package joachim.week09.zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Zoo {
    private int foundingyear;
    private String name;

    private List<Habitat> habitatsList;

    public Zoo(String name, int foundingyear){
        this.name = name;
        this.foundingyear = foundingyear;
        this.habitatsList = new ArrayList<>();
    }

    public int getFoundingyear() {
        return foundingyear;
    }

    public String getName() {
        return name;
    }

    public void addHabitat(Habitat h){
        habitatsList.add(h);
    }
}