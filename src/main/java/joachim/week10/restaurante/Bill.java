package joachim.week10.restaurante;

import java.util.List;

public class Bill {
    private List<Food> bill;
    public Bill(){
    }
    public void addindToBill(Food f){
        bill.add(f);
    }
}
