/**
 * Samurai
 */
public class Samurai {

    private int health = 200;

    public Samurai () {
        health = 200;
        samuraiCount++;
    }

    public void deathBlow(Human target) {
        target.takeDamage( target.getHealth());
        health = health / 2;
    }

    public void meditate() {
        health += health / 2;
    }

    public int howMany () {
        return samuraiCount;
    }
    
}