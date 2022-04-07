package sec3;

public class BikeEx1 {

	public static void main(String[] args) {
	Bike bike1 = new Bike();
	
	for(int i=0;i<121;i++) {
	int errorTire = bike1.run();
		switch (errorTire) {
		case 1:
			System.out.println("앞 쪽 타이어 교체");
			break;
		case 2:
			System.out.println("뒤 쪽 타이어 교체");
			break;
		}
		System.out.println("---------------------");
	}
}
}
