package chapter3_String;

import java.util.StringTokenizer;

public class StringTokenAndSplitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "a&b,c,%d";
		String arr[] = test.split("&|,|%");
		
		for(String str : arr){
			System.out.println(str);
		}
		
		String test2 = "hotteok/sangwoo%apple";
		StringTokenizer st = new StringTokenizer(test2, "/|%");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		
	}

}
