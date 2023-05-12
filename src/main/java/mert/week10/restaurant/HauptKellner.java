package mert.week10.restaurant;

public class HauptKellner {
    private String name;

    public HauptKellner(String name){
        this.name = name;
    }
    public void printHauptKellner(){
        System.out.println("Hauptkellner ist: " + name);
    }


    public String getName() {
        return name;
    }
}
