package sandro.week10.Museum;


import java.util.List;
import java.util.Vector;

public class Gallery extends Room {
    private List<Artwork> artworkList;

    public Gallery(String name) {
        super(name);
        this.artworkList = new Vector<>();
    }

    public List<Artwork> getArtworkList() {
        return artworkList;
    }

    public void addArtwork(Artwork artwork) {
        if (!artworkList.contains(artwork)) {
            artworkList.add(artwork);
        }
    }

    public int getCountOfArtworksInRoom(){
        int count = 0;
        if (artworkList.isEmpty()){
            return count;
        }
        for (Artwork a: artworkList) {
            count++;
        }
        return count;
    }

    public void removeStolenArtwork() {
        for (int i = 0; i < artworkList.size(); i++) {
            Artwork a = artworkList.get(i);
            artworkList.remove(i);
            --i;
        }
    }

    public void printStructure() {
        System.out.println("------- Gallery: " + getName() + " / connected to: " + getNeighborRooms());
        for (Artwork a : artworkList) {
            a.printStructure();
        }
    }

    public void printMap() {
        System.out.println("Gallery: " + getName() + "\nPeople here: " + getHumanInRoomList()
                        + "\nArtworks: " + artworkList
                //        + "\nGuard: "
                //        + "\nGuest: "
                //        + "\nThief: "
        );

    }

    public String getColor(){
        return "";
    }
}
