package ayguen.week09.Zoo;

import lukas.week03.day4.Colors;

import java.util.Vector;

public class Tier {

    private String name;


    public Tier(String name) {

        this.name = name;

    }

    public void printTier() {
        System.out.println("│       ├── " + Colors.COLORS[2] +name+ Colors.RESET);
    }

}
