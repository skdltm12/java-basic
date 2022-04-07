package sec1;

import Confirm.Soundable;

public class Dog implements Soundable{

	@Override
	public String sound() {
		return "멍멍";
	}

}