package sandro.week10.Museum;

import lukas.week03.day4.Colors;

public class Guest extends Human {

    protected int timeToLeft;
    protected Room currentRoom;


    public Guest(Museum m, String name, String gender, int age){
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
            System.out.println(getColor() + name + Colors.RESET + ": This corridor is boring. I should find a Gallery with actual Artwork");
            timeToLeft = 1;
        } else {
            // current room is Gallery and has Artwork , admireArtwork
            //if observe runs more than 3steps, next move
            System.out.println(getColor() + name + Colors.RESET + ": Ohh this is quit a nice /Artwork/");     //insert Artwork from room!
            timeToLeft = 10;
        }
    }


    public void leave (){
        // get ticks, %chance increase to leave
    }

    public void admireArtwork(){
        // picks artwork in room, 10ticks admire
    }

    @Override
    public void dailyRoutine (int tick){
        int timeStay = tick;
        int potential = Museum.random.nextInt(1,299);

        if (timeStay == 300 || timeStay > potential){
            leave();
        }


        if (currentRoom instanceof Gallery){

        }

        --timeToLeft;
//        if (timeToLeft > 0 && currentRoom.getCountOfVisitorsInRoom() < 1) {
//            // if I'm alone, move to next room
//            System.out.println(getColor() + name + Colors.RESET + ": I'm alone here, time to move on...");
//            timeToLeft = 0;
//        }
        //make a move
        if (timeToLeft <= 0){
            move();
        }



        //make a move

        //if room is corridor, find a gallery

        //if gallery empty, next move

        //if gallery has Artwork, admire Artwork

        //if admire runs more than 3steps, next move

        //if step20, go for entry and leave building

    }

    @Override
    public String getColor() {
        return Colors.COLORS[4];
    }
}
