package joachim.week09.zoo;


import lukas.week03.day4.Colors;

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
        System.out.println(Colors.COLORS[1] + "├── Zoo: " + Colors.RESET + name + ", found: " + foundingyear);
        if (habitatsList.isEmpty()) {
            System.out.println("      without any habitat");
        } else {
            for (Habitat h : habitatsList) {
                h.printLayout();
            }
        }
    }

    public void printSupervisors() {

    }


    @Override
    public String toString() {
        return habitatsList.toString();
    }


    public void printDailyCost() {
        HashMap<Food, Integer> foodRequest = new HashMap<>();

        for (Habitat h : habitatsList) {
            h.collectFoodRequest(foodRequest);
        }

        double cost = 0.0;
        for (Food f : foodRequest.keySet()) {
            System.out.println(Colors.COLORS[5] + f.getName() + " " + foodRequest.get(f) + " " + f.getUnit() + Colors.RESET);
            cost += foodRequest.get(f) * f.getCost();
        }
        System.out.printf(Colors.COLORS[5] + "Kostenpunkt: %.2f€.\n" + Colors.RESET, cost);
    }


    public Supervisor searchAndCreateSupervisor(String name, String... nameOfHabitats){
        return null;
    }

}