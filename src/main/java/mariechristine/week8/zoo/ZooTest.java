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

        Animal cow = new Animal("Rijska", "Kuh");
        Animal stork1 = new Animal("Garmond", "Storch");
        Animal stork2 = new Animal("Hugo", "Storch");
        Animal stork3 = new Animal("Idaxis", "Storch");

        alp.addAnimal(cow);
        ried.addAnimal(stork1);
        ried.addAnimal(stork2);
        ried.addAnimal(stork3);
        z.printStructure();
        System.out.println("___________________________________________________________\n");

        Zookeeper mario = new Zookeeper("Mario");
        Zookeeper sabine = new Zookeeper("Sabine");
        Zookeeper louise = new Zookeeper("Lazy Louise");
        z.addZookeeper(sabine);
        z.addZookeeper(mario);
        z.addZookeeper(louise);

        mario.addTask(alp);
        mario.addTask(terra);
        sabine.addTask(ried);
        z.printStructure();
        System.out.println("___________________________________________________________\n");

    }
}

