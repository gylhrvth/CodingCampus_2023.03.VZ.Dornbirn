package joachim.week09.newZoo;

import java.util.List;
import java.util.Vector;

public class NewDoctor {
    private String name;
    private boolean done;
    private List<NewHabitat> habitatList;
    public NewDoctor(String name, boolean done){
        this.name = name;
        this.done = false;
        habitatList = new Vector<>();
    }

    public String getName() {
        return name;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
