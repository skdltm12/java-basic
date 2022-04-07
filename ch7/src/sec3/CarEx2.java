package sec3;

public class CarEx2 {
	public static void main(String[] args) {
		Car car1 = new Car();
		for(int i=1;i<110;i++) {
			int errorTire = car1.run();
			switch(errorTire) {
			case 1:
				System.out.println("앞 왼쪽 타이어 교체");
				car1.frontLeftTire = new KumhoTire("앞 왼쪽");
				break;
			case 2:
				System.out.println("앞 오른쪽 타이어 교체");
				car1.frontRightTire = new KumhoTire("앞 오른쪽", 30);
				break;
			case 3:
				System.out.println("뒤 왼쪽 타이어 교체");
				car1.backLeftTire = new MichelinTire("뒤 왼쪽");
				break;
			case 4:
				System.out.println("뒤 오른쪽 타이어 교체");
				car1.backLeftTire = new HankookTire("뒤 오른쪽");
				break;
			}
			System.out.println("-----------------------");
		}
		Tire tire0 = new Tire("그냥타이어", 50);
		Tire tire1 = new KumhoTire("금호타이어");
		Tire tire2 = new MichelinTire("미쉐린타이어");
		Tire tire3 = new HankookTire("한국타이어");
		MichelinTire tire4 = new MichelinTire("미쉐린타이어");
		//객체명 instanceof 클래스명 : 특정 클래스로 부터 만들어진 인스턴스인지 비교
		System.out.println("tire0은 Tire클래스로 부터 만들어진 인스턴스 인가? "+(tire0 instanceof Tire));
		System.out.println("tire1은 Tire클래스로 부터 만들어진 인스턴스 인가? "+(tire1 instanceof Tire));
		System.out.println("tire3은 Tire클래스로 부터 만들어진 인스턴스 인가? "+(tire3 instanceof Tire));
		System.out.println("tire4은 Tire클래스로 부터 만들어진 인스턴스 인가? "+(tire4 instanceof Tire));
		//System.out.println("tire4는 Hankook클래스로 부터 만들어진 인스턴스인가 ? "+(tire4 instanceof HankookTire));
		//자동 형변환
		Tire tire6 = tire4;
		// 부모클래스로 부터 만드는 인스턴스에는 자식클래스로부터 만든 인스턴스 내용을 대입할 수 있도록 자동으로 형변환

		
		//강제 형변환
//		tire4 = (HankookTire) tire0; 부모 클래스로 부터 얻어진 객체가 아닌경우 해당 클래스의 강제 캐스팅이 가능하다
		//1 - kumhoTire tire5 = (Tire) tire4;
		//2 - KumhoTire tire5 = (KumhoTire) tire4;
		//클래스명 인스턴스명 = (클래스명) 부모클래스명;
		//자식 클래스로 부터 만드는 인스턴스는 부모 클래스로 부터 만든 인스턴스 내용을 대입할 수 없기 때문에
		//부모 클래스로 부터 만든 인스턴스 앞에 (자식 클래스명)을 붙여서 강제형변환을 할 수 있다
		//Tire tire6 = tire1;
		//KumhoTire tire6 = tire0;	(X) 형변환이 되지 않음
		//KumhoTire tire6 = (KumhoTire)	tire0;	(O) 자동형변환이 되지 않아 강제형변환
		
		//※자식클래스로 만들어진 인스턴스는 부모클래스로 만들어진 인스턴스를 대입시킬 수 없으므로 강제 형변환이 필요하다.
		//부모 클래스로 만들어진 인스턴스는 자식클래스로 만들어진 인스턴스를 대입시킬 경우 자동형변환이 된다.
	}
}

