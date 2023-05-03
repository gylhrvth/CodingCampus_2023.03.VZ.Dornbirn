package eric.week09.zoo;

public class ZooSimulation {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Tiergarten XYZ", 2023);

        //Pfleger werden aufgerufen
        Zookeeper ingo = new Zookeeper("Ingo Laberknecht");
        Zookeeper taub = new Zookeeper("Tauber Hund");

        //Gehege werden aufgerufen
        Enclosure enclosureField = new Enclosure("Field");
        Enclosure enclosureFieldWithPond = new Enclosure("Field with Sea");
        Enclosure enclosureTerra = new Enclosure("Terrarium");
        Enclosure enclosureAqua = new Enclosure("Aquarium");
        Enclosure enclosureArctic = new Enclosure("Antarctica");

        //Tiere werden aufgerufen
        Animals elephant = new Animals("Elephant",15);
        Animals giraffe = new Animals("Giraffe",3);
        Animals rhino = new Animals("Rhino",2);
        Animals spiders = new Animals("Black Widow",1);
        Animals butterfly = new Animals("Butterfly",4200);
        Animals flamingo = new Animals("Flamingo",69);
        Animals whale = new Animals("White Whale",2);
        Animals thuna = new Animals("Thunfish",20);
        Animals salmon = new Animals("Salmon",120);
        Animals iceBear = new Animals("Ice Bear",3);
        Animals polarFox = new Animals("Polar Fox",5);

        //Tiere werden zum Gehege aufgerufen
        enclosureField.addAnimal(giraffe);
        enclosureField.addAnimal(rhino);
        enclosureField.addAnimal(elephant);
        enclosureTerra.addAnimal(spiders);
        enclosureTerra.addAnimal(butterfly);
        enclosureFieldWithPond.addAnimal(flamingo);
        enclosureAqua.addAnimal(whale);
        enclosureAqua.addAnimal(thuna);
        enclosureAqua.addAnimal(salmon);
        enclosureArctic.addAnimal(iceBear);
        enclosureArctic.addAnimal(polarFox);

        //Gehege werden zum Zoo hinzugefügt
        zoo.addEnclosure(enclosureField);
        zoo.addEnclosure(enclosureFieldWithPond);
        zoo.addEnclosure(enclosureTerra);
        zoo.addEnclosure(enclosureAqua);
        zoo.addEnclosure(enclosureArctic);

        zoo.printZooStructure();
    }
}
