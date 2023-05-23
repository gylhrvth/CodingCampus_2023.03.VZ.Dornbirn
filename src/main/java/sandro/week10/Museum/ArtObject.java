package sandro.week10.Museum;

import lukas.week03.day4.Colors;

public class ArtObject extends Artwork {
    private String theme;
    private String object;

    public ArtObject(String name, String origin, int created, String artist, String theme, String object) {
        super(name, origin, created, artist);
        this.theme = theme;
        this.object = object;
    }


    public void printStructure (){
        System.out.println("---------------- Art Object: "+ getName() + "\n---------------------------- Origin: "+getOrigin() + "\n---------------------------- Created in the Year: "+getCreated()
                + "\n---------------------------- Made by: " +getArtist() + "\n---------------------------- Theme: "+theme + "\n---------------------------- Object: " +object);

    }
    @Override
    public String getColor() {
        return Colors.COLORS[2];
    }
}
