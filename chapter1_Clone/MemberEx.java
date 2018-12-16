package chapter1_Clone;

public class MemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member original = new Member("50", "hotteok");
		Member cloned = original.getMember();
		cloned.id ="500";
	
		System.out.println(cloned);
		System.out.println();
		System.out.println(original);
	}

}
