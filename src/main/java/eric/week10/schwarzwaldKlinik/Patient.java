package eric.week10.schwarzwaldKlinik;

import java.util.Random;

public class Patient {
    private String name;
    private String injury;
    private int currentHP;
    private int maxHP;
    private int getHP;

    public Patient(String name, String injury, int currentHP, int maxHP) {
        this.name = name;
        this.injury = injury;
        this.currentHP = currentHP;
        this.maxHP = maxHP;
        this.getHP = 15;
    }

    public String getName() {
        return name;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public boolean isHealed() {
        return currentHP == maxHP;
    }

    public String getInjury() {
        return injury;
    }

    public void treat() {
        currentHP += getHP;
        currentHP = Math.min(maxHP, currentHP);

        System.out.print(getName()+" ");

        if (currentHP < 10) {
            System.out.println("The Patient is in critical condition and cannot leave the hospital");
        } else if (currentHP < 25) {
            System.out.println("The Patient has to stay in the Hospital to be treated");
        } else if (currentHP < 50) {
            System.out.println("The Patient is on his way to get Better");
        } else if (currentHP < 100) {
            System.out.println("The patient will soon be discharged");
        } else if (currentHP == maxHP) {
            System.out.println("The patient is healed!!!");
        }
    }
}
