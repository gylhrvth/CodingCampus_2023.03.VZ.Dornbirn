package joachim.week10.model;

import lukas.week03.day4.Colors;

import java.util.List;
import java.util.Vector;

public class Restaurant {
    private String name;
    private List<Room> roomList;

    private Menu menu;
    private Server chiefServer;


    public Restaurant(String name, Server chiefServer, Menu menu) {
        this.roomList = new Vector<>();
        this.menu = menu;

        this.name = name;
        this.chiefServer = chiefServer;
    }


    public void addRoom(Room r) {
        roomList.add(r);
    }



    public void arrive(VisitorGroup vg) {
        System.out.println(Colors.COLORS[2] + chiefServer + " greets the guests in restaurant." + Colors.RESET);

        Table table = getPerfectTable(vg);
        if (table != null) {
            table.sitDown(vg);
            for(Room room : roomList){
                room.order();
            }
        } else {
            System.out.println("No free table for " + vg.getName() + " at the moment. They must wait...");
        }
    }

    public void leave(boolean open) {
        for (Room room : roomList) {
            room.leave(open);
        }
    }

    private Table getPerfectTable(VisitorGroup vg) {
        Table bestTable = null;
        for (Room rooms : roomList) {
            bestTable = rooms.getPerfectTable(vg, bestTable);
        }
        return bestTable;
    }

    public Menu getMenu() {
        return menu;
    }
}