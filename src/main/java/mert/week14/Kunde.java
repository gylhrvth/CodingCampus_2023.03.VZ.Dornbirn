package mert.week14;

import java.util.Vector;

public class Kunde {
    private int kundeId;
    private String name;


    public Kunde(int kundeId, String name){
        this.kundeId= kundeId;
        this.name= name;

    }

    public String getName() {
        return name;
    }

    public int getKundeId() {
        return kundeId;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "kundeId=" + kundeId +
                ", name='" + name + '\'' +
                '}';
    }
}
