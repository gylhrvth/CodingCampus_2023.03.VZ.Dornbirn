package joachim.week10.restaurante;

public class Table {
    private int space;
    private VisitorGroup visitorGroup;
    private String name;

    public Table(String name, int space){
        this.space = space;
        this.visitorGroup = null;
        this.name = name;
    }

    public int getSpace() {
        return space;
    }
    public void addVisitor(VisitorGroup vg){
        this.visitorGroup = vg;
    }

    public VisitorGroup getVisitorGroup() {
        return visitorGroup;
    }

    public String getName() {
        return name;
    }
}
