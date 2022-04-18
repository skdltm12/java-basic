package sec2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//List : 순서형, 중복 저장 가능 -> 목록 -> ArrayList, Vector, LinkedList
//Set : 비순서형, 중복 저장 안됨 -> 집합 -> HashSet, TreeSet
//Map : 비순서형, 키와 값으로 저장되며, 키는 중복이 불가능하고 값은 중복이 가능 -> 쌍 -> HashMap,Hashtable
class Student {String name;}
public class CollectionEx1 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>(); //Vector, LinkedList 변환가능
		ArrayList<String> list2 = new ArrayList<String>(); // Vector, LinkedList 변환불능
		
		Set<String> set1 = new HashSet<String>();	//TreeSet 변환가능
		HashSet<String> set2 = new HashSet<String>(); // TreeSet 변환불능

		//Map<Student Integer> map1 = HashMap<>(); -> 다른형태의 Map으로 변환가능
		//HashMap<Student, Integer> map2 = HashMap<>(); -> 다른 형태의 Map으로 변환 불능
	}
}
