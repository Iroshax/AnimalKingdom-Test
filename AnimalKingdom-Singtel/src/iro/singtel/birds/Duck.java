package iro.singtel.birds;

import iro.singtel.base.Bird;
import iro.singtel.base.LiveInWater;

/**
 * 
 * @author Iro
 *
 */
public class Duck extends Bird implements LiveInWater{
	
	@Override
	public String makeSound() {
		return "Quack, quack";
	}

	@Override
	public String swim() {
		return "I am swimming";
	}

}
