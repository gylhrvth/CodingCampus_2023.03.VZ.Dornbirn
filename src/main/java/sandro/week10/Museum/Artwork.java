package sandro.week10.Museum;

import lukas.week03.day4.Colors;

public class Artwork {
    private String name;
    private String origin;
    private int created;
    private String artist;


    public Artwork(String name, String origin, int created, String artist){
        this.name = name;
        this.origin = origin;
        this.created = created;
        this.artist = artist;

    }

    public String getName() {
        return name;
    }

    public String getOrigin() {
        return origin;
    }

    public int getCreated() {
        return created;
    }

    public String getArtist() {
        return artist;
    }

    public void printStructure (){

    }

    @Override
    public String toString() {
        return getName();
    }

    public String getColor(){
        return "";
    }
}
