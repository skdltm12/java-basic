package sec1;
//Generic<T> {} = > 데이터의 타입과 관계없이 그 값을 저장할 목적 -> 다목적
//Generic<T,M> {} => 데이터 타입과 값을 저장 및 전달할 목적 -> 다목적 (키,값)
//키(key) => 객체의 주소, 객체의 멤버이름
class Product<T, M>{
	private T kind;		//key(field)
	private M model;	//value(field가 가진 값)
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
}
class Tv{
	String model;
}
class Human{
	String name;
}
public class ProductEx {
	public static void main(String[] args) {
		Product<Tv,String> p1 = new Product<Tv,String>();
		p1.setKind(new Tv());
		p1.setModel("스마트 TV");
		Tv t1 = p1.getKind();
		String TvModel = p1.getModel();
		System.out.println("TV : "+t1+", Model : "+TvModel);
		
		Product<Human, String> p2 = new Product<Human,String>();
		p2.setKind(new Human());
		p2.setModel("여승원");
		Human h1 = p2.getKind();
		String hModel = p2.getModel();
		System.out.println("Human : "+h1+", Name : "+hModel);
		
		
	}
}
