package sandro.week10.Hospital;

public class Patient {
    private String firstname;
    private String lastname;
    private int age;
    private int illnesLevel;


    public Patient(String firstname,String lastname,int age, int illnesLevel){
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.illnesLevel = illnesLevel;
    }

    public int getIllnesLevel() {
        return illnesLevel;
    }
}
