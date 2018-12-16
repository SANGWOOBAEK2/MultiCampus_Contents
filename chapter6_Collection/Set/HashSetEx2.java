package chapter6_Collection.Set;

import java.util.HashSet;
import java.util.Set;

import chapter6_Collection.ArrayList.Member;

public class HashSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("hotteok", 20));
		set.add(new Member("hotteok", 20));
		
		System.out.println("total number : " + set.size());
	}

}
