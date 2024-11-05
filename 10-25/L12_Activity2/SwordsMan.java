package L12_Activity2;

public class SwordsMan extends DnDChar implements Abilities {

    public SwordsMan(String characterName) {
        super(characterName, 100, 25);
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
        this.damage += buff;
        System.out.println(characterName + " increased damage by " + buff + ". Current damage: " + damage);
    }
}