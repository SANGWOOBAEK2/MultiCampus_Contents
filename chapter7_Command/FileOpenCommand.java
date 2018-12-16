package chapter7_Command;

import edu.autoar.base.command.Command;
import edu.autoar.base.util.Input;

public class FileOpenCommand implements Command {

	@Override
	public void execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("파일을 엽니다.");
		String fpath = Input.getString("파일명 : ");
		TestService service = TestService.getInstance();
		service.open(fpath);
		System.out.println(fpath + " 파일 읽기 완료");
		System.out.println();
	}

}
