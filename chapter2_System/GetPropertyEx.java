package chapter2_System;

import java.util.Properties;
import java.util.Set;

public class GetPropertyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");*/
	
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object obj : keys) {
			String key = (String) obj;
			String value = System.getProperty(key);
			System.out.println(value);
		}
	}

}
