package iro.singtel.insects;

import iro.singtel.base.Animal;
import iro.singtel.base.CanFly;
/**
 * 
 * @author Iro
 *
 */
public class Butterfly extends Animal implements CanFly{

	@Override
	public String fly() {
		return "I am flying";
	}

	
}
