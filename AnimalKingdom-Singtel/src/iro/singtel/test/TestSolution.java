package iro.singtel.test;

import org.junit.Assert;
import org.junit.Test;

import iro.singtel.base.Animal;
import iro.singtel.base.Bird;
/**
 * 
 * @author Iro
 *
 */
public class TestSolution {
	
	@Test
	public void testAnimal() {
		
		Animal animal = new Animal();
		Assert.assertEquals(animal.walk(), "I am walking");
	}
	@Test
	public void testBird() {
		
		Bird bird = new Bird();
		
		Assert.assertEquals(bird.walk(), "I am walking");
		Assert.assertEquals(bird.fly(), "I am flying");
		Assert.assertEquals(bird.sing(), "I am Singing");
	}

}
