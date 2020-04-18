package iro.singtel.fish;

import iro.singtel.base.Animal;
import iro.singtel.base.LiveInWater;
/**
 * 
 * @author Iro
 *
 */
public class Dolphin extends Animal implements LiveInWater{

	@Override
	public String swim() {
		return "I am swimming but im not a fish";
	}

}
