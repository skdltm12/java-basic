package sec2;

public class DmbPhoneEx {

	public static void main(String[] args) {
		DmbPhone dmb1 = new DmbPhone("S22","빨간색",22);

		
		System.out.println("dmb1의 색상: "+dmb1.color);
		System.out.println("dmb1의 모델: "+dmb1.model);
		System.out.println("dmb1의 채널: "+dmb1.channel);
		
		dmb1.powerOn();
		dmb1.bell();
		dmb1.sendVoice("여보세요");
		dmb1.receiveVoice("안녕하셨습니까?");
		dmb1.hangUp();
		dmb1.trunOnDmb();
		dmb1.ChannelDmb(12);
		dmb1.powerOff();
		
		

	}

}
