package chapter7_Command;

import edu.autoar.base.command.Command;
import edu.autoar.base.util.Input;

public class ExitCommand implements Command {

	@Override
	public void execute() throws Exception {
		// TODO Auto-generated method stub
		String answer = Input.getString("정말 종료할까요(y/n)?");
		if (answer.equalsIgnoreCase("y")) {
			System.out.println("종료합니다.");
			System.exit(0);
		}
	}

}
