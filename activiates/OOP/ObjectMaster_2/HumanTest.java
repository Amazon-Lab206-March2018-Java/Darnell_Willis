/**
 * HumanTest
 */
public class HumanTest {

    public static void main(String[] args) {
     
            Human battle1 = new Human();
            Human battle2 = new Human();
            Wizard wizard1 = new Wizard();
            Samurai samurai1 = new Samurai();

            battle1.attack(battle2);

            Wizard.fireball(Samurai);
            //System.err.println(Samurai());

            System.out.println(battle2.getHealth());
        
    }
}