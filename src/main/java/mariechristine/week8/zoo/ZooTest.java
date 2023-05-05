package mariechristine.week8.zoo;

public class ZooTest {
    public static void main(String[] args) {
        //Initialisierung vom Zoo und all seinen Bestandteilen:

        Zoo z = new Zoo("Tiergarten Dornbirn", 2022);

        Gehege alp = new Gehege("Alpenwiese");
        Gehege ried = new Gehege("Ried");
        Gehege terra = new Gehege("Terrarium (warm)");

        z.addEnclosure(alp);
        z.addEnclosure(ried);
        z.addEnclosure(terra);

        Animal cow = new Animal("Rijska", "Kuh", 160, 35);
        Animal cow1 = new Animal("Jurij", "Kuh", 160, 35);
        Animal cow2 = new Animal("Zora", "Kuh", 160, 35);
        Animal stork1 = new Animal("Garmond", "Storch", 100, 20);
        Animal stork2 = new Animal("Hugo", "Storch", 100, 10);
        Animal stork3 = new Animal("Idaxis", "Storch", 100,10);
        Animal fish1 = new Animal("Sharky", "Shark", 170, 40);
        Animal fish2 = new Animal("Nemo", "Goldfisch", 50, 5);
        Animal fish3 = new Animal("Nemo 2", "Goldfisch", 50, 5);
        Animal fish4 = new Animal("Nemo 3", "Goldfisch", 50, 5);
        Animal fish5 = new Animal("Nemo 4", "Goldfisch", 50, 5);
        Animal fish6 = new Animal("Nemo 5", "Goldfisch", 50, 5);
        Animal fish7 = new Animal("Nemo 6", "Goldfisch", 50, 5);
        Animal fish8 = new Animal("Nemo 7", "Goldfisch", 50, 5);
        Animal fish9 = new Animal("Nemo 8", "Goldfisch", 50, 5);
        Animal fish10 = new Animal("Nemo 9", "Goldfisch", 50, 5);

        alp.addAnimal(cow);
        alp.addAnimal(cow1);
        alp.addAnimal(cow2);
        ried.addAnimal(stork1);
        ried.addAnimal(stork2);
        ried.addAnimal(stork3);
        terra.addAnimal(fish1);
        terra.addAnimal(fish2);
        terra.addAnimal(fish3);
        terra.addAnimal(fish4);
        terra.addAnimal(fish5);
        terra.addAnimal(fish6);
        terra.addAnimal(fish7);
        terra.addAnimal(fish8);
        terra.addAnimal(fish9);
        terra.addAnimal(fish10);


        z.printStructure();
        System.out.println("___________________________________________________________\n");

        Zookeeper mario = new Zookeeper("Mario");
        Zookeeper sabine = new Zookeeper("Sabine");
        Zookeeper louise = new Zookeeper("Lazy Louise");
        z.addZookeeper(sabine);
        z.addZookeeper(mario);
        z.addZookeeper(louise);

        mario.addEnclosureToKeeper(terra);
        mario.addEnclosureToKeeper(ried);
        sabine.addEnclosureToKeeper(ried);
        louise.addEnclosureToKeeper(alp);
        z.printStructure();
        System.out.println("___________________________________________________________\n");

        z.printStructure();

        for(int i=0; i<10;i++) {
            z.setNewDay();
            z.simulate();
        }



    }
}

