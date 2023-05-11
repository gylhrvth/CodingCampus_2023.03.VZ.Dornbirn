package sandro.week10.Museum;

import lukas.week03.day4.Colors;

import java.awt.*;

public class Thief extends Guest {

    private boolean artworkStolen;


    public Thief(Museum m, String name, String gender, int age) {
        super(m, name, gender, age);
        this.artworkStolen = false;
        timeToLeft = 1;
    }

    public void printMap() {

    }

    public void move() {
        Room nextRoom = currentRoom.getRandomNextRoom();
        //stepout - stepin
        currentRoom.stepOut(this);
        nextRoom.stepIn(this);
        currentRoom = nextRoom;

        if (currentRoom instanceof Corridor) {
            //if room is corridor, find a gallery
            System.out.println(getColor() + name + Colors.RESET + ": There is nothing to steal for me");
            timeToLeft = 1;
        } else {
            //
            System.out.println(getColor() + name + Colors.RESET + ": Uhh, how much this /Artwork/ possible worth?");

            timeToLeft = 5;
        }
    }

    public void stealArtwork() {
        //try
        timeToLeft = 5;
        if (timeToLeft <= 0) {
            //if success , removeStolenArtwork from Gallery , artworkStolen true , (give thief Artwork? to recover the Artwork if guard catch thief)

            //
        }
    }

    public void leave() {

        currentRoom.stepOut(this);


        //if !artworkStolen ticks increase % chance to leave

        //if artworkStolen leave , (with recover artwork function, thief stays 5ticks in Entry to get catched)
    }


    @Override
    public void dailyRoutine(int tick) {
        int timeStay = tick;
        int potential = Museum.random.nextInt(1,299);

        if (timeStay == 300 || timeStay > potential){
            leave();
        }


        --timeToLeft;
        if (timeToLeft > 0 && currentRoom.getCountOfVisitorsInRoom() < 1) {
            // if I'm alone
            System.out.println(getColor() + name + Colors.RESET + ": I'm alone, time to steal /this Artwork/");
            stealArtwork();
        }
        if (artworkStolen) {
            leave();
        }

        //make a move
        if (timeToLeft <= 0 && !artworkStolen) {
            move();
        }




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
