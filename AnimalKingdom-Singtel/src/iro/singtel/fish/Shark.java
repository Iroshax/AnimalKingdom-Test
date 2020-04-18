package iro.singtel.fish;

import iro.singtel.base.Fish;

public class Shark extends Fish {

	private String color = "Gray";
	private String size = "Large";
	
	@Override
	public String swim() {
		return "I am swimming fast";
	}
	public String EatOtherFish() {
		return "I eat other fish";
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
