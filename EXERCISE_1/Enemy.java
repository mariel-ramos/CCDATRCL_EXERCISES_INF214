public class Enemy {
    // Enemy attributes
    int damage;
    int health;
    int armor;
    boolean hasMagicImmunity;
    String name;
    String greeting;
    private String greetings;

    // Enemy method
    public void enemyDialogue() {
        System.out.println("\nFear me player for my name is " + name + " and I deal " + damage + " damage!");
        System.out.println (" die " + greetings);
    }
}
