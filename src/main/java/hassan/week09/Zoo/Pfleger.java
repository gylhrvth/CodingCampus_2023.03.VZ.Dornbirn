package hassan.week09.Zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pfleger {
    private String name;
    private List<Gehege> gehegeList;
    private String lieblingsGattung;

    public Pfleger(String name) {
        this.name = name;
        gehegeList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLieblingsGattung() {
        return lieblingsGattung;
    }

    public void doesWork() {
        if (this.gehegeList.isEmpty()) {
            System.out.println(this.getName() + " hat keine Gehege zugewiesen bekommen.");
            return;
        }

        for (Gehege gehege : this.gehegeList) {
            if (!gehege.isBearbeitet()) {
                System.out.println(this.getName() + " bearbeitet Gehege " + gehege.getName());
                for (Tier tier : gehege.getTiere()) {
                    tier.fressen();
                }
                gehege.setBearbeitet(true);
                //return;
            }
        }
        Random random = new Random();
        int index = random.nextInt(gehegeList.size());
        Gehege gehege = gehegeList.get(index);
        if (!gehege.isBearbeitet()) {
            System.out.println(this.getName() + " bearbeitet Gehege " + gehege.getName());
            for (Tier tier : gehege.getTiere()) {
                tier.fressen();
            }
            gehege.setBearbeitet(true);
        }
        List<Tier> tierList = gehege.getTiere();
        if (!tierList.isEmpty()) {
            int tierIndex = random.nextInt(tierList.size());
            Tier tier = tierList.get(tierIndex);

            // Tier länger beobachten
            System.out.println(name + " beobachtet " + tier.getName() + " länger.");

            // Wenn das Tier zur Lieblingsgattung des Pflegers gehört, kann der Pfleger es bewundern
            if (tier.getGattung().equals(lieblingsGattung)) {
                System.out.println(name + " bewundert " + tier.getName() + ".");
            }
        }


    }


    public void addGehege(Gehege gehege) {
        gehegeList.add(gehege);
    }

    public void removeGehege(Gehege gehege) {
        gehegeList.remove(gehege);
    }

    public List<Gehege> getGehegeList() {
        return gehegeList;
    }
}
