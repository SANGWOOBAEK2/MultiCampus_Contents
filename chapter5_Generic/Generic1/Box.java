package chapter5_Generic.Generic1;

public class Box {
	private Object obj; //뭐가 들어올지 모름
	
	public void set(Object obj) {
		this.obj = obj;
	}
	public Object get() {
		return obj;
	}
}
