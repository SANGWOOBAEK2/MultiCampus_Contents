package chapter5_Generic.Generic5;

public class BoundedTypeParameterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = Util.compare("a", "b");
		
		int result1 = Util.compare(10, 10);
		System.out.println(result1);
		
		int result2 = Util.compare(10.5, 20);
		System.out.println(result2);
	}

}
