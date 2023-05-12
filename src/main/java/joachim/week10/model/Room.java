package joachim.week10.model;

import java.util.List;
import java.util.Vector;

public class Room {
    private List<Table> tableList;
    private String name;

    private Server server;

    public Room(String name, Server server) {
        this.tableList = new Vector<>();
        this.name = name;
        this.server = server;

    }


    public void addTable(Table t) {
        tableList.add(t);
    }

    public Server order() {
        for (Table table : tableList) {
            if (table.getVisitorGroup() != null) {
                this.server.addAllorder(table.order(this.server).getOrder());
            }
        }
        return this.server;
    }

    public List<Table> getTableList() {
        return tableList;
    }

    public void leave(boolean open) {
        for (Table table : tableList) {
            table.leave(open);
        }
    }

    public Table getPerfectTable(VisitorGroup vg, Table bestTable) {
        for (Table tables : tableList) {
            bestTable = tables.getPerfectTable(vg, bestTable);
        }
        return bestTable;
    }

}
