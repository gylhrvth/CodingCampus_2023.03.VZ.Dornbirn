package sandro.week10.Museum;

public class Painting extends Artwork {
    private String genre;
    private String technique;

    public Painting(String name, String origin, int created, String artist, String genre, String technique) {
        super(name, origin, created, artist);
        this.genre = genre;
        this.technique = technique;
    }


    public void printStructure (){
        System.out.println("---------------- Painting: "+ getName() + "\n-------------------------- Origin: "+getOrigin() + "\n-------------------------- Created in the Year: "+getCreated()
                + "\n-------------------------- Made by: " +getArtist() + "\n-------------------------- Genre: " +genre + "\n-------------------------- Technique: " +technique);
    }

}
