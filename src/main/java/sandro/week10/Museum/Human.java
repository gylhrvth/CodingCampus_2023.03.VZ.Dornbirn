package sandro.week10.Museum;

public class Human {
    protected String name;
    private String gender;
    private int age;


    public Human(String name, String gender, int age) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void printMap() {

    }

    public String getName() {
        return name;
    }

    public void dailyRoutine(int tick){
        // do NOTHING :-)
    }

    public String getColor(){
        return "";
    }

}
