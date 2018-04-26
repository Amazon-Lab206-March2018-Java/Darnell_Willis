
public class Gorilla extends Mammal {
	
	public Gorilla throwSomething () {
        System.out.println ("The Gorilla has thrown something");
        energyLevel -= 5;
        return this;
    }

    public Gorilla eatBananas () {
        System.out.println ("The Gorilla is satified");
        energyLevel += 10;
        return this;
    }

    public Gorilla climb () {
        System.out.println ("The Gorilla has climbed a tree");
        energyLevel -= 10;
        return this;
    }
	
}
