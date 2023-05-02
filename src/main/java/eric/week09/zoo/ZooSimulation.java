package eric.week09.zoo;

public class ZooSimulation {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Tiergarten XYZ", 2023);

        Zookeeper ingo = new Zookeeper("Ingo Laberknecht");
        Zookeeper taub = new Zookeeper("Tauber Hund");

        Enclosure enclosureField = new Enclosure("Field");
        Enclosure enclosureFieldWithSea = new Enclosure("Field with Sea");
        Enclosure enclosureTerra = new Enclosure("Terrarium");
        Enclosure enclosureAqua = new Enclosure("Aquarium");
        Enclosure enclosureArctic = new Enclosure("Antarctica");

        Animals elephant = new Animals("Elephant");
        Animals giraffe = new Animals("Giraffe");
        Animals rhino = new Animals("Rhinozeros");
        Animals spiders = new Animals("Black Widow");
        Animals butterfly = new Animals("Butterfly");
        Animals flamingo = new Animals("Flamingo");
        Animals whale = new Animals("White Whale");
        Animals thuna = new Animals("Thunfish");
        Animals salmon = new Animals("Salmon");
        Animals iceBear = new Animals("Ice Bear");
        Animals polarFox = new Animals("Polar Fox");

        enclosureField.addAnimal(giraffe);
        enclosureField.addAnimal(rhino);
        enclosureField.addAnimal(elephant);
        enclosureTerra.addAnimal(spiders);
        enclosureTerra.addAnimal(butterfly);
        enclosureFieldWithSea.addAnimal(flamingo);
        enclosureAqua.addAnimal(whale);
        enclosureAqua.addAnimal(thuna);
        enclosureAqua.addAnimal(salmon);
        enclosureArctic.addAnimal(iceBear);
        enclosureArctic.addAnimal(polarFox);

        zoo.addEnclosure(enclosureField);
        zoo.addEnclosure(enclosureFieldWithSea);
        zoo.addEnclosure(enclosureTerra);
        zoo.addEnclosure(enclosureAqua);
        zoo.addEnclosure(enclosureArctic);

        zoo.printZooStructure();
    }
}
