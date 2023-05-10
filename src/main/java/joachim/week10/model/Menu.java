package joachim.week10.model;

import java.util.List;
import java.util.Vector;

public class Menu {
    private List<Food> foodList;
    public Menu(){
        this.foodList = new Vector<>();
    }


    public void addFood(Food f){
        foodList.add(f);
    }

    public List<Food> getFoodList() {
        return foodList;
    }
}
