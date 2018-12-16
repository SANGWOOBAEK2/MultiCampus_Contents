package chapter7_Command;

import java.util.List;
import java.util.Set;

import chapter6_Collection.ArrayList.Member;
import edu.autoar.base.command.Command;
import edu.autoar.base.util.Input;

public class RegionSearchCommand implements Command {

	@Override
	public void execute() throws Exception {
		// TODO Auto-generated method stub
		TestService service = TestService.getInstance();
		List<String> regionList = service.getRegion();
		int sel = Input.selectList(regionList);
		String region = regionList.get(sel);
		List<Member> list = service.getMemberList(region);
		printList(region, list);
		
	}
	public void printList(String region, List<Member> list) {
		System.out.println("region : " + region);
		int index = 1;
		System.out.printf("[%s] 총 %d명\n", region, list.size());
		System.out.println("--------------------------------");
		System.out.println("No 이름                                                 나이");
		for(Member m : list) {
			System.out.println(m.getUserId() + ", " + m.getAge() + ", " + m.getRegion());
		}
		System.out.println("--------------------------------");
	}
}