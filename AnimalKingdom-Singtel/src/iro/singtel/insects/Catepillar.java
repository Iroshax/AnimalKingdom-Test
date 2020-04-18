package iro.singtel.insects;
/**
 * 
 * @author Iro
 *
 */
public class Catepillar {

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
	
}
