package sandro.week10.Museum;

import java.util.Vector;

public class Gallery extends Room {
    private Vector<Artwork> artworkList;

    public Gallery(String name) {
        super(name);
        this.artworkList = new Vector<>();
    }


    public void addArtwork(Artwork artwork) {
        if (!artworkList.contains(artwork)) {
            artworkList.add(artwork);
        }
    }

    public void printStructure (){
        System.out.println("------- Gallery: " + getName() +" / connected to: "+ getNeighborRooms());
        for (Artwork a:artworkList) {
            a.printStructure();
        }
    }
    public void printMap() {
        System.out.println("Gallery: " +getName()         +"\nPeople here: "       +getHumanInRoomList()
                + "\nArtworks: " +artworkList
        //        + "\nGuard: "
        //        + "\nGuest: "
        //        + "\nThief: "
        );

    }
    @Override
    public String toString() {
        return "Gallery: " + getName();
    }
}
