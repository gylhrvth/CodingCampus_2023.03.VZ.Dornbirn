package joachim.week10.model;


public class VisitorGroup {


    private String name;
    private int size;

    public VisitorGroup(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
