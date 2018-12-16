package chapter3_String;

public class StringCharAtEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "891222-1158000";
		char sex = ssn.charAt(7);
		switch(sex) {
		case '1':
		case '3':
			System.out.println("male");
			break;
		case '2':
		case '4':
			System.out.println("female");
			break;
		}
	}

}
