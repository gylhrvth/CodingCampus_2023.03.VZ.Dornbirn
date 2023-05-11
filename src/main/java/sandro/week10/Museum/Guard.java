package sandro.week10.Museum;

import lukas.week03.day4.Colors;

public class Guard extends Human {

    private int timeToLeft;
    private Room currentRoom;

    public Guard(Museum m, String name, String gender, int age){
        super (name,gender,age);
        timeToLeft = 1;

        m.addHuman(this);
        //Start = MainCorridor
        currentRoom = m.getEntry();
        currentRoom.stepIn(this);
    }
    public void printMap() {

    }
    public void move (){
        Room nextRoom = currentRoom.getRandomNextRoom();
        //stepout - stepin
        currentRoom.stepOut(this);
        nextRoom.stepIn(this);
        currentRoom = nextRoom;

        if (currentRoom instanceof Corridor){
            //if room is corridor, find a gallery
            System.out.println(getColor() + name + Colors.RESET + ": Nobody to observe here");
            timeToLeft = 1;
        } else {
            //if observe runs more than 3steps, next move
            System.out.println(getColor() + name + Colors.RESET + ": I should stay here and watch whats going on");
            timeToLeft = 10;
        }
    }

    @Override
    public void dailyRoutine (int tick){
        //if gallery occupied, observe guest


        --timeToLeft;
        if (timeToLeft > 0 && currentRoom.getCountOfVisitorsInRoom() < 1) {
            // if I'm alone, move to next room
            System.out.println(getColor() + name + Colors.RESET + ": I'm alone here, time to move on...");
            timeToLeft = 0;
        }
        //make a move
        if (timeToLeft <= 0){
            move();
        }




    }


    @Override
    public String getColor() {
        return Colors.COLORS[1];
    }
}
