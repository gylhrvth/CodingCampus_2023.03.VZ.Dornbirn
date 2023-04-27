package lukas.week08.day4;

import java.util.Objects;

public class Person extends Object {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        if (name == null) {
            throw new IllegalArgumentException("Name should not be null");
        }
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name should not be null");
        }
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(obj instanceof Person) {
            Person other = (Person) obj;
            if(!this.name.equals(other.name)) {
                return false;
            }
            if(this.age != other.age) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person{" + super.toString() + "name='" + name + '\'' + ", age=" + age + ", height=" + height + ", weight=" + weight + '}';
    }
}
