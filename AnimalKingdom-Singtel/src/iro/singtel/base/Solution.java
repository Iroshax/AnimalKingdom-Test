package iro.singtel.base;

import iro.singtel.birds.Chicken;
import iro.singtel.birds.Duck;
import iro.singtel.birds.ParrotNearRooster;
import iro.singtel.birds.ParrotWithCats;
import iro.singtel.birds.ParrotWithDogs;
import iro.singtel.birds.Rooster;
import iro.singtel.fish.ClownFish;
import iro.singtel.fish.Dolphin;
import iro.singtel.fish.Shark;
import iro.singtel.insects.Butterfly;
import iro.singtel.insects.Catepillar;

/**
 * 
 * @author Iro
 *
 */
public class Solution {

		public static void main(String[] args) {
		Bird bird = new Bird();
//		System.out.println(bird.walk());
		System.out.println(bird.fly());
		System.out.println(bird.sing()); 
		
		Catepillar catepillar = new Catepillar();
		System.out.println("Check catepiller transformation in to Butterfly");
		System.out.println("can fly? "+catepillar.CheckFly());
		System.out.println("can walk? "+catepillar.Checkwalk());
		catepillar.transform();
		System.out.println("---Transforming----");
		System.out.println("can fly now? "+ catepillar.CheckFly());
		
		
		
		Animal[] animals = new Animal[]{
				 new Duck(),
				 new Chicken(),
				 new Rooster(),
				 new ParrotNearRooster(),
				 new ParrotWithCats(),
				 new ParrotWithDogs(),
				 new Shark(),
				 new ClownFish(),
				 new Dolphin(),
				 new Butterfly(),
				 new Catepillar(),
				};
		
		int flyCount = 0;
		int walkCount = 0;
		int singCount = 0;
		int swimCount = 0;
		
		for (int i = 0; i < animals.length; i++) {
			
			if (animals[i] instanceof CanFly) {
				flyCount = flyCount + 1;
			}else if(animals[i] instanceof LiveinLand) {
				walkCount = walkCount + 1;
			}else if(animals[i] instanceof Bird) {
				singCount = singCount + 1;
			}else if(animals[i] instanceof LiveInWater) {
				swimCount = swimCount + 1;
			}
		}
		
		System.out.println("How many animals can fly?  =  "+ flyCount);
		System.out.println("How many animals can walk?  =  "+ walkCount);
		System.out.println("How many animals can sing?  =  "+ singCount);
		System.out.println("How many animals can swim?  =  "+ swimCount);
		}

}
