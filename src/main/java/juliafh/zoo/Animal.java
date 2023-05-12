package juliafh.zoo;

public class Animal {
    String name;
    String genus;
    boolean fed;
    Food foodRequirement;
    int currentHealth;
    int maxHealth;
    int damage;

    public Animal(String name, String genus, Food fr, int maxHealth, int damage) {
        this.name = name;
        this.genus = genus;
        this.foodRequirement = fr;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        this.damage = damage;
    }

    public boolean isFed() {
        return this.fed;
    }
    public void beFed(boolean fed) {
        this.fed = fed;
    }

    public void attack(Animal a) {
        System.out.println(this.name + " bites " + a.name + " with " + this.damage);
        a.takeDamage(this.damage);
    }

    public void takeDamage(int damage) {
        this.currentHealth -= damage;
        if (this.currentHealth < 0) {
            this.currentHealth = 0;
        }

        System.out.println(name + "'s current health: " + this.currentHealth);
    }

}
