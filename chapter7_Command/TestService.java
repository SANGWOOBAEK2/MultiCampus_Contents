package chapter7_Command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import chapter6_Collection.ArrayList.Member;

public class TestService {
	private static TestService instance = new TestService();
	private List<Member> list;
	
	private TestService() {
		// TODO Auto-generated constructor stub
		list = Member.getTestList();
	}
	
	public static TestService getInstance() {
		
		return instance;
	}
	
	public List<Member> getList(){
		return list;
	}
	public void open(String fpath) {
		Collections.shuffle(list);
	}
	
	public void close(String fpath) {
		
	}
	public List<String> getRegion(){
		Set<String> set = new HashSet<>();
		for(Member member  : list) {
			set.add(member.getRegion());
		}
		return new ArrayList<>(set);
	}
	public List<Member> getMemberList(String region){
		List<Member> tempList = new ArrayList<>();
		for(Member m : list) {
			if(m.getRegion().equals(region)) {
				tempList.add(m);
			}
		}
		return tempList;
	}
	
}
