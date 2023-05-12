package joachim.week10.model;

import lukas.week03.day4.Colors;

import java.util.List;
import java.util.Random;


public class Table {

    private Restaurant restaurant;
    private VisitorGroup visitorGroup;
    private String name;
    private int size;
    private int timer;

    Random rand = new Random();

    public Table(Restaurant restaurant, String name, int size) {

        this.restaurant = restaurant;
        this.name = name;
        this.size = size;
        this.timer = 0;
    }


    public int getSize() {
        return size;
    }

    public Table getPerfectTable(VisitorGroup vg, Table bestTable) {
        if (visitorGroup == null && this.size >= vg.getSize()) {
            if (bestTable == null) {
                bestTable = this;
            } else if (this.size < bestTable.size) {
                bestTable = this;
            }
        }
        return bestTable;
    }

    public Server order(Server server) {
        Menu m = restaurant.getMenu();
        if (this.visitorGroup != null) {
            for (int i = 0; i < visitorGroup.getSize(); i++) {
                server.addFood(m.getFoodList().get(rand.nextInt(m.getFoodList().size())));
            }
            System.out.println(this.name + " has ordered " + server.getOrder());
        }
        return server;
    }

    public void leave(boolean open) {
        if (this.timer == 3 && visitorGroup != null || !open && visitorGroup != null) {
            System.out.println(visitorGroup + " left Table " + this.name);
            visitorGroup = null;
            this.timer = 0;
        }
        if (visitorGroup != null) {
            this.timer++;
        }
    }

    public void sitDown(VisitorGroup vg) {
        if (visitorGroup == null) {
            System.out.println(Colors.COLORS[4] + vg.getName() + " get seated at " + this.name + Colors.RESET);
            visitorGroup = vg;
        } else {
            System.out.println("Oups!!! This table is not free at the moment");
        }
    }

    public VisitorGroup getVisitorGroup() {
        return visitorGroup;
    }
}