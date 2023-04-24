package sandro.week08.DatenKlasse;

public class PersonData {
    private double height;
    private int age;
    private String name;
    private double weight;

    public PersonData(double height, int age, String name, double weight) {
        this.height = height;
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

//    public static PersonData getdata(String[][] data) {   //input über String []?
//        PersonData input = new PersonData();
//
//        if (data.length > 0) {
//            for (int i = 0; i < data.length; i++) {
//                for (int j = 0; j < data.length - i - 1; j++) {
//                    input.hight = data[i][j];
//                    input.age = data[i][j];
//                    input.name = data[i][j];
//                    input.weight = data[i][j];
//                }
//            }
//
//        }
//        return input;
//    }

//    public static PersonData getdata(double hight, int age, String name, double weight) {
//        PersonData input = new PersonData();
//
//        input.hight = hight;
//        input.age = age;
//        input.name = name;
//        input.weight = weight;
//
//        return input;
//    }

    @Override
    public String toString() {
        return "Height is : " + height+" M:cm\n" + "Age is    : " + age +" years\n"+ "Name is   : " + name + "\n"+ "Weight is : " + weight + " kg";
    }
}
