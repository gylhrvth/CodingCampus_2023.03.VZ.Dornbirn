package sandro.week10.Museum;

import lukas.week03.day4.Colors;

public class Statue extends Artwork {
    private String material;
    private String subject;

    public Statue(String name, String origin, int created, String artist, String material, String subject) {
        super(name, origin, created, artist);
        this.material = material;
        this.subject = subject;
    }



    public void printStructure (){
        System.out.println("---------------- Statue: "+ getName() + "\n------------------------ Origin: "+getOrigin() + "\n------------------------ Created in the Year: "+getCreated()
                + "\n------------------------ Made by: " +getArtist() + "\n------------------------ Medium: "+material + "\n------------------------ Subject: " +subject);
    }
    @Override
    public String getColor() {
        return Colors.COLORS[2];
    }
}
