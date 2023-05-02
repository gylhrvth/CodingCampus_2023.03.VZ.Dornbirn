package eric.week09.zoo;

import lukas.week03.day4.Colors;

import java.util.ArrayList;

public class Zookeeper {
    private String name;
    private ArrayList<Enclosure> enclosure;
    public Zookeeper(String name){
        this.name = name;
        this.enclosure = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void addEnclosure(Enclosure enc){
        enclosure.add(enc);
    }
    public ArrayList<Enclosure> getEnclosure() {
        return enclosure;
    }
    public void removeEnclosure(Enclosure enc){
        enclosure.remove(enc);
    }

    public void printZookeeper(){
        System.out.println("│  │  ├── " + Colors.COLORS[4] + "Zookeeper: " + getName() + Colors.RESET);
    }
}
