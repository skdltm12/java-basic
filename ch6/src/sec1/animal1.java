package sec1;

public class animal1 {

	public static void main(String[] args) {
		animal cat1 = new animal("고양이");
		animal dog = new animal("강아지");
		dog.setSpeed(160);
		animal bird = new animal("앵무새");
		bird.setType("조류");
		bird.setLegs(2);
		bird.setWings(2);
		animal chita = new animal("치타");
		chita.setType("포유류");
		chita.setSpeed(220); 
		chita.running(chita.getName(),chita.getSpeed());
	}
}
