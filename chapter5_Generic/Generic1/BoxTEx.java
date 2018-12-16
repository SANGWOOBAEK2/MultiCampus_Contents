package chapter5_Generic.Generic1;

public class BoxTEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxT<String> box1 = new BoxT<String>();
		box1.set("hello");
		String str = box1.get();
		System.out.println(str);
		
		BoxT<Integer> box2 = new BoxT();
		box2.set(100);
		System.out.println(box2.get());
		
		BoxT<Apple> box3 = new BoxT();
		box3.set(new Apple());
		System.out.println(box3.get());
		
	}

}
