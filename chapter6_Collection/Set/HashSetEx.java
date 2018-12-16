package chapter6_Collection.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		System.out.println(set.add("java"));
		set.add("jdbc");
		set.add("servelt/jsp");
		System.out.println(set.add("java"));
		set.add("ibatis");
		
		int size = set.size();
		System.out.println("size : " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		
		for(String str : set)
			System.out.println(str);
		
		System.out.println("정렬을 위해 ArrayList로 변환");
		List<String> list = new ArrayList<>(set);
		for(String str : list)
			System.out.println(str);
		
		set.clear();
	}

}
