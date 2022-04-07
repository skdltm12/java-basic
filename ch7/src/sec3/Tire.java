package sec3;

public class Tire{
	int maxRotation;	//최대 회전수(수명)
	int accRotation;	//누적 회전수
	String location;	//타이어 위치
	
	Tire(String location,int maxRotation){
		this.maxRotation = maxRotation;
		this.location=location;
	}
	
	public boolean roll() {
		++accRotation;
		if(accRotation<maxRotation) {
			System.out.println(location+" 타이어의 회전 수 : "+accRotation);
			System.out.println(location+" 타이어의 잔여 회전 수 : "+(maxRotation-accRotation));
			return true;}
		else {System.out.println(location+" 타이어 펑크");
			return false;}
		
	}	
}
