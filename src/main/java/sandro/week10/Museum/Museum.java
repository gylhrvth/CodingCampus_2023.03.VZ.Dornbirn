package sandro.week10.Museum;

import joachim.week10.model.Visitor;

import java.util.Random;
import java.util.Vector;

public class Museum {
    static Random random = new Random();
    private static int gastCounter = 1;

    private String name;
    private String open;

    private Corridor entry;
    private Vector<Room> roomlist;
    private Vector<Human> humanList;


    public Museum(String name, String open, Corridor entry) {
        this.name = name;
        this.open = open;
        this.roomlist = new Vector<>();
        this.humanList = new Vector<>();
        this.entry = entry;
    }

    public void addRoom(Room room) {
        if (!roomlist.contains(room)) {
            roomlist.add(room);
        }
    }

    public void addHuman(Human h) {
        if (!humanList.contains(h)) {
            humanList.add(h);
        }
    }


    public void printStructure() {
        System.out.println("Museum: " + name + " / Open: " + open);

        for (Room room : roomlist) {
            room.printStructure();
        }
    }


    private void generateNewVisitors() {
        // New Visitor come with 10% probability
        if (random.nextInt(100) < 10 && gastCounter < 12) {
            String name = "Gast " + gastCounter;
            ++gastCounter;
            String gender = "other";
            int genderLotto = random.nextInt(100);
            if (genderLotto < 45) {
                gender = "female";
            } else if (genderLotto < 90) {
                gender = "male";
            }
            int age = 16 + random.nextInt(80);

            Guest g = null;
            if (random.nextInt(100) < 80) {
                // 80% probability for normal visitor
                g = new Guest(this, name, gender, age);
            } else {
                // 20% probabiliy for thief
                g = new Thief(this, name, gender, age);
            }
        }
    }

    public void simulateDay() {
        System.out.println("*******************************************************************************************");
        int hours = 8;
        int minutefront = 0;
        int minuteback = 0;

        for (int i = 1; i < 601; i++) {
            String time = hours + ":" + minutefront + minuteback;
            if (i % 60 == 0) {
                hours += 1;
            }
            if (i % 10 == 0) {
                minutefront += 1;
                if (minutefront == 6) {
                    minutefront = 0;
                }
            }
            minuteback += 1;
            if (minuteback == 10) {
                minuteback = 0;
            }

            generateNewVisitors();

            System.out.println("Time: " + time);
            for (Human human : humanList) {
                human.dailyRoutine();
            }

            System.out.println("*******************************************************************************************");


        }
    }

    public Corridor getEntry() {
        return entry;
    }
}
