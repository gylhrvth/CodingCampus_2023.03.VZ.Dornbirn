package joachim.week09.newZoo;

import lukas.week03.day4.Colors;

import java.util.List;
import java.util.Random;
import java.util.Vector;

public class NewHabitat {
    private static Random rand = new Random();
    private String name;
    private List<NewAnimal> animalList;
    private boolean clean;
    private boolean fed;


    public NewHabitat(String name, boolean isClean, boolean isFed) {
        this.name = name;
        this.clean = isClean;
        this.fed = isFed;
        this.animalList = new Vector<>();

    }

    public NewAnimal findOrCreateAnimal(String name, String genus, int age, int health) {
        for (NewAnimal animal : animalList) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        NewAnimal newnewAnimal = new NewAnimal(name, genus, age, health);
        animalList.add(newnewAnimal);
        return newnewAnimal;
    }

    public String getName() {
        return name;
    }

    public void setFed(boolean fed) {
        this.fed = fed;
    }

    public boolean isFed() {
        return fed;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public List<NewAnimal> getAnimalList() {
        return animalList;
    }

    public void printLayout(List<NewSupervisor> supervisorList) {

        System.out.println(Colors.COLORS[1] + "│   ├──" + Colors.COLORS[2] + " Habitat: " + name + Colors.RESET);
        if (supervisorList.isEmpty()) {
            System.out.println(Colors.COLORS[1] + "│   │   ├──" + Colors.COLORS[7] + "without any Supervisor" + Colors.RESET);
        } else {
            for (NewSupervisor s : supervisorList) {
                if (s.isSupervisorResponsibleForHabitat(this)) {
                    System.out.println(Colors.COLORS[1] + "│   │   ├── " + Colors.COLORS[7] + s + Colors.RESET);
                }
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

    public void dailyFightOrBreed() {
        Random rand = new Random();
        for (NewAnimal a : animalList) {
            a.setAge(a.getAge() + 1);
        }
        try {
            double random = Math.random();
            for (int i = 0; i < animalList.size(); i++) {
                NewAnimal animal1 = animalList.get(rand.nextInt(animalList.size()));
                NewAnimal animal2 = animalList.get(rand.nextInt(animalList.size()));
                if (random > 0.96) {
                    if (animal1 != animal2) {
                        System.out.println(animal1 + " bit " + animal2);
                        animal2.setHealth(animal2.getHealth() - rand.nextInt(15, 40));
                        System.out.println(animal2.getName() + " has Taken dmg HEALTH: " + animal2.getHealth());
                    }
                    if (animal2.getHealth() < 0) {
                        animalList.remove(animal2);
                        System.out.println(animal2.getName() + " has died.");
                    }
                }
            }
            NewAnimal animal1 = animalList.get(rand.nextInt(animalList.size()));
            NewAnimal animal2 = animalList.get(rand.nextInt(animalList.size()));
            if (random < 0.1 && animal1.getSpecies().equals(animal2.getSpecies())) {
                if (animal1 != animal2) {
                    //TODO
                    NewAnimal baby = findOrCreateAnimal(createName(animal1.getName(), animal2.getName()), animal1.getSpecies(), 0, 100);
                    System.out.println("a New " + baby.getSpecies() + " has been born: " + baby.getName());
                }
            }
        } catch (IllegalArgumentException iae) {
            System.err.println("No Animals left");
        }
    }


    public String createName(String name1, String name2) {
        Random rand = new Random();
        String name = "";
        for (int i = 0; i < name1.length() && i < name2.length(); i++) {
            if (i % 2 == 0) {
                name += name1.charAt(i);
            } else {
                name += name2.charAt(i);
            }
        }
        if (name.equals(name1) || name.equals(name2) || animalList.contains(name)) {
            char letter = (char) rand.nextInt(65, 90);
            name += letter;

        }
        System.out.println(name1 + " + " + name2 + " -> " + name);
        return name;
    }


    public void superVisorDailyRoutine(NewSupervisor supervisor) {
        if (clean) {
            if (!fed) {
                System.out.println(Colors.COLORS[4] + supervisor + " fed the animals in " + this + Colors.RESET);
                fed = true;
            } else {
                System.out.println("there was nothing to do");
            }
        } else {
            System.out.println(Colors.COLORS[3] + supervisor + " has cleaned " + this + Colors.RESET);
            if (!supervisor.isManager()) {
                supervisor.setDone(true);
            }
            clean = true;
        }
        NewAnimal randomAnimal = animalList.get(rand.nextInt(animalList.size()));
        System.out.print(Colors.COLORS[6] + supervisor.getName() + " watches " + randomAnimal.getName() + Colors.RESET);
        if (!randomAnimal.getSpecies().equals(supervisor.getFavorite())) {
            System.out.println(".");
        } else {
            System.out.println(Colors.COLORS[6] + " and plays with it." + Colors.RESET);
        }
    }

    public NewAnimal getWeekestAnimal(NewAnimal bestchoice) {
        for (NewAnimal animal : animalList) {
            bestchoice = animal.getWeekestAnimal(bestchoice);
        }
        return bestchoice;
    }


    @Override
    public String toString() {
        return name;
    }
}