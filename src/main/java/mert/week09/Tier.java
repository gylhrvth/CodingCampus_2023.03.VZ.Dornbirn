package mert.week09;

public class Tier {
    private String name;
    private String gattung;

    public Tier(String name, String gattung){
        this.name = name;
        this.gattung = gattung;
    }
    public void printzoo(){
        System.out.println("│       ├── " + name + ", " + gattung);
    }
}
