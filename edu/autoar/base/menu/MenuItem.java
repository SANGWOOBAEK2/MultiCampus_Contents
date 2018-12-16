package edu.autoar.base.menu;

import edu.autoar.base.command.Command;

public class MenuItem {
	private String title;
	private String hotKey;
	private Command command;
	
	public MenuItem(String hotKey, String title, Command command) {
		super();
		this.title = title;
		this.hotKey = hotKey;
		this.command = command;
	}

	public String getTitle() {
		return title;
	}

	public String getHotKey() {
		return hotKey;
	}

	public Command getCommand() {
		return command;
	}
	
	public void execute() throws Exception {
			command.execute();
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s(%s)", title, hotKey);
	}
	
	
}
