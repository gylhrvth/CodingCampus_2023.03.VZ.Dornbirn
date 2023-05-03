package mariechristine.week8.zoo;

public class Animal {
    private String species;
    private String animalName;

    public Animal(String animalName, String species) {
        this.species = species;
        this.animalName = animalName;

    }

    public String getAnimalName() {
        return animalName;
    }

    public String getSpecies() {
        return species;
    }

    public void printStructure(){
        System.out.println("│        ├── " + animalName + ", " + species);
    }

    @Override
    public String toString() {
        return animalName + ", " + species;
    }
}
