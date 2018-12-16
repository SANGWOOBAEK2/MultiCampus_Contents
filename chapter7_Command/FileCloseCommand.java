package chapter7_Command;

import edu.autoar.base.command.Command;

public class FileCloseCommand implements Command {

	@Override
	public void execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("파일을 닫습니다.");
		System.out.println();

	}

}
