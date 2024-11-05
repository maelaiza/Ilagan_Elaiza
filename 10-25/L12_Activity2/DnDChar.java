package L12_Activity2;

public abstract class DnDChar {
    protected String characterName;
    protected int health;
    protected int damage;

    public DnDChar(String characterName, int health, int damage) {
        this.characterName = characterName;
        this.health = health;
        this.damage = damage;
    }

    public abstract void attack(DnDChar opponent);

    public abstract void receiveDamage(int damage);

    @Override
    public String toString() {
        return "Name: " + characterName + "   Health: " + health + "   Damage: " + damage;
    }

    public boolean isAlive() {
        return health > 0;
    }
}