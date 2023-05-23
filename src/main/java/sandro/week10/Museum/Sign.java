package sandro.week10.Museum;

import lukas.week03.day4.Colors;

public class Sign extends Artwork {
    private String material;

    public Sign(String name, String origin, int created, String artist, String material){
        super (name,origin,created,artist);
        this.material = material;
    }



    public void printStructure (){
        System.out.println("---------------- Sign: "+ getName() + "\n---------------------- Origin: "+getOrigin() + "\n---------------------- Created in the Year: "+getCreated()
                            + "\n---------------------- Made by: " +getArtist() + "\n---------------------- Medium: "+material);
    }
    @Override
    public String getColor() {
        return Colors.COLORS[2];
    }

}