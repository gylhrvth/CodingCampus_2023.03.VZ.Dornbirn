package hassan.week10.RestaurantOOP;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Menuitem> menuItems;

    public Menu(ArrayList<Menuitem> menuItems) {
        this.menuItems = menuItems;
    }
    public ArrayList<Menuitem> getMenuItems() {
        return menuItems;
    }
    public void addMenuItem(Menuitem menuItem) {
        menuItems.add(menuItem);
    }
    public Menuitem getMenuItem(String name) {
        for (Menuitem menuItem : menuItems) {
            if (menuItem.getName().equals(name)) {
                return menuItem;
            }
        }
        return null;
    }
    public void printMenu() {
        System.out.println("Menu:");
        for (Menuitem menuItem : menuItems) {
            System.out.println(menuItem.getName() + " - $" + menuItem.getPrice());
        }
    }
}
