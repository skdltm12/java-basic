package Confirm;

import sec1.Cat;
import sec1.Dog;

public class SoundableEx {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		printSound(new Dog());
		printSound(new Cat());

	}
	
}

