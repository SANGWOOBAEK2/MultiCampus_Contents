package chapter1_equals;

public class MemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member obj1 = new Member("a");
		Member obj2 = new Member("a");
		Member obj3 = new Member("b");
	
		if(obj1.equals(obj2)) {
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("same");
		}else {
			System.out.println("difference");
		}
	}

}
