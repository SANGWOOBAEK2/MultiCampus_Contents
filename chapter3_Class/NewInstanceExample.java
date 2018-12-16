package chapter3_Class;

public class NewInstanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class[] cls = {chapter3_Class.SendAction.class, chapter3_Class.ReceiveAction.class};
		
		try {
			Action action = (Action) cls[0].newInstance();
			action.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
