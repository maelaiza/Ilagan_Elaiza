package Ilagan_L12Activity;

public class SwordsMan extends DnDCharacter {

    public SwordsMan(String characterName) {
        super(characterName, 100, 25);
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