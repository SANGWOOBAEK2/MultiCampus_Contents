package chapter6_Collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("jdbc");
		list.add("servlet");
		list.add("ibatis");
		
		int size = list.size();
		System.out.println(size);
		
		String skill = list.get(2);
		System.out.println(skill);
		
		for(String str : list)
			System.out.println(str);
		System.out.println();
		list.remove(2);
		list.remove(2);
		list.remove("java");
		
		for(String str : list)
			System.out.println(str);
	}

}
