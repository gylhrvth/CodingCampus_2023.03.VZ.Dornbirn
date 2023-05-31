package sandro.week10.Museum;

import lukas.week03.day4.Colors;

import java.awt.*;

public class Thief extends Guest {
    private int arrive;
    private boolean artworkStolen;


    public Thief(Museum m, String name, String gender, int age, int arrive) {
        super(m, name, gender, age, arrive);
        this.artworkStolen = false;
        timeToLeft = 1;
        this.arrive = arrive;
    }

    public int getArrive() {
        return arrive;
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
            System.out.println(getColor() + name + Colors.RESET + ": Uhh, how much this " +Colors.COLORS[2] + currentRoom.getArtworkList().get(Museum.random.nextInt(currentRoom.getArtworkList().size())) +Colors.RESET + " possible worth?");

            timeToLeft = 5;
        }
    }

    public void leave(Museum m) {
        m.removeHuman(this);
        int newGuestCount = m.getMaxGuestallowed() - 1;
        m.setMaxGuestallowed(newGuestCount);
        setInBuilding(false);
        System.out.println(getColor() + name + Colors.RESET + Colors.COLORS[3] + ": Goes Home " + Colors.RESET);

        // get ticks, %chance increase to leave
    }

    public void stealArtwork() {
        //try
        timeToLeft = 5;
        if (timeToLeft <= 0) {
            //if success , removeStolenArtwork from Gallery , artworkStolen true , (give thief Artwork? to recover the Artwork if guard catch thief)

            //
        }
    }



    @Override
    public void dailyRoutine(Museum m, int acttime) {
        int timeSpendinMusem = acttime - arrive;
        int timeToGo = Museum.random.nextInt(100, 300);

        if (timeSpendinMusem > timeToGo) {
            leave(m);
        }


        --timeToLeft;
        if (timeToLeft > 0 && currentRoom.getCountOfVisitorsInRoom() < 1) {
            // if I'm alone
            System.out.println(getColor() + name + Colors.RESET + ": I'm alone, time to steal this " +Colors.COLORS[2] + currentRoom.getArtworkList().get(Museum.random.nextInt(currentRoom.getArtworkList().size())) +Colors.RESET);
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
