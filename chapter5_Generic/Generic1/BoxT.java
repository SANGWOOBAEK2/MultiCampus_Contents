package chapter5_Generic.Generic1;

public class BoxT<T> {
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}
