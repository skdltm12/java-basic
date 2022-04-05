package sec2;

public class Cellphone {
	String model, color;
	
	public void powerOn() {
		System.out.println("전원을 켭니다");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다");
	} 
	public void bell() {
		System.out.println("벨이 울립니다");
	}
	public String sendVoice(String voi1) {
		System.out.println(voi1);
		return voi1;
	}
	public String receiveVoice(String voi2) {
		System.out.println(voi2);
		return voi2;
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다");
	} 
}	
	

