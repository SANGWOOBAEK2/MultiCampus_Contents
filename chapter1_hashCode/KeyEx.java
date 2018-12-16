package chapter1_hashCode;

import java.util.HashMap;

public class KeyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		hashMap.put(new Key("1"), "hotteok");
		
		String value = hashMap.get(new Key("1"));
		System.out.println(value);
		
		Object obj = new Object();
		System.out.println(obj);
		System.out.println((obj.hashCode()));
	}

}
