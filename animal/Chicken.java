package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible{

	@Override
	public String makeSound() {
		// TODO Auto-generated method stub
		return "Cluck !!!";
	}

	@Override
	public String howToEat() {
		// TODO Auto-generated method stub
		return "Fried Chicken !!!";
	}


	
}
