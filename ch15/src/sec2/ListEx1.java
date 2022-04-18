package sec2;

import java.util.ArrayList;
import java.util.List;
class Human{
	private String name;
	private int sno;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class ListEx1 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("여승원");
		list1.add("강호동");
		list1.add("유재석");
		System.out.println("리스트의 크기 : "+list1.size());
		System.out.println("list1 : "+list1);
		for(String name : list1) {
			System.out.println("회원명 : "+name);
		}
		String irum = list1.get(1); //인덱스가 ㅏ1인 요소값 대입
		System.out.println("인덱스가 1인 요소 : "+irum);
		System.out.println("인덱스가 2인 요소 : "+list1.get(2));
		list1.add("이수근");
		list1.remove(1); //인덱스가 1인 요소를 제거
		System.out.println("list1 : "+list1);
		
		List<Human> h1= new ArrayList<Human>();
		Human m1 = new Human();
		h1.add(m1);
		m1.setSno(1);
		m1.setName("여승원");
		m1.setAge(25);
		Human m2 = new Human();
		h1.add(m2);
		m2.setSno(2);
		m2.setName("박명수");
		m2.setAge(40);
		System.out.println("번호\t회원명\t나이");
		for(Human h : h1) {
			System.out.print(h.getSno()+"\t");
			System.out.print(h.getName()+"\t");
			System.out.print(h.getAge()+"\n");
		}					
		}		
	}

