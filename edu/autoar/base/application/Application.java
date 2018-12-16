package edu.autoar.base.application;

import edu.autoar.base.menu.MenuBar;
import edu.autoar.base.util.Input;

public class Application {
	MenuBar mainMenu;

	public Application() {
		// TODO Auto-generated constructor stub
		mainMenu = new MenuBar();
		createMenu(mainMenu);
	}

	protected void createMenu(MenuBar menu) {
		//add기능을 수행해야 하지만 추상화로서 공통부분!따라서 직접 정의가 아닌 상속이용!
	}
	
	public void run() {
		while (true) {
			mainMenu.print();
			String sel = Input.getString("선택 : ");
			try {
				mainMenu.execute(sel);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
