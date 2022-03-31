package sec1;

public class Bread {
	private String name;
	private String matrial;
	private int gram;
	private int price;
	private int cnt;
	private int tot;
	private int computeTotal;
		Bread(){
		this("빵", "밀가루", 90, 900, 1);
	}
		Bread(String name){
		this(name, "밀가루", 90, 900, 1);
	}
		Bread(String name,String matrial){
		this(name, matrial, 90, 900, 1);
		}
		Bread(String name,String matrial,int gram){
		this(name, matrial, gram, 900, 1);
		}
		Bread(String name,String matrial,int gram,int price){
			this(name, matrial, gram, price, 1);
		}
		Bread(String name,String matrial,int gram,int price, int cnt){
		this.name = name;
		this.matrial = matrial;
		this.gram = gram;
		this.price = price;
		this.cnt = cnt;}
		
		public int computeTotal( ) {	//매개변수 없는경우
			return this.price*this.cnt;
		}
		public int computeTotal(int price) {	//매개변수가 가격만 있는경우
			return this.price*this.cnt;
		}
		public int computeTotal(int price, int cnt ) {	//매개변수가 둘 다 있는 경우
			return this.price*this.cnt;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMatrial() {
			return matrial;
		}
		public void setMatrial(String matrial) {
			this.matrial = matrial;
		}
		public int getGram() {
			return gram;
		}
		public void setGram(int gram) {
			this.gram = gram;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getCnt() {
			return cnt;
		}
		public int getTot() {
			return tot;
		}
		public void setTot(int tot) {
			this.tot = tot;
		}

		

		
}
