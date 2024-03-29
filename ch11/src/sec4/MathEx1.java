package sec4;
//java.lang.Math
public class MathEx1 {

	public static void main(String[] args) {
		int v1 = Math.abs(-6);	//부호(-)와 절대값(6)
		double v2 = Math.abs(-6.28);
		
	System.out.println("v1="+v1);
	System.out.println("v2="+v2);
	
	System.out.println("6.3 => "+Math.ceil(6.3));	//올림
	System.out.println("-6.3 => "+Math.ceil(-6.3)+"\n");
	
	System.out.println("6.3 => "+Math.floor(6.3));	//내림
	System.out.println("-6.3 => "+Math.floor(-6.3)+"\n");
	
	System.out.println("6.8 => "+Math.rint(6.8));	//반올림하여 실수로 반환
	System.out.println("-6.8 => "+Math.rint(-6.8)+"\n");
	
	System.out.println("6.8 => "+Math.round(6.8));	//반올림하여 정수로 반환	
	System.out.println("-6.8 => "+Math.round(-6.8)+"\n");
	
	System.out.println("돗수분포에서 가장 큰 수 => "+Math.max(8,9));
	System.out.println("돗수분포에서 가장 작은 수 => "+Math.min(8,9));
	
	System.out.println("랜덤수 : "+Math.random()); //0~1아무 수나 무작위로 나타냄
	
	for(int i=0;i<6;i++){ {System.out.print(((int)(Math.random()*45)+1)+"\t");}}
	//1~45까지의 랜덤한 정수
	}

}


