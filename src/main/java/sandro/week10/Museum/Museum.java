package sandro.week10.Museum;

import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Museum {
    static Random random = new Random();
    private int maxGuestallowed = 1;
    private int guestNumber = 1;
    private String name;
    private String open;
    private Corridor entry;
    private List<Room> roomlist;
    private List<Human> humanList;

    public Museum(String name, String open, Corridor entry) {
        this.name = name;
        this.open = open;
        this.roomlist = new Vector<>();
        this.humanList = new Vector<>();
        this.entry = entry;
    }

    public int getMaxGuestallowed() {
        return maxGuestallowed;
    }

    public void setMaxGuestallowed(int maxGuestallowed) {
        this.maxGuestallowed = maxGuestallowed;
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

    public void removeHuman(Human h) {
        if (humanList.contains(h)) {
            humanList.remove(h);
        }
    }

    public void printStructure() {
        System.out.println("Museum: " + name + " / Open: " + open);

        for (Room room : roomlist) {
            room.printStructure();
        }
    }

    private void generateNewVisitors(int arrive) {
        // New Visitor come with 10% probability
        if (random.nextInt(100) < 10 && maxGuestallowed < 22) {
            String name = "Guest " + guestNumber;
            ++guestNumber;
            ++maxGuestallowed;
            String gender = "other";
            int genderLotto = random.nextInt(100);
            if (genderLotto < 45) {
                gender = "female";
            } else if (genderLotto < 90) {
                gender = "male";
            }
            int age = 16 + random.nextInt(80);
            if (random.nextInt(100) < 90) {
                // 80% probability for normal visitor
                new Guest(this, name, gender, age, arrive);
            } else {
                // 10% probabiliy for thief
                new Thief(this, name, gender, age, arrive);
            }
        }
    }

    public void simulateDay() {
        System.out.println("*******************************************************************************************");
        Calendar calendar = Calendar.getInstance();
//        calendar.set(2000, 1, 1, 8, 0, 0);
//        DateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
//        int hours = 8;
//        int minutefront = 0;
//        int minuteback = 0;

        for (int i = 1; i < 601; i++) {
            String currentHour = (i / 60) + 8 + "";
            String currentMinute = i % 60 + "";

            if (currentHour.length() < 1) {
                currentHour = "00";
            } else if (currentHour.length() < 2) {
                currentHour = "0" + currentHour;
            }

            if (currentMinute.length() < 1) {
                currentMinute = "00";
            } else if (currentMinute.length() < 2) {
                currentMinute = "0" + currentMinute;
            }
            String time = currentHour + ":" + currentMinute;
//            String time = hours + ":" + minutefront + minuteback;
//            time = hours + ":" + minute;
//            if (i % 60 == 0) {
//                hours += 1;
//            }
//            if (i % 10 == 0) {
//                minutefront += 1;
//                if (minutefront == 6) {
//                    minutefront = 0;
//                }
//            }
//            minuteback += 1;
//            if (minuteback == 10) {
//                minuteback = 0;
//            }
            generateNewVisitors(i);
            //System.out.println("Time: " + simpleDateFormat.format(calendar.getTime()));
            System.out.println("Time: " + time + " (actually " + (maxGuestallowed -1) + " Guests in Building)");
            for (int j = 0; j < humanList.size(); j++) {
                Human h = humanList.get(j);
                h.dailyRoutine(this, i);
            }
            System.out.println("*******************************************************************************************");
//            calendar.add(Calendar.MINUTE, 1);

        }
        for (Human h:humanList) {
            if (!(h instanceof Guard)){
                h.leave();
            }

        }
    }

    public Corridor getEntry() {
        return entry;
    }
}
