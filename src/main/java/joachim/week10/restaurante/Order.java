package joachim.week10.restaurante;

import java.util.List;

public class Order {
    private Food food;
    private int amount;
    public Order(Food f,int amount){
        this.amount = amount;
        this.food = f;
    }
}
