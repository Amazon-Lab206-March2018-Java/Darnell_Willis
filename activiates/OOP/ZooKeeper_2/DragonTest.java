/**
 * DragonTest
 */
public class DragonTest {

    public static void main(String[] args) {
        Dragon actions = new Dragon();

        actions.attackTown();
        actions.attackTown();
        actions.attackTown();
        actions.display();

        actions.eatHumans();
        actions.eatHumans();
        actions.display();
        
        actions.fly();
        actions.fly();
        actions.display();
    }

}