package sec1;

import java.util.HashMap;

//Student.name = "여승원";	name:key, "여승원" = value
class Key{
	public int number;
	public String value;
	Key(int number){this.number=number;}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return number;
	
		
	}
	@Override
	public String toString() {
		return number+" : "+value;
	}
	}
	

public class ObjectEx3 {
	public static void main(String[] args) {
		HashMap<Key, String> hash1 = new HashMap<>();
		hash1.put(new Key(200), "여승원");
		
		String value = hash1.get(new Key(200));
		System.out.println(value);
		
		Key k = new Key(100);
		k.value = "여승원1";
				System.out.println(k.toString());
	}
}
