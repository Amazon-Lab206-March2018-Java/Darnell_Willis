/**
 * Wizard
 */
public class Wizard extends Human{

    private int health = 50;
    private int intelligence  = 8;

    public void heal(Human firstAid) {
        firstAid.setHealth(firstAid.getHealth() + intelligence);
    }

    public void fireball(Human target) {
        target.takeDamage(3*intelligence);
    }

}