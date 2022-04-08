package sec1;

public class ObjectEx1 {
	public static void main(String[] ages) {
	Object obj1 = new Object();
	Object obj2 = new Object();
	if(obj1 == obj2) {
		System.out.println("같다");
	}else {System.out.println("다르다");}
	if(obj1.equals(obj2)) {
		System.out.println("같다");
		}else {System.out.println("다르다");}
}
}