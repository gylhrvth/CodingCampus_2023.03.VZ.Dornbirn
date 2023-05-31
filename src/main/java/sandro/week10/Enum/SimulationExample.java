package sandro.week10.Enum;

import java.util.ArrayList;
import java.util.List;

public class SimulationExample {
    enum Status {SLEEP, EAT, PROGRAMMING}

    private String name;
    private int timeToLeft;
    private Status stat;

    public SimulationExample(String name){
        this.name = name;
        timeToLeft = 0;
        stat = Status.SLEEP;
    }

    public static void main(String[] args) {
        List<SimulationExample> sims = new ArrayList<>();
        sims.add(new SimulationExample("Sandro"));
        sims.add(new SimulationExample("Beni"));
        sims.add(new SimulationExample("Hassan"));
        sims.add(new SimulationExample("Eric"));

        while (true){
            for (SimulationExample sim : sims) {
                sim.simulateTick();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ie){}
        }
    }


    public void simulateTick(){
        --timeToLeft;
        if (timeToLeft <= 0){
            switch (stat){
                case SLEEP:
                    System.out.println(name + " is going to eat");
                    stat = Status.EAT;
                    timeToLeft = 2;
                    break;
                case EAT:
                    System.out.println(name + " has fun with programming");
                    stat = Status.PROGRAMMING;
                    timeToLeft = 10 + (int)(20 * Math.random());
                    break;
                case PROGRAMMING:
                    System.out.println(name + " needs to sleep an hour");
                    stat = Status.SLEEP;
                    timeToLeft = 1 + (int)(10 * Math.random());
                    break;
                default:
                    System.out.println("Oups...");
                    break;
            }
        }
    }
}
