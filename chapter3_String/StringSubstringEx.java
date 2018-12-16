package chapter3_String;

public class StringSubstringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "1234-56788";
		int std = ssn.indexOf("-");
		String firstName = ssn.substring(0, std);
		System.out.println(firstName);
		
		String lastName = ssn.substring(std + 1);
		System.out.println(lastName);
		
		
		String str = "c:/temp/test/a.txt";
		int loc = str.lastIndexOf("/");
		String dir = str.substring(loc + 1);
		System.out.println(dir);
	}

}
