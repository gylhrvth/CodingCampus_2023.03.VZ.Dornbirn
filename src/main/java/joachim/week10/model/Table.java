package joachim.week10.model;

import java.util.List;

public class Table {
    private List<Food> foodList;
    private List<Visitor> visitorList;
    private String name;
    private int size;

    public Table(String name, int size){
        this.name = name;
        this.size = size;
    }
    public void addVisitor(Visitor v){
        visitorList.add(v);
    }
}
