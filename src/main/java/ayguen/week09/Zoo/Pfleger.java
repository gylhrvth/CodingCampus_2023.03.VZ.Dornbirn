package ayguen.week09.Zoo;

import lukas.week03.day4.Colors;

import java.util.Vector;

public class Pfleger {
    private String name;
    Vector<Enclouser> enclouserList;


    public Pfleger(String name){

        this.name = name;
        this.enclouserList = new Vector<>();
    }

    public void addTask(Enclouser e){
        enclouserList.add(e);
    }
    public String getName() {
        return name;
    }

    public void printPfleger() {
        System.out.print("│   > Pfleger " + Colors.COLORS[5] + name + Colors.RESET);
        if (enclouserList.isEmpty()){
            System.out.print(" hat noch keine Aufgabe zugewiesen bekommen.");
        } else {
            System.out.print(" ist zuständig für ");
            for (Enclouser task : enclouserList) {
                if (!task.equals(enclouserList.firstElement())) {
                    if (!task.equals(enclouserList.lastElement())) {
                        System.out.print(", ");
                    } else {
                        System.out.print(" und ");
                    }
                }
                System.out.print(task.getName());
            }
        }
        System.out.println();
    }


    public void simulateDay(){
        for (Enclouser enc : enclouserList) {
            enc.simulateDay(this);
        }

    }
}
