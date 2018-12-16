package chapter6_Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = Arrays.asList("a", "b", "c");// read only
		//list1.add("d");
		
		list1 = new ArrayList<>(list1);
		list1.add("d");
		
		for(String str : list1)
			System.out.println(str);
	}

}
