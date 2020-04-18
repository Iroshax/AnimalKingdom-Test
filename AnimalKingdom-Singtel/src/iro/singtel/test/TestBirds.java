package iro.singtel.test;

import org.junit.Assert;
import org.junit.Test;

import iro.singtel.birds.Chicken;
import iro.singtel.birds.Duck;
import iro.singtel.birds.ParrotNearRooster;
import iro.singtel.birds.ParrotWithCats;
import iro.singtel.birds.ParrotWithDogs;
import iro.singtel.birds.Rooster;
/**
 * 
 * @author Iro
 *
 */
public class TestBirds {
	
	@Test
	public void testDuck() {
		
		Duck duck = new Duck();
		Assert.assertEquals(duck.swim(), "I am swimming");
		Assert.assertEquals(duck.makeSound(), "Quack, quack");
	}
	@Test
	public void testChicken() {
		
		Chicken chicken = new Chicken();
		Assert.assertEquals(chicken.makeSound(), "Cluck, cluck");
	}
	
	@Test
	public void testRooster() {
		Rooster rooster = new Rooster();
		Assert.assertEquals(rooster.makeSound(), "Cock-a-doodle-doo");
	}
		
	@Test
	public void testParrotWithDogs() {
		ParrotWithDogs parrotWithDogs = new ParrotWithDogs();
		Assert.assertEquals(parrotWithDogs.makeSound(), "Woof, woof");
	}
	
	@Test
	public void testParrotWithCats() {
		ParrotWithCats parrotWithCats = new ParrotWithCats();
		Assert.assertEquals(parrotWithCats.makeSound(), "Meow");
	}
	
	@Test
	public void testParrotNearRooster() {
		ParrotNearRooster parrotNearRooster = new ParrotNearRooster();
		Assert.assertEquals(parrotNearRooster.makeSound(), "Cock-a-doodle-doo");
	}

}
