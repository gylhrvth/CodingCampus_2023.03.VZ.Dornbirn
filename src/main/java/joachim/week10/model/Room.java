package joachim.week10.model;

import java.util.List;
import java.util.Vector;

public class Room {
    private List<Table> tableList;
    private List<Server> serverList;
    private String name;

    public Room(String name) {
        this.tableList = new Vector<>();
        this.serverList = new Vector<>();
        this.name = name;

    }

    public void addTable(Table t) {
        tableList.add(t);
    }

    public void addServer(Server s) {
        serverList.add(s);
    }

    public List<Table> getTableList() {
        return tableList;
    }

    public List<Server> getServerList() {
        return serverList;
    }

}
