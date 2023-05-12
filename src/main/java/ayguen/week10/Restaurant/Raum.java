package ayguen.week10.Restaurant;

import java.util.Vector;

public class Raum {

    private String raumName;
    Vector<Kellner> kellnerList;
    Vector<Tisch> tischlist;

    public Raum(String raumName) {
        this.raumName = raumName;
        this.kellnerList = new Vector<>();
        this.tischlist = new Vector<>();
    }

    public void addTisch(Tisch tisch) {
        tischlist.add(tisch);
    }

    public void printRaumName(Kellner kellner) {
        System.out.println("│   ├── Raumname : " + raumName + " >> Kellner : " + kellner.getName());
    }

    public void arbeitetinRaum(Kellner kellner) {

        System.out.println(kellner.getName() + " arbeitet in raum : " + raumName);
    }

    public String getRaumName() {
        return raumName;
    }
}
