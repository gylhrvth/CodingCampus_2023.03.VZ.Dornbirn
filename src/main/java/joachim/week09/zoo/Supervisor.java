package joachim.week09.zoo;

import lukas.week03.day4.Colors;

import java.util.List;
import java.util.Vector;

public class Supervisor {
    private String name;
    private List<Habitat> habitatList;

    public Supervisor(String name) {
        this.name = name;
        habitatList = new Vector<>();
    }

    public void addHabitat(Habitat h) {
        habitatList.add(h);
    }

    public String getName() {
        return name;
    }

//    public void printLayout() {
//        System.out.println(Colors.COLORS[7] + "├── Supervisor: " + name + Colors.RESET);
//        if (habitatList.isEmpty()) {
//            System.out.println("      without any habitat");
//        } else {
//            for (Habitat h : habitatList) {
//                System.out.println(h);;
//            }
//        }
//    }

    @Override
    public String toString() {
        return name;
    }

    public void printLayout() {
        System.out.println(Colors.COLORS[1] + "├── " + Colors.COLORS[2] +"Supervisor: " +  name + Colors.RESET);
        for (Habitat h : habitatList) {
            System.out.println(Colors.COLORS[1] +"│       ├── " + Colors.RESET + Colors.COLORS[7] + h + Colors.RESET);
        }
    }
}

