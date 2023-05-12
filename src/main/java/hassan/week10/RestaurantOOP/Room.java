package hassan.week10.RestaurantOOP;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private Waiter waiter;
    private List<Guest> guestList;
    private List<Table> tableList;

    public Room(String name, Waiter waiter) {
        this.name = name;
        this.waiter = waiter;
        this.tableList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public List<Table> getTableList() {
        return tableList;
    }
    public Table assignTable() {
        for (Table table : tableList) {
            if (table.isAvailable()) {
                return table;
            }
        }
        return null;
    }
}
