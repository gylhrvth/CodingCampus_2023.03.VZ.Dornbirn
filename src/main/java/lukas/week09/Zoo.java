package lukas.week09;

import java.util.List;

public class Zoo {
    private String name;

    public Zoo(String name) {
        this.name = name;
    }

    private List<Prison> prisons;
    private List<PrisonGuard> guards;

    public void beforeSimulate() {
        for (Prison prison : prisons) {
            prison.beforeSimulate();
        }
        for (PrisonGuard guard : guards) {
            guard.beforeSimulate();
        }
    }

    public void simulate() {
        for (Prison prison : prisons) {
            prison.simulate();
        }
        for (PrisonGuard guard : guards) {
            guard.simulate();
        }
    }

    public void populate() {
        //Create prison guards
        //Create animals and set them into prison </3
    }
}
