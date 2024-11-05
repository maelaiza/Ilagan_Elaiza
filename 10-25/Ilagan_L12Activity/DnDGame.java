package Ilagan_L12Activity;

public class DnDGame {
    public static void main(String[] args) {
        SwordsMan swordsman = new SwordsMan("Diluc");
        Catalyst catalyst = new Catalyst("Klee");
        Archer archer = new Archer("Amber");

        System.out.println("Swordsman's Profile:\n" + swordsman);
        System.out.println("Catalyst's Profile:\n" + catalyst);
        System.out.println("Archer's Profile:\n" + archer);
        System.out.println();

        DnDCharacter amber = archer;
        DnDCharacter klee = catalyst;

        System.out.println("Amber health: " + amber.health);
        System.out.println("Klee health: " + klee.health);

        
        while (amber.isAlive() && klee.isAlive()) {
            amber.attack(klee);
            klee.attack(amber);

            System.out.println("Amber health: " + amber.health);
            System.out.println("Klee health: " + klee.health);
            System.out.println();
        }

        if (amber.isAlive()) {
            System.out.println(amber.characterName + " wins the game!");
        } else {
            System.out.println(klee.characterName + " wins the game!");
        }
    }
}