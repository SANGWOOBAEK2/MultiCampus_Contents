package chapter7_Command;

import java.util.List;

import chapter6_Collection.ArrayList.Member;
import edu.autoar.base.command.Command;

public class PrintCommand implements Command {

	@Override
	public void execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("print 합니다.");
		TestService service = TestService.getInstance();
		List<Member> list = service.getList();
		printList(list);
		System.out.println();
	}
	
	public void printList(List<Member> list) {
		int index = 1;
		for(Member m : list) {
			System.out.printf("%-5d%-15s%-10d%-10s\n", index++, m.getUserId(), m.getAge(), m.getRegion());
		}
	}
}
