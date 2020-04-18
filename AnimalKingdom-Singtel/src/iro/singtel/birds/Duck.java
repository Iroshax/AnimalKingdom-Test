package iro.singtel.birds;

import iro.singtel.base.Bird;


public class Duck extends Bird{
	

	public String swim() {
		return "I am swimming";
	}

	@Override
	public String makeSound() {
		return "Quack, quack";
	}

}
