package ayguen.week10.Restaurant;

import java.util.Vector;

public class HauptKellner {

    private String name;
    Vector<Restaurant> res;




    public HauptKellner(String name){
        this.name = name;
        this.res = new Vector<>();
    }

    public Vector<Restaurant> getRes() {
        return res;
    }

    public String getName() {
        return name;
    }

}
