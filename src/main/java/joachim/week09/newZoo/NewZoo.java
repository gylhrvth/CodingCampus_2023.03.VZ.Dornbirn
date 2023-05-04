package joachim.week09.newZoo;

import lukas.week03.day4.Colors;

import java.util.List;
import java.util.Vector;

public class NewZoo {
    private int foundingyear;
    private String name;
    private List<NewHabitat> habitatList;
    private List<NewSupervisor> supervisorList;

    public NewZoo(String name, int foundingyear) {
        this.name = name;
        this.foundingyear = foundingyear;
        this.habitatList = new Vector<>();
        this.supervisorList = new Vector<>();
    }

    public NewHabitat findOrCreateHabitat(String description) {
        for (NewHabitat habitat : habitatList) {
            if (habitat.getName().equals(description)) {
                return habitat;
            }
        }
        NewHabitat newHabitat = new NewHabitat(description);
        habitatList.add(newHabitat);
        return newHabitat;
    }

    public NewSupervisor findOrCreateSupervisor(String description, NewZoo zoo, String... tasks) {
        for (NewSupervisor supervisor : supervisorList) {
            if (supervisor.getName().equals(description)) {
                return supervisor;
            }
        }
        NewSupervisor newSupervisor = new NewSupervisor(description, zoo, tasks);
        supervisorList.add(newSupervisor);
        return newSupervisor;
    }

    public NewAnimal findOrCreateAnimal(String name, String species, String habitatName, int age) {
        NewHabitat newHabitat = findOrCreateHabitat(habitatName);
        return newHabitat.findOrCreateAnimal(name, species, age);
    }

    public void printLayout() {
        System.out.println(Colors.COLORS[1] + "├── Zoo: " + Colors.RESET + name + ", found: " + foundingyear);

        if (habitatList.isEmpty()) {
            System.out.println("      without any habitat");
        } else {
            for (NewHabitat h : habitatList) {
                h.printLayout(supervisorList);
            }
        }
    }
}