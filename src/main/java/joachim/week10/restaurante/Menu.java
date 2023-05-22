package joachim.week10.restaurante;

import java.util.List;
import java.util.Vector;

public class Menu {
    private List<Food> foodList;
    public Menu(){
        foodList = new Vector<>();
    }
    public void addFoodToMenu(Food f){
        foodList.add(f);
    }
}
