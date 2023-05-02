package joachim.week09.zoo;

import org.ietf.jgss.ChannelBinding;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class Zoo {
    private int foundingyear;
    private String name;

    private List<Habitat> habitatsList;

    public Zoo(String name, int foundingyear) {
        this.name = name;
        this.foundingyear = foundingyear;
        this.habitatsList = new Vector<>();
    }


    public int getFoundingyear() {
        return foundingyear;
    }

    public String getName() {
        return name;
    }

    public void addHabitat(Habitat h) {
        habitatsList.add(h);
    }

    public void printLayout() {
        System.out.println("├── Zoo: " + name + ", found: " + foundingyear);
        if (habitatsList.isEmpty()) {
            System.out.println("      without any habitat");
        } else {
            for (Habitat h : habitatsList) {
                h.printLayout();
            }
        }
    }

    @Override
    public String toString() {
        return habitatsList.toString();
    }


    public void printDailyCost(){
        HashMap<Food, Integer> foodRequest = new HashMap<>();

        for (Habitat h: habitatsList) {
            h.collectFoodRequest(foodRequest);
        }

        System.out.println(foodRequest);
        double cost = 0.0;
        for (Food f: foodRequest.keySet()) {
            System.out.println(f.getName() + " " + foodRequest.get(f) + " " + f.getUnit());
            cost += foodRequest.get(f) * f.getCost();
        }
        System.out.printf("Kostenpunkt: %.2f€.\n", cost);
    }

}