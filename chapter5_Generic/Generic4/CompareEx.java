package chapter5_Generic.Generic4;

public class CompareEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Integer, String> p1 = new Pair(1, "hotteok");
		Pair<Integer, String> p2 = new Pair(1, "hotteok");
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		if(result1) System.out.println("same");
		else System.out.println("not same");
		
		Pair<String, String> p3 = new Pair("user1", "hotteok");
		Pair<String, String> p4 = new Pair("user2", "hotteok");
		boolean result2 = Util.compare(p3, p4);
		if(result2) System.out.println("same");
		else System.out.println("not same");
	}

}
