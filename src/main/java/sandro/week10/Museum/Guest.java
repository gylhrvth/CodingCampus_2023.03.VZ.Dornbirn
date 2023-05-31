package sandro.week10.Museum;

import lukas.week03.day4.Colors;

public class Guest extends Human {

    protected int timeToLeft;
    protected Room currentRoom;
    private int arrive;
    private boolean inBuilding;

    public Guest(Museum m, String name, String gender, int age, int arrive) {
        super(name, gender, age);
        timeToLeft = 1;
        this.arrive = arrive;
        this.inBuilding = true;

        m.addHuman(this);
        //Start = MainCorridor
        currentRoom = m.getEntry();
        currentRoom.stepIn(this);
    }

    public int getArrive() {
        return arrive;
    }

    @Override
    public void printMap() {

    }

    @Override
    public void move() {
        Room nextRoom = currentRoom.getRandomNextRoom();
        //stepout - stepin
        currentRoom.stepOut(this);
        nextRoom.stepIn(this);
        currentRoom = nextRoom;

        if (currentRoom instanceof Corridor) {
            //if room is corridor, find a gallery
            System.out.println(getColor() + name + Colors.RESET + ": This corridor is boring. I should find a Gallery with actual Artwork");
            timeToLeft = 1;
        }

        else if (currentRoom instanceof Gallery && ((Gallery) currentRoom).getCountOfArtworksInRoom() < 1) {
            //gallery is empty
            System.out.println(getColor() + name + Colors.RESET + ": This gallery is empty. I should find a Gallery with actual Artwork");
            timeToLeft = 1;
        }

        else {
            // current room is Gallery and has Artwork , admireArtwork
            //if observe runs more than 3steps, next move
            System.out.println(getColor() + name + Colors.RESET + ": Ohh this is quit a nice " +Colors.COLORS[2] + currentRoom.getArtworkList().get(Museum.random.nextInt(currentRoom.getArtworkList().size())) +Colors.RESET);     //insert Artwork from room!
            timeToLeft = 10;
        }
    }

    public void setInBuilding(boolean inBuilding) {
        this.inBuilding = inBuilding;
    }

    public void leave(Museum m) {
        m.removeHuman(this);
        int newGuestCount = m.getMaxGuestallowed() - 1;
        m.setMaxGuestallowed(newGuestCount);
        setInBuilding(false);
        System.out.println(getColor() + name + Colors.RESET +": "+ Colors.COLORS[3] + "Goes Home " + Colors.RESET);

        // get ticks, %chance increase to leave
    }

    public void admireArtwork() {
        // picks artwork in room, 10ticks admire
    }

    @Override
    public void dailyRoutine(Museum m, int acttime) {
        int timeSpendinMusem = acttime - arrive;
        int timeToGo = Museum.random.nextInt(100, 300);

        if (timeSpendinMusem > timeToGo) {
            leave(m);
        }


        if (currentRoom instanceof Gallery) {

        }

        --timeToLeft;
//        if (timeToLeft > 0 && currentRoom.getCountOfVisitorsInRoom() < 1) {
//            // if I'm alone, move to next room
//            System.out.println(getColor() + name + Colors.RESET + ": I'm alone here, time to move on...");
//            timeToLeft = 0;
//        }
        //make a move
        if (timeToLeft <= 0) {
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
