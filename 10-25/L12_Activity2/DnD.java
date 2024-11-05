package L12_Activity2;

public class DnD {
    public static void main(String[] args) {
        SwordsMan swordsman = new SwordsMan("Diluc");
        Catalyst catalyst = new Catalyst("Klee");
        Archer archer = new Archer("Amber");

        System.out.println("Swordsman's Profile:\n" + swordsman);
        System.out.println("Catalyst's Profile:\n" + catalyst);
        System.out.println("Archer's Profile:\n" + archer);
        System.out.println();

       
        archer.restoreHealth(10);
        archer.buffAbility(20);
        
        catalyst.restoreHealth(10);
        catalyst.buffAbility(10);

        System.out.println();
        System.out.println("Updated Profiles After Abilities:");
        System.out.println("Archer: " + archer);
        System.out.println("Catalyst: " + catalyst);
    }
}
