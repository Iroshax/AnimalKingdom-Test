package iro.singtel.test;

import org.junit.Assert;
import org.junit.Test;

import iro.singtel.fish.ClownFish;
import iro.singtel.fish.Dolphin;
import iro.singtel.fish.Shark;


/**
 * 
 * @author Iro
 *
 */
public class TestFish {
	
	
	@Test
	public void testShark() {
		
		Shark shark = new Shark();
		Assert.assertEquals(shark.swim(), "I am swimming fast");
		Assert.assertEquals(shark.EatOtherFish(), "I eat other fish");
	}
	@Test
	public void testClownFish() {
		
		ClownFish clownFish = new ClownFish();
		Assert.assertEquals(clownFish.swim(), "I am swimming slower");
		Assert.assertEquals(clownFish.makeJokes(), "I am Joking");
	}
	
	@Test
	public void testDolphin() {
		Dolphin dolphin = new Dolphin();
		Assert.assertEquals(dolphin.swim(), "I am swimming but im not a fish");
	}
		

}
