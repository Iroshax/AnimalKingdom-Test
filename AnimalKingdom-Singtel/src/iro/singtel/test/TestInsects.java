package iro.singtel.test;

import org.junit.Assert;
import org.junit.Test;

import iro.singtel.insects.Butterfly;
import iro.singtel.insects.Catepillar;
/**
 * 
 * @author Iro
 *
 */
public class TestInsects {
	
	@Test
	public void testCatepillar() {
		
		Catepillar catepillar = new Catepillar();
		Assert.assertEquals(catepillar.CheckFly(), false);
		Assert.assertEquals(catepillar.Checkwalk(), true);
	}
	@Test
	public void testButterfly() {
		
		Butterfly butterfly = new Butterfly();
		Assert.assertEquals(butterfly.fly(),"I am flying");

	}

}
