package com.darnell.web.models;

public class Dog extends Animal implements Pet {
	public Dog(String name, String breed, int weight) {
		super(name, breed, weight);
	}

	@Override
	public String showAffection() {
		if (getWeight() < 30) {
			return getName()+ " hopped into your lap and cuddled you!";
		}
		else {
			return getName()+ " curled up next to you!";
		}
		
	}
}
