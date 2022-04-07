package sec1;

public class AudioRemote implements RemoteControl {
	int volume;		//상속시 자동으로 private이 돼버림
	

	public void turnOn() {
		System.out.println("오디오 전원을 켭니다.");		
	}

	public void turnOff() {
		System.out.println("오디오 전원을 끕니다.");		
	}

	public void setVolume(int volume) {this.volume = volume;}


	public int getVolume() {return volume;}
}
