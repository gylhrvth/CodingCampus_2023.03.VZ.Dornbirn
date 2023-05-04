package joachim.week09.newZoo;


public class TheZoo {
    public static void main(String[] args) {
        NewZoo newZoo = new NewZoo("Herbert's Park", 1840);

        newZoo.findOrCreateSupervisor("Harald",newZoo,"Pool");
        newZoo.findOrCreateSupervisor("Hugo",newZoo,"Lion Cage", "Monkey Cage");
        newZoo.findOrCreateSupervisor("Anna",newZoo,"Lion Cage", "Monkey Cage");
        newZoo.findOrCreateSupervisor("Flora",newZoo,"Birdhouse");
        newZoo.findOrCreateSupervisor("Gerlinde",newZoo,"Pool","Lion Cage", "Monkey Cage","Birdhouse" );


        newZoo.findOrCreateAnimal("Abe", "Lion", "Lion Cage", 15);
        newZoo.findOrCreateAnimal("Charlie", "Lion", "Lion Cage", 16);
        newZoo.findOrCreateAnimal("Habibi", "Orca", "Pool", 22);
        newZoo.findOrCreateAnimal("Roger","Orca","Pool",25);
        newZoo.findOrCreateAnimal("Ape","Orangutan","Monkey Cage",40);
        newZoo.findOrCreateAnimal("Chip","Chimpanzee","Monkey Cage",25);
        newZoo.findOrCreateAnimal("Chap","Chimpanzee","Monkey Cage",26);
        newZoo.findOrCreateAnimal("Rudy","Grey African","Birdhouse",30);
        newZoo.findOrCreateAnimal("Trudy","Grey African","Birdhouse",35);

        newZoo.printLayout();
    }
}
