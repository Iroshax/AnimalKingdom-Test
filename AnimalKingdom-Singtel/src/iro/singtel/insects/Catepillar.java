package iro.singtel.insects;

import iro.singtel.base.Animal;
import iro.singtel.base.LiveinLand;

/**
 * 
 * @author Iro
 *
 */
public class Catepillar extends Animal implements LiveinLand{

	private State caterpillarState = new CaterpillarState();
	
	public Boolean Checkwalk() {	
			return caterpillarState.canWalk();

	}
	
	public Boolean CheckFly() {	
		return caterpillarState.canFly();

	}
	
	public void transform() {
		
		caterpillarState = new ButterflyState();
	}

	@Override
	public String walk() {
		return "I can Walk";
	}
	
}
