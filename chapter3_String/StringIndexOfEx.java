package chapter3_String;

public class StringIndexOfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sbj = "java programming, programming";
		
		int location = sbj.indexOf("programming"); // compared to lastIndexOf
		System.out.println(location);
		
		int loc1 = sbj.lastIndexOf("programming");
		int loc2 = sbj.lastIndexOf("programming", loc1 - 1);
		System.out.println(loc2);
		
		if(sbj.indexOf("java") != -1) {
			System.out.println("someting with java");
		}else {
			System.out.println("no...");
		}
		
	}

}
