package chapter5_Generic.Generic3;

public class BoxingMethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box1 = Util.boxing(100);
		int intValue = box1.getT();
		
		Box<String> box2 = Util.<String> boxing("100");
		String stringValue = box2.getT();
		
		System.out.println(intValue + ", " + stringValue);
	}
}