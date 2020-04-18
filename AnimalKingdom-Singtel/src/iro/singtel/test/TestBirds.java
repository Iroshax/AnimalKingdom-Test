package iro.singtel.test;

import org.junit.Assert;
import org.junit.Test;

import iro.singtel.birds.Chicken;
import iro.singtel.birds.Duck;
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

}
