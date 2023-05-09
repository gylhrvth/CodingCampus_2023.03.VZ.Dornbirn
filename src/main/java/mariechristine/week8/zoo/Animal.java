package mariechristine.week8.zoo;

import lukas.week03.day4.Colors;


public class Animal {
    private String species;
    private String animalName;
    private boolean wasFed = true;
    private int maxHealth;
    private int actualHealth;
    private int biteForce;



    public Animal(String animalName, String species, int maxHealth, int biteForce) {
        this.species = species;
        this.animalName = animalName;
        this.maxHealth = maxHealth;
        this.actualHealth = maxHealth;
        this.biteForce = biteForce;

    }

    public String getAnimalName() {
        return animalName;
    }

    public boolean wasFed() {
        return wasFed;
    }

    public void setFed(boolean wasFed) {
        this.wasFed = wasFed;
    }

    public int getActualHealth(){
        return actualHealth;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public boolean isAlive(){
        return actualHealth > 0;
    }

    public void bitesAnimal(Animal otherAnimal) {
        otherAnimal.actualHealth -= biteForce;
        System.out.print(animalName + "["+ actualHealth + "/"+ maxHealth + "]" + Colors.COLORS[1] + " bites " + Colors.RESET + otherAnimal.animalName);
        if (otherAnimal.actualHealth > 0) {
            System.out.println("[health: " + otherAnimal.actualHealth + "/"+ maxHealth + "]");
        } else {
            System.out.println(". " + otherAnimal + " R.I.P.");
        }
    }

    public void heal(int amount){
        actualHealth = Math.min(actualHealth + amount, maxHealth);

    }

    private double getRelativeHealthInPercent(){
        return 100 * actualHealth / (double)maxHealth;
    }

    public Animal getWeekestAnimal(Animal bestChoice) {
        if (bestChoice == null){
            bestChoice = this;
        } else if (this.getRelativeHealthInPercent() < bestChoice.getRelativeHealthInPercent()){
            bestChoice = this;
        }
        return bestChoice; //schwächste Tier wird zurückgegeben
    }

    public String getSpecies() {
        return species;
    }

    public void printStructure() {
        System.out.println("│        ├── " + animalName + ", " + species);
    }

    @Override
    public String toString() {
        return animalName + ", " + species;
    }
}
