package Ilagan_L12Activity;

public abstract class DnDCharacter {
    protected String characterName;
    protected int health;
    protected int damage;

    public DnDCharacter(String characterName, int health, int damage) {
        this.characterName = characterName;
        this.health = health;
        this.damage = damage;
    }

    public abstract void attack(DnDCharacter opponent);

    public abstract void receiveDamage(int damage);

    @Override
    public String toString() {
        return "Name: " + characterName + "   Health: " + health + "   Damage: " + damage;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
