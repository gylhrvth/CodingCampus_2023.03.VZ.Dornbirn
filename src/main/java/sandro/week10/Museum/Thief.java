package sandro.week10.Museum;

import lukas.week03.day4.Colors;

import java.awt.*;

public class Thief extends Guest {
    public Thief(Museum m, String name, String gender, int age){
        super(m, name,gender,age);
        timeToLeft = 1;
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
            System.out.println(getColor() + name + Colors.RESET +  ": There is nothing to steal for me");
            timeToLeft = 1;
        } else {
            //if observe runs more than 3steps, next move
            System.out.println(getColor() + name + Colors.RESET + ": Uhh, how much this /Artwork/ possible worth?");
            timeToLeft = 10;
        }
    }
    @Override
    public void dailyRoutine (){

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


        //make a move

        //if room is corridor, find a gallery

        //if gallery empty, next move

        //if gallery has Artwork,
        //and is not occupied, try to steal
        //and is occupied, wait 2steps
        //if gallery after wait still occupied, next move
        //if gallery after wait not occupied, try steal

        //if steal is successful, go for entry and leave building

        //if step20, go for entry and leave building

    }


    @Override
    public String getColor() {
        return Colors.COLORS[5];
    }
}
