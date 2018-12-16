package chapter3_String;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "1234567891111";
		int length = ssn.length();
		
		String str = "";
		for(int i = ssn.length() - 1; i >= 0; i--) {
			str += ssn.charAt(i);
		}
		System.out.println(str);
		
		if(length == 13) {
			System.out.println("ok");
		}else {
			System.out.println("no");
		}
	}

}
	