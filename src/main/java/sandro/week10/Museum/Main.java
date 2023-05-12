package sandro.week10.Museum;

import sandro.week10.car.Car;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Corridor entry = new Corridor("Entry");
        Museum pinakothek = new Museum("Pinakothek", "from 8:00 to 18:00", entry);
        pinakothek.addRoom(entry);
        Corridor corridor = new Corridor("Main-Corridor");
        pinakothek.addRoom(corridor);

        Painting monaLisa = new Painting("Mona Lisa", "Italy", 1505, "Leonardo da Vinci", "Portrait", "Oil-Painting");
        Painting theScream = new Painting("The Scream", "Norway", 1893, "Endvard Munch ", "Expressionism", "Pastel");
        Painting theStarryNight = new Painting("The Starry Night", "Dutch", 1889, "Vincent van Gogh", "Impressionism", "Oil Painting");
        Painting wndererAboveTheSeaOfFog = new Painting("Wanderer above the Sea of Fog", "Germany", 1818, "Caspar David Friedrich", "Romanticism", "Oil Painting");
        Sign corss = new Sign("Cross", "Israel", -100, "unknown", "Wood");
        Sign monolith = new Sign("Monolith", "Africa", -2248, "unknown", "Stone");
        Statue david = new Statue("David", "Italy", 1501, "Michelangelo", "Marble", "Sculpture");
        Statue venusDeMilo = new Statue("Venus de Milo", "Greece", -150, "Alexandros of Antioch", "Marble", "Sculpture");
        ArtObject bowl = new ArtObject("Antique Bowl", "Germany", -1000, "unknown", "Germania", "Wooden Bowl");
        ArtObject vase = new ArtObject("Antique Vase", "Germany", -1017, "unknown", "Germania", "Ceramic Vase");
        ArtObject plate = new ArtObject("Antique Plate", "Germany", -1020, "unknown", "Germania", "Copper Plate");
        ArtObject goldMask = new ArtObject("Gold Mask of Tutankhamun", "Egyptian", -1323, "unknown", "Ancient Egyptian", "Mask");
        ArtObject narmerPalette = new ArtObject("Narmer Palette", "Egyptian", -3000, "unknown", "Ancient Egyptian", "Palletes");
        ArtObject mummy = new ArtObject("Rammses", "Egyptian", -1290, "unknown", "Ancient Egyptian", "Mummy");

        Gallery room1 = new Gallery("Signs Room");
        pinakothek.addRoom(room1);
        room1.addArtwork(corss);
        room1.addArtwork(monolith);
        Gallery room2 = new Gallery("Statue Room");
        pinakothek.addRoom(room2);
        room2.addArtwork(david);
        room2.addArtwork(venusDeMilo);
        Gallery room3 = new Gallery("Antique Germany");
        pinakothek.addRoom(room3);
        room3.addArtwork(bowl);
        room3.addArtwork(vase);
        room3.addArtwork(plate);
        Gallery room4 = new Gallery("Ancient Egyptian");
        pinakothek.addRoom(room4);
        room4.addArtwork(goldMask);
        room4.addArtwork(narmerPalette);
        room4.addArtwork(mummy);
        Gallery room5 = new Gallery("Painting Room Portrait");
        pinakothek.addRoom(room5);
        room5.addArtwork(monaLisa);
        Gallery room6 = new Gallery("Painting Room Expressionism");
        pinakothek.addRoom(room6);
        room6.addArtwork(theScream);
        Gallery room7 = new Gallery("Painting Room Impressionism");
        pinakothek.addRoom(room7);
        room7.addArtwork(theStarryNight);
        Gallery room8 = new Gallery("Painting Room Romanticism");
        pinakothek.addRoom(room8);
        room8.addArtwork(wndererAboveTheSeaOfFog);

        entry.addDoorToRoom(corridor);
        corridor.addDoorToRoom(room1);
        corridor.addDoorToRoom(room2);
        corridor.addDoorToRoom(room3);
        corridor.addDoorToRoom(room4);
        corridor.addDoorToRoom(room5);
        corridor.addDoorToRoom(room8);
        room1.addDoorToRoom(room2);
        room2.addDoorToRoom(room3);
        room5.addDoorToRoom(room6);
        room6.addDoorToRoom(room7);
        room7.addDoorToRoom(room8);

        Guard guard1 = new Guard(pinakothek, "Mike", "Male", 33);
        Guard guard2 = new Guard(pinakothek, "Tom", "Male", 40);
        Guard guard3 = new Guard(pinakothek, "Lila", "Female", 28);


        pinakothek.printStructure();
        pinakothek.simulateDay();

    }


}
