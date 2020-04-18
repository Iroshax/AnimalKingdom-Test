package iro.singtel.test;

import org.junit.Assert;
import org.junit.Test;

import iro.singtel.birds.Chicken;
import iro.singtel.birds.Duck;
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
		

}
