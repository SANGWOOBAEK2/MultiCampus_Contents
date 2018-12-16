package chapter7_Command;

import edu.autoar.base.application.Application;
import edu.autoar.base.menu.MenuBar;
import edu.autoar.base.menu.MenuItem;

public class TestApplication extends Application {
	
	public TestApplication() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
	@Override
	protected void createMenu(MenuBar menu) {
		// TODO Auto-generated method stub
		System.out.println("add execution");
		menu.add(new MenuItem("o", "Open", new FileOpenCommand()));
		menu.add(new MenuItem("c", "Close", new FileCloseCommand()));
		menu.add(new MenuItem("p", "Print", new PrintCommand()));
		menu.add(new MenuItem("e", "Exit", new ExitCommand()));
		menu.add(new MenuItem("rs", "Search", new RegionSearchCommand()));
	}
}
