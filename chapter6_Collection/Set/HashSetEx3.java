package chapter6_Collection.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import chapter6_Collection.ArrayList.Member;

public class HashSetEx3 {

	/*
	 * 중복을 없애고 정렬을 원할 때
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Member> list = Member.getTestList();
		Map<String, List<Member>> mapList = new HashMap<>();
		Set<String> set = new HashSet<String>();
		for(Member m : list) {
			String region = m.getRegion();
			set.add(region);
			List<Member> tempList = mapList.get(region);
			if(tempList == null) {
				tempList = new ArrayList<>();
				mapList.put(region, tempList);
			}
			
			tempList.add(m);
		}
		
		for(String region : mapList.keySet()) {
			List<Member> tempList = mapList.get(region);
			System.out.println("REGION : " + region);
			for(Member member : tempList) {
				System.out.println("\t" + member.getUserId() + ", " + member.getAge());
			}
			
			
		}
		
		
		
	/*	List<String> region_list = new ArrayList<String>(set);
		Collections.sort(region_list);
		for(String str : region_list)
			System.out.println(str);
	*/
	}

}
