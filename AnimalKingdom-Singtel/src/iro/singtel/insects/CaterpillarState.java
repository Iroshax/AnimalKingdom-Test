package iro.singtel.insects;

import iro.singtel.base.LiveinLand;
/**
 * 
 * @author Iro
 *
 */
public class CaterpillarState implements State,LiveinLand{

	@Override
	public String walk() {
		return "I can walk";
	}

	@Override
	public Boolean canFly() {
		return false;
	}

	@Override
	public Boolean canWalk() {
		return true;
	}

}
