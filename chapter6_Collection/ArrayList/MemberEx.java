package chapter6_Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MemberEx {

	public static void main(String[] args) {
		
		List<Member> list = Member.getTestList();
		
		for(Member m : list) {
			System.out.println(m.getUserId() + " / " + m.getAge());
		}
		
		
		/*
		boolean r = list.contains(new Member("hong 0", 40));
		System.out.println(r); //object의 default equals로...

		Collections.sort(list);
		for (Member m : list) {
			System.out.println(m.getUserId() + ", " + m.getAge());
		}
		System.out.println();

		Collections.reverse(list);
		for (Member m : list) {
			System.out.println(m.getUserId() + ", " + m.getAge());
		}
		System.out.println();

		Collections.sort(list, new Comparator<Member>() {

			@Override
			public int compare(Member o1, Member o2) {
				// TODO Auto-generated method stub
				int result = o1.getUserId().compareTo(o2.getUserId());
				if (result == 0) {
					return o1.getAge() - o2.getAge();
				}
				return result;
			}
			
		});
		
		for (Member m : list) {
			System.out.println(m.getUserId() + ", " + m.getAge());
		}
		*/

	}
}
