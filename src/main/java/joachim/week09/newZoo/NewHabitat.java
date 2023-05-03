package joachim.week09.newZoo;

import lukas.week03.day4.Colors;

import java.util.List;
import java.util.Vector;

public class NewHabitat {
    private String name;
    private List<NewAnimal> animalList;


    public NewHabitat(String name) {
        this.name = name;
        this.animalList = new Vector<>();

    }

    public NewAnimal findOrCreateAnimal(String name, String genus, int age) {
        for (NewAnimal animal : animalList) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        NewAnimal newnewAnimal = new NewAnimal(name, genus, age);
        animalList.add(newnewAnimal);
        return newnewAnimal;
    }

    public String getName() {
        return name;
    }

    public void printLayout(List<NewSupervisor> supervisorList) {

        System.out.println(Colors.COLORS[1] + "│   ├──" + Colors.COLORS[2] + " Habitat: " + name + Colors.RESET);
        if (supervisorList.isEmpty()) {
            System.out.println(Colors.COLORS[1] + "│   │   ├──" + Colors.COLORS[7] + "without any Supervisor" + Colors.RESET);
        } else {
            for (NewSupervisor s : supervisorList) {
                System.out.println(Colors.COLORS[1] + "│   │   ├── " + Colors.COLORS[7] + s + Colors.RESET);
            }
        }
        if (animalList.isEmpty()) {
            System.out.println(Colors.COLORS[1] + "│   │   ├── without any animal within" + Colors.RESET);
        } else {
            for (NewAnimal a : animalList) {
                System.out.println(Colors.COLORS[1] + "│   │   ├── " + a + Colors.RESET);
            }
        }
    }
}