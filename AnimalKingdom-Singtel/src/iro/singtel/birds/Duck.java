package iro.singtel.birds;

import iro.singtel.base.Bird;
import iro.singtel.base.LiveInWater;
import iro.singtel.base.LiveinLand;

/**
 * 
 * @author Iro
 *
 */
public class Duck extends Bird implements LiveInWater,LiveinLand{
	
	@Override
	public String makeSound() {
		return "Quack, quack";
	}

	@Override
	public String swim() {
		return "I am swimming";
	}

	@Override
	public String walk() {
		return "I can Walk";
	}

}
