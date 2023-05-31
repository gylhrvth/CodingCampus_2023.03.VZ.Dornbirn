package sandro.week10.Museum;

public abstract class Human {
    protected String name;
    private String gender;
    private int age;


    public Human(String name, String gender, int age) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public abstract void printMap();

    public String getName() {
        return name;
    }
    public abstract void move();

    public abstract void dailyRoutine(Museum m,int time);

    public String getColor(){
        return "";
    }

    public void leave(){

    }
}
