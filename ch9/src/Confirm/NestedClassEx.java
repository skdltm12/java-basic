package Confirm;

public class NestedClassEx {

	public static void main(String[] args) {
	Car myCar = new Car();
	
	Car.Tire tire = myCar.new Tire();
	
	Car.Engine enegine = new Car.Engine(); 

	}

}
