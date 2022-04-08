package sec3;

public class StringEx1 {

	public static void main(String[] args) {
		byte[] bytes = {74, 101, 107, 111, 34, 66};
		char[] chars = {'A','c','e'};
		//String 생성자는 문자배열이나 바이트 배열을 문자열로 변환한다.
		String str1 = new String(bytes);
		System.out.println("str1="+str1);
		String str2 = new String(chars);
		System.out.println("str1="+str2);
		String str3 = new String(bytes, 2, 3);	//String(문자열, 시작 인덱스, 개수)
		System.out.println("str1="+str3);
		
		String data = "여승원 최고";
		System.out.println(data.charAt(2)); // 특정 인덱스 위치의 문자를 추출
		System.out.println("문자 배열의 주소 : "+data.getBytes());
		System.out.println("승의 위치 : "+data.indexOf("승"));	//특정 문자의 위치를 반환
		System.out.println("data의 글자수 : "+data.length()); //특정 문자열의 글자수 반환
		String a = data.replace("승원", "승투");	//특장 문자나 문자열을 치환    
		System.out.println(a);
		String jumin = "120408-1231231";
		System.out.println("출생년도 : "+jumin.substring(0,2));	//begin 이상 ~ end 미만까지 추출
		System.out.print("성별 : ");
		int ma = Integer.parseInt(jumin.substring(7,8));
		switch(ma) {
		case 1: System.out.print("남자\n");
		break;
		case 2: System.out.print("여자\n");
		break; 
		case 3: System.out.print("남자\n");
		break;
		case 4: System.out.print("여자\n");
		break;
		default:
			System.out.print("잘못된 성별코드\n");
		}
		System.out.println("주민번호 뒷자리 : "+jumin.substring(7)); // end가 생략되면 끝까지
		
		String learn = "           Java Web Programming     ";		
		System.out.println("소문자로 : "+learn.toLowerCase());
		System.out.println("대문자로 : "+learn.toUpperCase());
		System.out.println("글자수 : "+learn.length());
		String yeo = learn.trim();
		System.out.println("공백을 제거한 글자수 : "+(yeo.length()));
		System.out.println("공백을 제거한 글자 : "+(yeo) );
		
		int b = 1004;
		float c = 32.128f;
		
		String d = String.valueOf(b);	//b의 정수 숫자 1004를 문자열 "1004"로 바꾼다
		int e = Integer.parseInt(d);	//"1004" 문자열을 숫자 정수 1004로 변경
		
		String f = String.valueOf(c);	//c의 실수 숫자 32.128을 문자열 "32.128"로 변경
		float g = Float.parseFloat(f);	//"32.128" 문자열을 숫자 실수 32.128로 변경
		
		String name1 = "여승원";
		String name2 = "최고";
		if(name1.equals(name2)) {	//두 문자열을 비교
			System.out.println("문자열이 같음");
		}else {
			System.out.println("문자열이 다름");
		}
		
	}
}
