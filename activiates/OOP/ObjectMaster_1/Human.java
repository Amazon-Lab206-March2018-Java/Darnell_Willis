/**
 * Human
 */
public class Human {

    private int strength = 3;
    private int stealth = 3;
    private int intelligence = 3;
    private int health = 100;

    public void attack (Human enemy) {
        enemy.takenDamage (strength);
    }

    public void takenDamage (int damage) {
        health -= damage;
    }

    public int getHealth () {
        return health;
    }
    
}