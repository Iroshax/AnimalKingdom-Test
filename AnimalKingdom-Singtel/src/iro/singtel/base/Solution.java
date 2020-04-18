package iro.singtel.base;

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
		}

}
