package iro.singtel.fish;

import iro.singtel.base.Fish;
/**
 * 
 * @author Iro
 *
 */
public class ClownFish extends Fish{

	private String color = "Gray";
	private String size = "Large";
	
	@Override
	public String swim() {
		return "I am swimming slower";
	}
	
	public String makeJokes() {
		return "I am Joking";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
}
