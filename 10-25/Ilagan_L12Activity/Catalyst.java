package Ilagan_L12Activity;

public class Catalyst extends DnDCharacter {

    public Catalyst(String characterName) {
        super(characterName, 100, 15);
    }

    @Override
    public void attack(DnDCharacter opponent) {
        System.out.println(characterName + " tightly binded " + opponent.characterName);
        opponent.receiveDamage(this.damage);
    }

    @Override
    public void receiveDamage(int damage) {
        this.health -= damage;
    }
}