package joachim.week10.model;

import java.util.List;
import java.util.Vector;

public class Visitor {
    private List<Visitor> visitorList;

    public Visitor(int amount){
        this.visitorList = new Vector<Visitor>();
    }

    public List<Visitor> getVisitorList() {
        return visitorList;
    }
}
