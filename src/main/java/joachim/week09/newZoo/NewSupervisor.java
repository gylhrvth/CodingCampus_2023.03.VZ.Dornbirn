package joachim.week09.newZoo;


import lukas.week03.day4.Colors;

import java.util.List;
import java.util.Vector;

public class NewSupervisor {
    private String name;
    private boolean done;
    private String favorite;
    private List<NewHabitat> habitatList;

    private boolean isManager;

    public NewSupervisor(String name, boolean done, String favorite, NewZoo zoo, boolean isManager, String... tasks) {
        this.name = name;
        this.done = done;
        this.favorite = favorite;
        this.isManager = isManager;
        habitatList = new Vector<>();
        for (String s : tasks) {
            habitatList.add(zoo.findOrCreateHabitat(s));
        }
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public String getName() {
        return name;
    }

    public String getFavorite() {
        return favorite;
    }

    public boolean isManager() {
        return isManager;
    }

    @Override
    public String toString() {
        return name;
    }

    public boolean isSupervisorResponsibleForHabitat(NewHabitat hab) {
        return habitatList.contains(hab);
    }

    public void dailyRoutine() {
        for (NewHabitat habitat : habitatList) {
            if (!this.done) {
                habitat.superVisorDailyRoutine(this);
            }
        }
    }
}
