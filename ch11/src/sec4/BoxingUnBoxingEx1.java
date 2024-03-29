package sec4;

public class BoxingUnBoxingEx1 {

	public static void main(String[] args) {
		int i1 = 100;
		float f1 = 62.8f;
		//Boxing : 기본(Primitive) -> 래퍼(Wrapper)
		//short -> Short
		//long -> Long
		//int -> Integer
		//float -> Float
		//double -> Double
		//byte -> Byte
		//char -> Character (잘안쓰임)
		//boolean -> Boolean
		
		//Unboxing : 래퍼(Wrapper) -> 기본(Primitive)
		//반대로
		
		//Boxing
		Integer int1 = new Integer(10002);
		Integer int2 = new Integer("10002");
		Integer int3 = Integer.valueOf(10002);
		Integer int4 = Integer.valueOf(i1);
		
		Float fl1 = new Float(3.14);
		Float fl2 = new Float("3.14");
		Float fl3 = Float.valueOf("3.14");
		Float f14 = Float.valueOf(f1);
		Float f15 = new Float(f1);
		
		//UmBoxing
		int iv1 = int1.intValue();
		int iv2 = int2.intValue();
		
		float fv1 = fl1.floatValue();
		float fv2 = fl2.floatValue();
		
		System.out.println("Int1 == iv1 : "+(int1 == iv1));
		System.out.println("Int1 == iv1 : "+(fl1 == fv1));
		                                                                                                                                                                                    
	}
}