package joachim.week09.zoo;


public class TheZoo {
    public static void main(String[] args) {
//_________________Initalisation______________________________________________
//_________________Food_______________________________________________________

        Food meat = new Food("meat", 4.60F, "kg");
        Food fish = new Food("fish", 10.51F, "kg");
        Food fruit = new Food("Mango", 7.5F, "kg");
        Food nuts = new Food("Nuts and Berries", 18, "dkg");
//_________________Animals____________________________________________________

        Animal lion = new Animal("Abe", "Lion", 15, meat, 6);
        Animal lionfe = new Animal("Charlie", "Lion", 14, meat, 5);
        Animal killerWhale = new Animal("Habibi", "Orca", 22, fish, 227);
        Animal killerWhaleMale = new Animal("Roger", "Orca", 25, fish, 220);
        Animal orangutan = new Animal("Ape", "Orangutan", 40, fruit, 50);
        Animal chimpanzee = new Animal("Chip", "Chimpanzee", 25, fruit, 30);
        Animal chimp = new Animal("Chap", "Chimpanzee", 26, fruit, 30);
        Animal bird = new Animal("Rudy", "Grey African", 30, nuts, 20);
        Animal birb = new Animal("Trudy", "Grey African", 35, nuts, 20);
//_________________Habitats_______________________________________________________

        Habitat pool = new Habitat("Pool");
        Habitat lionCage = new Habitat("LionCage");
        Habitat monkeyCage = new Habitat("MonkeyCage");
        Habitat birdHouse = new Habitat("BirdHouse");
//_________________Supervisor_________________________________________________

        Supervisor harald = new Supervisor("Harald");
        Supervisor hugo = new Supervisor("Hugo");
        Supervisor anna = new Supervisor("Anna");
        Supervisor flora = new Supervisor("Flora");
        Supervisor gerlinde = new Supervisor("Gerlinde");



//______________Supervisors___________________________________
        pool.addSupervisor(harald);
//____________________________________________________________
        lionCage.addSupervisor(hugo);
        monkeyCage.addSupervisor(hugo);
//____________________________________________________________
        lionCage.addSupervisor(anna);
        monkeyCage.addSupervisor(anna);
//____________________________________________________________
        birdHouse.addSupervisor(flora);
//____________________________________________________________
        pool.addSupervisor(gerlinde);
        lionCage.addSupervisor(gerlinde);
        monkeyCage.addSupervisor(gerlinde);
        birdHouse.addSupervisor(gerlinde);
//____________________________________________________________
//______________Animals_______________________________________

        lionCage.addAnimal(lion);
        lionCage.addAnimal(lionfe);
//____________________________________________________________
        pool.addAnimal(killerWhaleMale);
        pool.addAnimal(killerWhale);
//____________________________________________________________
        monkeyCage.addAnimal(orangutan);
        monkeyCage.addAnimal(chimpanzee);
        monkeyCage.addAnimal(chimp);
//____________________________________________________________
        birdHouse.addAnimal(bird);
        birdHouse.addAnimal(birb);
//____________________________________________________________
//____________Zoo.add.Habitat_________________________________
        Zoo zoo = new Zoo("Hermann's Garden", 1840);

        zoo.searchAndCreateSupervisor("Joachim", "Pool", "LionCage");



        zoo.addHabitat(pool);
        zoo.addHabitat(lionCage);
        zoo.addHabitat(monkeyCage);
        zoo.addHabitat(birdHouse);

//____________________________________________________________
//_________________________Pogramm____________________________
        zoo.printLayout();
        zoo.printSupervisors();
        zoo.printDailyCost();
    }


}