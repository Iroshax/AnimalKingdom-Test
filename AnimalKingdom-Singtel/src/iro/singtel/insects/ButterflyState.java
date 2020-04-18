package iro.singtel.insects;

import iro.singtel.base.CanFly;
/**
 * 
 * @author Iro
 *
 */
public class ButterflyState implements State,CanFly{

	@Override
	public String fly() {
		return "I can fly";
	}

	@Override
	public Boolean canFly() {
		return true;
	}

	@Override
	public Boolean canWalk() {
		return false;
	}

	
}
