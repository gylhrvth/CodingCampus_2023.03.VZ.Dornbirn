package joachim.week09.newZoo;


import lukas.week03.day4.Colors;

public class TheZoo {
    public static void main(String[] args) {
        NewZoo newZoo = new NewZoo("Herbert's Park", 1840);

        newZoo.findOrCreateSupervisor("Harald",false,"Orca", newZoo, false, "Pool");
        newZoo.findOrCreateSupervisor("Hugo",false,"Lion", newZoo, false, "Lion Cage", "Monkey Cage");
        newZoo.findOrCreateSupervisor("Anna",false,"Zebra", newZoo, false, "Lion Cage", "Monkey Cage");
        newZoo.findOrCreateSupervisor("Flora",false,"Toucan", newZoo, false, "Birdhouse");
        newZoo.findOrCreateSupervisor("Gerlinde",false,"Orangutan", newZoo, true, "Pool", "Lion Cage", "Monkey Cage", "Birdhouse");

        newZoo.findOrCreateDoctor("The Doctor");


        newZoo.findOrCreateAnimal("Abe", "Zebra", "Lion Cage", 15*365,100);
        newZoo.findOrCreateAnimal("Emil", "Zebra", "Lion Cage", 4*365,100);
        newZoo.findOrCreateAnimal("Herbert", "Zebra", "Lion Cage", 2*365,100);
        newZoo.findOrCreateAnimal("Julia", "Zebra", "Lion Cage", 16*365,100);
        newZoo.findOrCreateAnimal("Löwe", "Lion", "Lion Cage", 16*365,100);
        newZoo.findOrCreateAnimal("Katze", "Lion", "Lion Cage", 16*365,100);
        newZoo.findOrCreateAnimal("Hackschnitzel", "Lion", "Lion Cage", 16*365,100);
        newZoo.findOrCreateAnimal("Gustav", "Lion", "Lion Cage", 16*365,100);



        newZoo.findOrCreateAnimal("Habibi", "Tuna", "Pool", 22*365,100);
        newZoo.findOrCreateAnimal("Roger", "Tuna", "Pool", 2*365,100);
        newZoo.findOrCreateAnimal("Klaus", "Tuna", "Pool", 5*365,100);
        newZoo.findOrCreateAnimal("Meert", "Orca", "Pool", 18*365,100);
        newZoo.findOrCreateAnimal("Kartoffel", "Orca", "Pool", 17*365,100);
        newZoo.findOrCreateAnimal("Steve", "Orca", "Pool", 4*365,100);
        newZoo.findOrCreateAnimal("Karl-Heinz", "Orca", "Pool", 9*365,100);


        newZoo.findOrCreateAnimal("Ape", "Orangutan", "Monkey Cage", 4*365,100);
        newZoo.findOrCreateAnimal("Laura-Maria", "Orangutan", "Monkey Cage", 12*365,100);
        newZoo.findOrCreateAnimal("Benjamin", "Orangutan", "Monkey Cage", 17*365,100);
        newZoo.findOrCreateAnimal("Trudel", "Orangutan", "Monkey Cage", 69*365,100);

        newZoo.findOrCreateAnimal("Gertrude", "Chimpanzee", "Monkey Cage", 3*365,100);
        newZoo.findOrCreateAnimal("Hexagon", "Chimpanzee", "Monkey Cage", 5*365,100);
        newZoo.findOrCreateAnimal("Rhombus", "Chimpanzee", "Monkey Cage", 7*365,100);
        newZoo.findOrCreateAnimal("Spongebob", "Chimpanzee", "Monkey Cage", 11*365,100);



        newZoo.findOrCreateAnimal("Rudy", "Grey African", "Birdhouse", 30*365,100);
        newZoo.findOrCreateAnimal("Emu", "Grey African", "Birdhouse", 35*365,100);
        newZoo.findOrCreateAnimal("Robert", "Grey African", "Birdhouse", 35*365,100);

        newZoo.findOrCreateAnimal("Tuck","Toucan","Birdhouse",12*365,100);
        newZoo.findOrCreateAnimal("Fost","Toucan","Birdhouse",12*365,100);
        newZoo.findOrCreateAnimal("Nomsy","Toucan","Birdhouse",8*365,100);

        newZoo.findOrCreateAnimal("Aspargus","Agapornis","Birdhouse",4*365,100);
        newZoo.findOrCreateAnimal("Mango","Agapornis","Birdhouse",4*365,100);
        newZoo.findOrCreateAnimal("Sylas","Agapornis","Birdhouse",4*365,100);





        newZoo.printLayout();
        for (int i = 0; i < 8*365; i++) {
            System.out.println(Colors.COLORS[1] +"A new Day has begun\n----------------------------------------------------" + Colors.RESET);
            newZoo.beforeDailyRoutine();
            newZoo.dailyRoutine();
            try {
                Thread.sleep(1);
            } catch(InterruptedException exc) {
                //noob
            }
            if(i%365 == 0){
                System.out.println("A year has ended");
                newZoo.printLayout();
            }
        }
        newZoo.printLayout();
    }
}
