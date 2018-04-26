/**
 * Ninja
 */
public class Ninja {

    private int stealth = 10;

    public void steal(Human strike) {
        strike.takeDamage(stealth);
        health += stealth;
    }

    public void runAway() {
        health -= 10;
    }
    
}