package iro.singtel.birds;

import iro.singtel.base.CanFly;
import iro.singtel.base.LiveinLand;

/**
 * 
 * @author Iro
 *
 */
public class Rooster extends Chicken implements CanFly,LiveinLand{

	@Override
	public String makeSound() {
		return "Cock-a-doodle-doo";
	}
	/**
	 *  b. How is the rooster related to the chicken? Rooster is-a chicken
	 *  c. We can use composition to implement attributes of a chicken inside Rooster class without 
	 *  inheriting them directly from Chicken class
	 */

	@Override
	public String walk() {
		return "I can Walk";
	}
	 
}
