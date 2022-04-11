package sec3;

import java.util.StringTokenizer;

public class StringTokenIzerEx1 {

	public static void main(String[] args) {
		//string객체.split("구분기호 또는 정규 표현식");
		
		String str = "길정훈&김동협,김성민-김예은&김준호,김태균-김효민";
		String[] arr = str.split("&|,|-");	//분리 기호 나열
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
		for(String name:arr) {
			System.out.println(name);
		}
		
		System.out.println("-*--*-*-*-*-*-*Tokenizer(for)-*--**-*-*--*");
		//-StringTokenizer클래스 : countTokens() - 토큰의 수, hasMoreTokens() - 남아있는 토큰의 여부
		str = "신길호/여승원/이규진/이규호/이민환/임소희/장성필";
		StringTokenizer s = new StringTokenizer(str,"/");
		int l = s.countTokens();
		for(int i=0;i<l;i++) {
			String t = s.nextToken();
			System.out.println(t);
		}
		System.out.println("-*--*-*-*-*-*-*Tokenizer(while-hasMoreTokens)-*--**-*-*--*");
		StringTokenizer s2 = new StringTokenizer(str,"/");
		while(s2.hasMoreTokens()) {
			 String t2 = s2.nextToken();
			 System.out.println(t2);
		}
		}
	}

