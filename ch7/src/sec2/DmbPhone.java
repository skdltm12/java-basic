package sec2;

public class DmbPhone extends Cellphone {
	
int channel;
DmbPhone(){};	
DmbPhone(String model){
		this(model,"색상",0);
}
DmbPhone(String model,String color){
		this(model,color,0);
		}
DmbPhone(String model,String color,int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
public void trunOnDmb() {
	System.out.println("현재 "+channel+"번 채널의 방송을 시작합니다");
}
public int ChannelDmb(int chan) {
	System.out.println("채널을 "+chan+"번으로 변경합니다.");
	return chan;
}
public void turnOffDmb() {
	System.out.println("DMB 방송을 종료합니다.");
}
}

