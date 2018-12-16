package chapter6_Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashpMapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("hotteok", 10);
		map.put("apple", 20);
		map.put("grape", 30);
		map.put("apple", 40);
		System.out.println("total entry num : " + map.size());
		
		System.out.println("apple : " + map.get("apple"));
		
		Set<String> set = map.keySet();
		for(String strKey : set) {
			String key = strKey;
			Integer value = map.get(key); //int로 하지 말것! <- key없을 시 null이 리턴되어서
			System.out.println("key : " + strKey + ", value : " + value);
		}
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key : " + key + ", value : " + value);
		}
	}
}
