package sec1;

public class Car {
	String name,company,fuel,style;
	int tire, speed, num, usetime, oil;

	Car() {
		this("이름", "제작사", "연료", "차종", 4, 0, 0, 0);
	}
	Car(String name) {
		this(name, "제작사", "연료", "차종", 4, 0, 0, 0);
	}
	Car(String name, String company) {
		this(name, company, "연료", "차종", 4, 0, 0, 0);
	}	
	Car(String name, String company, String fuel) {
		this(name, company, fuel, "차종", 4, 0, 0, 0);
	}
	Car(String name, String company, String fuel,String style) {
		this(name, company, fuel, style, 4, 0, 0, 0);
	}
	Car(String name, String company, String fuel,String style, int tire, int speed) {
		this(name, company, fuel, style, tire, speed, 0, 0);
	}
	Car(String name, String company, String fuel,String style, int tire, int speed, int num, int usetime) {
		this(name, company, fuel, style, tire, speed, num, 0, 0);
	}
	Car(String name, String company, String fuel,String style, int tire, int speed, int num, int usetime, int oil) {
		this.name = name;
		this.company = company;
		this.fuel = fuel;
		this.tire = tire;
		this.speed = speed;
		this.num = num;
		this.usetime = usetime;
		this.style = style;
		this.oil = oil;
		
	}
	float a = 0.0f,b = 0.0f;
	
		public void computeMoney() {System.out.println("주차 시간과 차 종을 입력해주세요.");		
		}
		public void computeMoney(int usetime) {System.out.println("차 종을 입력해주세요.");		
		}
		public void computeMoney(int usetime, String type) {
			if(style=="경차") a+=1000f;	
			else if(style=="승용차") a+=1200f;
			else if(style=="승합차") a+=1400f;
			else if(style=="화물차") a+=1600f;		
			System.out.println(name+"의 주차요금은 "+(a*usetime)+"원 입니다.");
		}
		public void computeFuel() {System.out.println("주유(충전)량과 연료의 종류를 입력해주세요.");}
		public void computeFuel(int oil) {System.out.println("연료의 종류를 입력해주세요.");}
		public void computeFuel(int oil,String fuel) {
			if (fuel=="경유")b+=1735f;
			else if (fuel=="등유")b+=784.40f;
			else if (fuel=="휘발유")b+=2203.69f;
			else if (fuel=="가스")b+=759.77f;
			else if (fuel=="전기")b+=309.1f;
			else if (fuel=="수소")b+=292.9f;
			System.out.println(name+" 차량은 "+oil+" 만큼 "+fuel+"를 주유(충전)했으며, 주유소 이용 요금은 "+(b*oil)+"원 입니다.");
		}
			
		
		
		
		
		
		public int getOil() {
			return oil;
		}
		public void setOil(int oil) {
			this.oil = oil;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCompany() {
			return company;
		}
		public void setCompany(String company) {
			this.company = company;
		}
		public String getFuel() {
			return fuel;
		}
		public void setFuel(String fuel) {
			this.fuel = fuel;
		}
		public String getStyle() {
			return style;
		}
		public void setStyle(String style) {
			this.style = style;
		}
		public int getTire() {
			return tire;
		}
		public void setTire(int tire) {
			this.tire = tire;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public int getUsetime() {
			return usetime;
		}
		public void setUsetime(int usetime) {
			this.usetime = usetime;
		}

	

	
	
}
