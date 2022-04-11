package sec3;

public class StringBuilderEx1 {

	public static void main(String[] args) {
		String yeo = "여승원";
		String lee = "이순신";
		System.out.println(yeo+", "+lee);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Java ");		//추가
		sb.append("Web ");
		sb.append("Programing ");
		System.out.println(sb);
		
		sb.insert(4, "3");		//특정 위치에 삽입
		System.out.println(sb);
		
		sb.setCharAt(4,'8');	//특정 위치의 문자를 변경 (한글자만 가능)
		System.out.println(sb);
		
		sb.replace(10, 21, "Programmer");	//특정 번째의 문자열을 수정할 수 있음. 
		System.out.println(sb);
		
		sb.delete(4, 5);		//특정 번쨰의 문자열을 지울 수 있음
		System.out.println(sb);
		
		System.out.println("글자수 : "+sb.length());
		//StringBuilder를 String으로 변환
		String res = sb.toString();
		System.out.println("문자열로 반환된 결과 : "+res);
		
		//String을 StringBuilder로 변환
		StringBuilder sb2 = new StringBuilder(res);
		System.out.println(res);
	}
}
