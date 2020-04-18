package iro.singtel.birds;
//3 
public class Rooster extends Chicken{
// a.
	@Override
	public String makeSound() {
		return "Cock-a-doodle-doo";
	}
	// b. How is the rooster related to the chicken? Rooster is-a chicken
	// c. We can use composition to implement attributes of a chicken inside Rooster class without
	// inheriting them directly from Chicken class
}
