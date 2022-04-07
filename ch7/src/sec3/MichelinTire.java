package sec3;

public class MichelinTire extends Tire {

	MichelinTire(String location){
		this(location, 50);
	}
	MichelinTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		System.out.println("미쉐린타이어로 운행");
		++accRotation;
		if(accRotation<maxRotation) {
		System.out.println(location+" 미쉐린타이어 누적 운행 회전수 :"+accRotation);
		System.out.println(location+" 미쉐린타이어 남은 회전수 : "+(maxRotation-accRotation));
		return true;
		}else {System.out.println(location+" 미쉐린타이어 펑크");
		return false;}
	}
		
	}
	


