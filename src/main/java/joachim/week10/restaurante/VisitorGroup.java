package joachim.week10.restaurante;

import java.util.Random;

public class VisitorGroup {
    private int amount;

    public VisitorGroup(){
        Random rand = new Random();
        this.amount = (int)Math.pow(2, 1 + rand.nextInt(5));
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "The Visitors of " + amount + " arrived at the Restaurant.";
    }
}
