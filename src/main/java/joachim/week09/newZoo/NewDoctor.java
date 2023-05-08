package joachim.week09.newZoo;

import lukas.week03.day4.Colors;

public class NewDoctor {
    private String name;


    public NewDoctor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void heal(NewAnimal animal){
        int heal = NewZoo.rand.nextInt(5,25);
        animal.setHealth(animal.getHealth() + heal);
        System.out.println(Colors.COLORS[2] + animal  + " gets healed by "+ heal);
    }

    @Override
    public String toString() {
        return name;
    }
}