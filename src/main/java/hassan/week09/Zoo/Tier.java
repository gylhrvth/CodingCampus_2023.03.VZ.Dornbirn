package hassan.week09.Zoo;

import java.util.HashMap;
import java.util.Map;

public class Tier {
    private String name;
    private String gattung;
    private HashMap<Futter,Double> futterbedarf;

    public Tier(String name, String gattung){
        this.name = name;
        this.gattung = gattung;
        this.futterbedarf = new HashMap<>();
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
