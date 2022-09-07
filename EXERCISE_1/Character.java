public class Character {
    private static final String Greetings = null;
    // Character attributes
    int strength;
    int agility;
    int intelligence;
    String name;
    String greeting;

    // Character method
    public void sayMyName() {
        System.out.println("\nThe names " + name);
        
        System.out.println("Greeting: " + Greetings);
        //System.out.println("\nStrength: " + strength + "\nAgility: " + agility + "\nIntelligence: " + intelligence);
    }
}
