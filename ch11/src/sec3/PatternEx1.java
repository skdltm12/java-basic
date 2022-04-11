package sec3;

import java.util.regex.Pattern;

public class PatternEx1 {

	public static void main(String[] args) {
		//정규 표현식(Regular Expression) = 패턴(Pattern)
		//원하는 형식이 맞는지 검증하게 하는 식
		//아이디, 비밀번호, 전화번호, 이메일, 주민번호 등의 형식을 검증할 수 있다.
		//한 개의 문자[] -> [abc] : abc 중 하나의 문자를 포함하고 있는지
		//				[^abc] : 한 문자라도 a,b,c가 아니도록 제한
		//				[a-z] : a~z 영문 소문자가 포함되는지
		//				[a-zA-Z] : 영문 대소문자가 포함되는지
		//				[a-zA-z0-9] : 영문, 숫자가 포함되어 있는지
		//	\d -> 십진수 [0-9]를 의미함
		//	\s -> 공백이 포함되어 있는지
		//	\w -> [a-zA-Z0-9]와 동일
		//	? -> 없음 또는 한 글자		ex) kbs? -> kbs 또는 kbs1, kbs2, kbsa 등
		//	* -> 없음 또는 한 글자 이상	ex) kbs* -> kbs 또는 kbs1234,kbs123462,kbs1
		//	+ -> 한 글자 이상			ex) kbs+ -> kbs1, kbsa, kbsa12347s
		//	{n} -> n글자여야함		  	ex) \d{3}	:	숫자 3글자여야 함.
		// {n,m} -> n글자거나 m글자여야함.ex) \d{3,4} : 숫자 3글자거나, 4글자여야함.
		// () -> 그룹 				ex) (02|031)
		// | -> 또는
		
		//전화번호 예제 : (02|031|010)-\d{3,4}-\d{4}
		//이메일 예제 : \w+@\w+(\.\w+)?
		// \w{8,12} : 영문 또는 숫자로 8~12글자 사이여야함. 아이디, 비밀번호 등에 쓰임
		//주민번호 예제 :  \d{6}-\d{7} 
		
		String regExp = "(02|031|010)-\\d{3,4}-\\d{4}";
		String[] data = {"010-1231-8799","032-879-7454","031-123-432"};
		for(String iso : data) {		
		boolean res = Pattern.matches(regExp, iso);
		if(res) {
			System.out.println(iso+"는 형식이 일치합니다");
		} else {
			System.out.println(iso+"는 정규표현식과 형식이 일치하지 않습니다");
		}
		}
		System.out.println("-*-**-**--**--**-*-*-*-*--*-");
		String regExp2 = "\\w+@\\w+\\.\\w+?";
		String[] emails = {"kbs@naver.com","oiod@nate.com","dasddg@fff","2eadw2@nadsfdf23d"};
		
		for(String iso1 : emails) {
			boolean res = Pattern.matches(regExp2, iso1);
			if(res) {
				System.out.println(iso1+"은 패턴의 방식과 일치합니다.");
			} else {
				System.out.println(iso1+"은 패턴의 방식과 일치하지 않습니다.");
			}
			}
				
		String ID = "\\w{4,12}+";
		String[] IDlist = {"slsds","dkdlfjs031","sdf"};
			for(String iso : IDlist) {
				boolean res = Pattern.matches(ID, iso);
			if(res) {
				System.out.println("아이디가 형식과 일치합니다.");
			} else {
				System.out.println("아이디가 형식과 일치하지 않습니다.");
			}
			}
	}
}
		
		
				
		
	

