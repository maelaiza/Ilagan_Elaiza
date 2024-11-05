package L12_Activity2;

public class Catalyst extends DnDChar implements Abilities {

    public Catalyst(String characterName) {
        super(characterName, 100, 15);
    }

    @Override
    public void attack(DnDChar opponent) {
        System.out.println(characterName + " tightly binded " + opponent.characterName);
        opponent.receiveDamage(this.damage);
    }

    @Override
    public void receiveDamage(int damage) {
        this.health -= damage;
    }

    @Override
    public void restoreHealth(int restore) {
        this.health += restore;
        System.out.println(characterName + " restored health by " + restore + ". Current health: " + health);
    }

    @Override
    public void buffAbility(int buff) {
        this.health += buff;  
        System.out.println(characterName + " increased health by " + buff + ". Current health: " + health);
    }
}