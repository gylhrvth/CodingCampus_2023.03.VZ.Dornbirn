package joachim.week09.zoo;

import lukas.week03.day4.Colors;

import java.util.HashMap;
import java.util.List;
import java.util.Vector;

public class Habitat {
    private String name;
    private List<Animal> animalList;
    private List<Supervisor> supervisorList;

    public Habitat(String name) {
        this.name = name;
        this.animalList = new Vector<>();
        this.supervisorList = new Vector<>();


    }

    public void addAnimal(Animal a) {
        animalList.add(a);
    }

    public String getName() {
        return name;
    }
    public void addSupervisor(Supervisor s){
        supervisorList.add(s);
    }

    public void printLayout() {
        System.out.println(Colors.COLORS[1] +"│   ├──" +Colors.COLORS[2] + " Habitat: "+  name + Colors.RESET);
        if(supervisorList.isEmpty()){
            System.out.println(Colors.COLORS[1] +"│   │   ├──" + Colors.COLORS[7] + "without any Supervisor"+Colors.RESET);
        }else{
            for (Supervisor s: supervisorList) {
                System.out.println(Colors.COLORS[1] +"│   │   ├── " + Colors.COLORS[7] + s + Colors.RESET);

            }
        }
        if (animalList.isEmpty()) {
            System.out.println(Colors.COLORS[1] +"│   │   ├── without any animal within"+Colors.RESET);
        } else {
            for (Animal a : animalList) {
                System.out.println(Colors.COLORS[1] +"│   │   ├── " + a + Colors.RESET);
            }
        }
    }

    @Override
    public String toString() {
        return name;
    }

    public void collectFoodRequest(HashMap<Food, Integer> foodRequest){
        for (Animal a: animalList){
            a.collectFoodRequest(foodRequest);
        }
    }
}
