package mert.week09;

import java.util.Vector;

public class Pfleger {
    private String name;

    Vector<Gehege> gehegeList;

    public Pfleger(String name) {
        this.name = name;
        gehegeList = new Vector<>();
    }
    public void simulateTage(){
        for (Gehege g : gehegeList) {
            g.simulateTage(this);
        }
    }

    public String getName() {
        return name;
    }

    public void addGehegeList(Gehege gehege) {
        gehegeList.add(gehege);
    }

    public void printzoo() {
        System.out.print(name + " ist verantwortlich für ");
        for (Gehege g : gehegeList) {
            if (!g.equals(gehegeList.firstElement())){
                if (!g.equals(gehegeList.lastElement())){
                    System.out.print(", ");
                } else  {
                    System.out.print(" und ");
                }
            }
            System.out.print(g.getName());
        }
        System.out.println();
    }

}


