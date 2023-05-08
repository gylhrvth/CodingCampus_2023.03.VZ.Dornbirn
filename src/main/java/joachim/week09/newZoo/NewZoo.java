package joachim.week09.newZoo;

import lukas.week03.day4.Colors;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class NewZoo {
    static Random rand = new Random();
    private int foundingyear;
    private String name;
    private List<NewHabitat> habitatList;
    private List<NewSupervisor> supervisorList;
    private List<NewDoctor> doctorList;

    public NewZoo(String name, int foundingyear) {
        this.name = name;
        this.foundingyear = foundingyear;
        this.habitatList = new Vector<>();
        this.supervisorList = new Vector<>();
        this.doctorList = new Vector<>();
    }

    public NewHabitat findOrCreateHabitat(String description) {
        for (NewHabitat habitat : habitatList) {
            if (habitat.getName().equals(description)) {
                return habitat;
            }
        }
        NewHabitat newHabitat = new NewHabitat(description, false, false);
        habitatList.add(newHabitat);
        return newHabitat;
    }

    public NewSupervisor findOrCreateSupervisor(String description, Boolean done, String favorite, NewZoo zoo, boolean isManager, String... tasks) {
        for (NewSupervisor supervisor : supervisorList) {
            if (supervisor.getName().equals(description)) {
                return supervisor;
            }
        }
        NewSupervisor newSupervisor = new NewSupervisor(description, done, favorite, zoo, isManager, tasks);
        supervisorList.add(newSupervisor);
        return newSupervisor;
    }

    public NewDoctor findOrCreateDoctor(String description) {
        for (NewDoctor doctor : doctorList) {
            if (doctor.getName().equals(description)) {
                return doctor;
            }
        }
        NewDoctor newDoctor = new NewDoctor(description);
        doctorList.add(newDoctor);
        return newDoctor;
    }

    public NewAnimal findOrCreateAnimal(String name, String species, String habitatName, int age, int health) {
        NewHabitat newHabitat = findOrCreateHabitat(habitatName);
        return newHabitat.findOrCreateAnimal(name, species, age, health);
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

    public void beforeDailyRoutine() {
        for (NewHabitat habitat : habitatList) {
            habitat.setFed(false);
            habitat.setClean(false);
        }
        for (NewSupervisor supervisor : supervisorList) {
            supervisor.setDone(false);
        }
    }

    private NewAnimal getWeekestAnimal() {
        NewAnimal lowestHealth = null;
        for (NewHabitat habitat : habitatList) {

            lowestHealth = habitat.getWeekestAnimal(lowestHealth);
        }
        return lowestHealth;

    }

    public void dailyRoutine() {
        Collections.shuffle(supervisorList);
        for (NewSupervisor supervisor : supervisorList) {
            supervisor.dailyRoutine();
        }
        for (NewDoctor doctor : doctorList) {
            NewAnimal animalToHeal = getWeekestAnimal();
            if (animalToHeal != null) {
                System.out.println(Colors.COLORS[1] + doctor + " heals " + animalToHeal.getName() +Colors.RESET);
                doctor.heal(animalToHeal);
            } else {
                System.out.println("Nothing to heal");
            }
        }

        for (
                NewHabitat habitat : habitatList) {
            habitat.dailyFightOrBreed();
        }

    }
}