package joachim.week10.model;

public class RestauantMain {
    public static void main(String[] args) {
        Table balcony1 = new Table("balcony1", 2);
        Table balcony2 = new Table("balcony2", 4);
        Table balcony3 = new Table("balcony3", 2);

        Table inside1 = new Table("inside1", 8);
        Table inside2 = new Table("inside2", 14);
        Table inside3 = new Table("inside3", 6);
        Table inside4 = new Table("inside4", 5);
        Table inside5 = new Table("inside5", 7);

        Table arena1 = new Table("arena1", 25);
        Table arena2 = new Table("arena2", 35);
        Table arena3 = new Table("arena3", 16);
        Table arena4 = new Table("arena4", 4);
        Table arena5 = new Table("arena5", 1);
        Table arena6 = new Table("arena6", 8);

        Room balcony = new Room("Balcony");
        Room inside = new Room("Inside");
        Room arena = new Room("Arena");

        balcony.addTable(balcony1);
        balcony.addTable(balcony2);
        balcony.addTable(balcony3);

        inside.addTable(inside1);
        inside.addTable(inside2);
        inside.addTable(inside3);
        inside.addTable(inside4);
        inside.addTable(inside5);

        arena.addTable(arena1);
        arena.addTable(arena2);
        arena.addTable(arena3);
        arena.addTable(arena4);
        arena.addTable(arena5);
        arena.addTable(arena6);

        Server harald = new Server("Harald");
        Server gerlinde = new Server("Gerinde");
        Server flora = new Server("Flora");

        harald.addRoom(balcony);
        flora.addRoom(inside);
        gerlinde.addRoom(arena);


        Food pizza = new Food("Pizza", 13.50);
        Food bolognese = new Food("bolognese", 14.00);
        Food steak = new Food("Steak", 48.60);

        Menu menu = new Menu();
        menu.addFood(pizza);
        menu.addFood(bolognese);
        menu.addFood(steak);
    }
}
