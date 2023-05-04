package hassan.week09.Zoo;

import java.util.HashMap;
import java.util.Map;

public class Tier {
    private String name;
    private String gattung;
    private HashMap<Futter,Double> futterbedarf;
    private boolean hungrig;

    public Tier(String name, String gattung){
        this.name = name;
        this.gattung = gattung;
        this.futterbedarf = new HashMap<>();
        this.hungrig = true;
    }
    public void fressen() {
        if (hungrig) {
            System.out.println(name + " frisst.");
            hungrig = false;
        } else {
            System.out.println(name + " hat keinen Hunger.");
        }
    }
    public void addFutterbedarf(Futter futter, double menge) {
        futterbedarf.put(futter, menge);
    }
    public String getName(){
        return name;
    }

    public String getGattung() {
        return gattung;
    }
    public HashMap<Futter, Double> getFutterbedarf() {
        return futterbedarf;
    }

    public void printStruktur(){
        System.out.println("│   │   ├── " + name + ", " + gattung);
    }
}
