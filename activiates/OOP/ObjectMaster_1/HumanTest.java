/**
 * HumanTest
 */
public class HumanTest {

    public static void main(String[] args) {
     
            Human battle1 = new Human();
            Human battle2 = new Human();

            battle1.attack(battle2);
            System.out.println(battle2.getHealth());
        
    }
}