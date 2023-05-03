package hassan.week09.Zoo;

import java.util.ArrayList;
import java.util.List;

public class Pfleger {
    private String name;
    private List<Gehege> gehegeList;

    public Pfleger(String name){
        this.name = name;
        gehegeList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGehege(Gehege gehege){
        gehegeList.add(gehege);
    }

    public void removeGehege(Gehege gehege){
        gehegeList.remove(gehege);
    }
    public List<Gehege> getGehegeList(){
        return gehegeList;
    }
}
