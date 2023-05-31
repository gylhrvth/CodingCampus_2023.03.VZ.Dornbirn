package joachim.week10.restaurante;

import lukas.week03.day4.Colors;

import java.util.List;
import java.util.Vector;

public class Room {
    private Vector<Table> tablelist;
    private Waiter waiter;
    private String name;

    public Room(String name) {
        this.name = name;
        this.tablelist = new Vector<>();
        this.waiter = null;
    }

    public void addTable(Table... table) {
        this.tablelist.addAll(List.of(table));
    }

    public Vector<Table> getTablelist() {
        return tablelist;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public Waiter getWaiter() {
        return waiter;
    }


    public boolean tableArrive(boolean tableFound, ChefWaiter james) {
        VisitorGroup vg = new VisitorGroup();
        int index = 0;
        while (!tableFound && index < getTablelist().size()) {
            Table table = getTablelist().get(index);
            if (vg.getAmount() == table.getSpace() && table.getVisitorGroup() == null) {
                System.out.println(Colors.COLORS[5] + james + " seated the Group at " + this.name + " at " + table.getName() + Colors.RESET);
                table.addVisitor(vg);
                tableFound = true;
            } else if (vg.getAmount() < table.getSpace() && table.getVisitorGroup() == null) {
                System.out.println(Colors.COLORS[5] + james + " seated the Group at " + this.name + " at " + table.getName() + Colors.RESET);
                table.addVisitor(vg);
                tableFound = true;
            }
            if(index == getTablelist().size() && !tableFound) {
                System.out.println("No Table found");
                tableFound = true;
            }
            ++index;
        }
        return tableFound;
    }
}