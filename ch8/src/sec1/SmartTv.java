package sec1;
//인터페이스로 부터 다중상속을 받는 SmartTv는
//반드시 두개의 인터페이스 선언내용이 구현되어야 함 
//다중 상속 : 여러개의 인터페이스를 하나의 클래스가 상속받는 것
public class SmartTv implements RemoteControl, Searchable{
	private int volume;
	private int channel;
	@Override
	public void Search(String url){
		
	}
	@Override
	public void turnOn() {
		}
	@Override
	public void turnOff() {
		}
	@Override
	public void setVolume(int Volume) {
		}
	@Override
	public int getVolume() {return 0;}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
}
