package chapter7_Command;

import java.util.HashMap;
import java.util.Map;

import edu.autoar.base.application.Application;
import edu.autoar.base.command.Command;
import edu.autoar.base.menu.MenuBar;
import edu.autoar.base.menu.MenuItem;
import edu.autoar.base.util.Input;

public class CommandEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Command> map = new HashMap<>();
		Application app = new TestApplication();
		app.run();
		
	/*	menuBar.add(new MenuItem("o", "Open(o)", new FileOpenCommand()));
		menuBar.add(new MenuItem("c", "Close(c)", new FileCloseCommand()));
		menuBar.add(new MenuItem("p", "Print(p)", new PrintCommand()));
		menuBar.add(new MenuItem("e", "Exit(e)", new ExitCommand()));*/

		/*while (true) {
			menuBar.print();
			String sel = Input.getString("선택 : ");
			try {
				menuBar.execute(sel);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}

}
