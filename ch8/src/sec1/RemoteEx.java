package sec1;

public class RemoteEx {

	public static void main(String[] args) {
		RemoteControl rc1;
		rc1 = new TvRemote();
		rc1.turnOn();
		rc1.setVolume(10);
		System.out.println("TV볼륨 : "+rc1.getVolume());
//		인터페이스에서 선언되지 않았으므로 getChannel과 setChannel은 사용불가
//		System.out.println(rc1.getChannel());
		rc1.turnOff();
		rc1 = new AudioRemote();
		rc1.turnOn();
//		rc1은 객체 생성을 새로 하였으므로 볼륨값은 다시 0으로 초기화됨
		System.out.println("오디오 볼륨 : "+rc1.getVolume()); 
		rc1.turnOff();
		
		TvRemote rc2 = new TvRemote();
		rc2.volume = 20;
		rc2.channel = 24;
		
		//형제끼리의 형변환은 허용안됨
		RemoteControl rc4 = rc2; //자동형변환
		
		//메서드를 호출하여 값을 전달할 때 클래스로 묶어서 전달하는것이 효율적이다
		RemoteEx.play(rc2);		//call by reference
		RemoteEx.play(rc2.volume, rc2.channel);	//call by value
	}
	public static void play(TvRemote tv1) {
		System.out.println("TV의 볼륨 : "+tv1.volume);
		System.out.println("TV의 채널 : "+tv1.channel);
		System.out.println("플레이를 합니다.");
	}
	public static void play(int volume,int channel) {
		System.out.println("TV의 볼륨 : "+volume);
		System.out.println("TV의 채널 : "+channel);
		System.out.println("플레이를 합니다.");
	}
	
}
