package sec1;

class Member{	//모든 클래스의 조상은 Object이므로 extends를 하지 않아도 Object클래스로 부터 상속된다. 
	public String id;
	Member(String id){ this.id=id;}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
		Member mem = (Member) obj;
		if (id.equals(mem.id)) {
			return true;
			}
		}
		return false;
	}
}
public class ObjectEx2 {
	public static void main(String[] args) {
		Member obj1 = new Member("ysw");
		Member obj2 = new Member("siu");
		Member obj3 = new Member("ysw");
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 같다.");
		} else {
			System.out.println("obj1과 obj2는 다르다.");
		}
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 같다.");
		} else {
			System.out.println("obj1과 obj3는 다르다.");
	}
	}
}
