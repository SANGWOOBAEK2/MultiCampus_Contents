package chapter3_Class;

import java.lang.reflect.Constructor;

public class CarEx {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class cls = Class.forName("chapter3_Class.Car");
		
		System.out.println(cls.getName());
		System.out.println();
		
		Constructor[] constructors = cls.getDeclaredConstructors();
		for(Constructor cons : constructors) {
			System.out.println(cons.getName());
			Class[] parameters = cons.getExceptionTypes();
			printParameters(parameters);
			System.out.println();
		}
		System.out.println();
	}
	
	private static void printParameters(Class[] parameters) {
		for(int i = 0; i < parameters.length; i++) {
			System.out.println(parameters[i].getName());
			if(i < (parameters.length - 1)) {
				System.out.println(" , ");
			}
		}
		
	}

}
