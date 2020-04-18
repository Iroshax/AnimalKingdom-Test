package iro.singtel.birds;
/**
 * 
 * @author Iro
 *
 */
public class Rooster extends Chicken{

	@Override
	public String makeSound() {
		return "Cock-a-doodle-doo";
	}
	/**
	 *  b. How is the rooster related to the chicken? Rooster is-a chicken
	 *  c. We can use composition to implement attributes of a chicken inside Rooster class without 
	 *  inheriting them directly from Chicken class
	 */
	 
}
