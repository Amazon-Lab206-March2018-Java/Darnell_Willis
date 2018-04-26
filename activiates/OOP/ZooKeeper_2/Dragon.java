/**
 * Dragon
 */
public class Dragon {

        public int energyLevel = 300;

        public void display() {
            System.out.println(energyLevel);
        }

        public void fly() {
            System.out.println("Fly Off");
            energyLevel -= 50;
        }

        public void eatHumans() {
            System.out.println("so- well, never mind");
            energyLevel += 25;
        }

        public void attackTown() {
            System.out.println("The town is on is on fire");
            energyLevel -= 100;
        }

}