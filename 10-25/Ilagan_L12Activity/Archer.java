package Ilagan_L12Activity;

public class Archer extends DnDCharacter {

    public Archer(String characterName) {
        super(characterName, 100, 20);
    }

    @Override
    public void attack(DnDCharacter opponent) {
        System.out.println(characterName + " sharply shoots " + opponent.characterName);
        opponent.receiveDamage(this.damage);
    }

    @Override
    public void receiveDamage(int damage) {
        this.health -= damage;
    }
}