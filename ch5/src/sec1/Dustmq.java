package sec1;

public class Dustmq {

	public static void main(String[] args) {
		String[] names = {"김태균", "김효민", "신길호", "여승원", "이규진"};
		int [][] jum = {{100,80,90},{70,90,80},{60,90,80},{90,80,70},{85,95,85}};
		int hap = 0;
		float py = 0.0f;
		int []tot = new int[3];
		float [] avg = new float[3]; 
		
		
		System.out.println("***************************");
		System.out.println("성명"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학");
		System.out.println("***************************");
		
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+"\t");
		for(int j=0;j<3;j++) {
			System.out.print(jum[i][j]+"\t");
			hap+=jum[i][j];
			tot[j]+=jum[i][j];
			avg[j]=tot[j]/names.length;
			py = hap/3.0f/names.length;
					
			
			
		}
			System.out.print("\n");
			
			
		}
		System.out.println("***************************");
		System.out.println("과목총점 "+tot[0]+"\t"+tot[1]+"\t"+tot[2]);
		System.out.println("과목평균 "+avg[0]+"\t"+avg[1]+"\t"+avg[2]);
		System.out.println("***************************");
		System.out.print("전체총점 "+hap+"\t");
		System.out.println("전체평균 "+py);
	}

}
